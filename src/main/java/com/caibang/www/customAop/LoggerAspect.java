package com.caibang.www.customAop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @describe: 定义日志切面
 * @Lazy 注解:容器一般都会在启动的时候实例化所有单实例 bean，如果我们想要 Spring 在启动的时候延迟加载 bean，需要用到这个注解
 * * value为true、false 默认为true,即延迟加载，@Lazy(false)表示对象会在初始化的时候创建
 * @date:2020/3/14
 */
@Aspect
@Component
@Lazy(false)
@Slf4j
public class LoggerAspect {

    /**
     * 定义切入点：对要拦截的方法进行定义与限制，如包、类
     * <p>
     * 1、execution(public * *(..)) 任意的公共方法
     * 2、execution（* set*（..）） 以set开头的所有的方法
     * 3、execution（* com.lingyejun.annotation.LoggerApply.*（..））com.lingyejun.annotation.LoggerApply这个类里的所有的方法
     * 4、execution（* com.lingyejun.annotation.*.*（..））com.lingyejun.annotation包下的所有的类的所有的方法
     * 5、execution（* com.lingyejun.annotation..*.*（..））com.lingyejun.annotation包及子包下所有的类的所有的方法
     * 6、execution(* com.lingyejun.annotation..*.*(String,?,Long)) com.lingyejun.annotation包及子包下所有的类的有三个参数，第一个参数为String类型，第二个参数为任意类型，第三个参数为Long类型的方法
     * 7、execution(@annotation(com.lingyejun.annotation.Lingyejun))
     */
    @Pointcut("@annotation(com.caibang.www.customAop.LoginAop)")
    private void cutMethod() {

    }


    /**
     * 前置通知：在目标方法执行前调用
     */
    @Before("cutMethod()")
    public void begin() {
        System.out.println("----before---loginAop logger:begin");

    }

    /**
     * 后置通知：在目标方法执行后调用，若目标方法出现异常，则不执行
     */
    @AfterReturning("cutMethod()")
    public void afterReturning() {
        System.out.println("----afterReturning---loginAop logger:afterReturning");

    }

    /**
     * 后置/最终通知：无论目标方法在执行过程中出现一场都会在它之后调用
     */
    @After("cutMethod()")
    public void after() {
        System.out.println("----after---loginAop logger:after");
    }

    /**
     * 异常通知：目标方法抛出异常时执行
     */
    @AfterThrowing("cutMethod()")
    public void afterThrowing() {
        System.out.println("----afterThrowing---loginAop logger:afterThrowing");
    }

    /**
     * 环绕通知：灵活自由的在目标方法中切入代码
     *
     * @param joinPoint
     * @throws Throwable
     * @return
     */
    @Around("cutMethod()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        //获取目标方法的名称
        String methodName = joinPoint.getSignature().getName();
        //获取方法传入的参数
        Object[] params = joinPoint.getArgs();
        LoginAop loginaop = getDeclaredAnnotation(joinPoint);
        System.out.println("------around----loginAop logger--->method name:" + methodName + "args:" + params+"-----------");
        //执行原方法
        try {
        return joinPoint.proceed();

//        //模拟验证
//        if (params != null && params.length > 0 && params[0].equals("admin")) {
//            System.out.println("-----around---loginAop  logger---"  + "auth success");
//        } else {
//            System.out.println("-----around---loginAop  logger---" + "auth failed");
//        }
        }catch (Exception e){
            log.error("----切面异常----"+e.getMessage());
        }
        return null;
    }


    /**
     * 获取方法中的注解
     *
     * @param joinPoint
     * @return
     * @throws NoSuchMethodException
     */
    public LoginAop getDeclaredAnnotation(ProceedingJoinPoint joinPoint) throws NoSuchMethodException {
        //获取方法明
        String methodName = joinPoint.getSignature().getName();
        //反射获取目标类
        Class<?> targetClass = joinPoint.getTarget().getClass();
        //拿到方法对应的参数类型
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Class<?>[] parameterTypes = methodSignature.getParameterTypes();
        //根据类、方法、参数类型（重载）获取到方法的具体信息
        Method method = targetClass.getMethod(methodName, parameterTypes);
        //拿到方法定义的注解信息
        LoginAop declaredAnnotation = method.getDeclaredAnnotation(LoginAop.class);
        //返回
        return declaredAnnotation;

    }


}
