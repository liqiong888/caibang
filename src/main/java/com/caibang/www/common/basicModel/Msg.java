package com.caibang.www.common.basicModel;

/**
 * 相应类
 */
public class Msg {

    private boolean success;//成功

    private String code;//成功代码

    private String msg;                    // 提示信息

    private Object obj;                    // 返回对象


    public Msg(boolean success, String code, String msg, Object obj) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }


    public Msg(boolean success, String code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public Msg(boolean success, String code, Object obj) {
        this.success = success;
        this.code = code;
        this.obj = obj;
    }

    public Msg(boolean success, String code) {
        this.success = success;
        this.code = code;
    }

    /**
     * 操作成功
     *
     * @return
     */
    public static Msg success() {
        return new Msg(true, "0");
    }

    /**
     * 操作成功
     *
     * @param msg 描述说明
     * @return
     */
    public static Msg success(String msg) {
        return new Msg(true, "0", msg);
    }


    /**
     * 操作成功
     *
     * @param obj 参数
     * @return
     */
    public static Msg success(Object obj) {
        return new Msg(true, "0", obj);
    }

    /**
     * 操作成功
     *
     * @param msg 描述说明
     * @param obj 参数
     * @return
     */
    public static Msg success(String msg, Object obj) {
        return new Msg(true, "0", obj);
    }

    /**
     * 操作失败
     *
     * @return
     */
    public static Msg error() {
        return new Msg(false, "-1");
    }

    /**
     * 操作失败
     *
     * @param msg 描述说明
     * @return
     */
    public static Msg error(String msg) {
        return new Msg(false, "-1", msg);
    }


    /**
     * 操作失败
     *
     * @param obj 参数
     * @return
     */
    public static Msg error(Object obj) {
        return new Msg(false, "-1", obj);
    }

    /**
     * 操作失败
     *
     * @param msg 描述说明
     * @param obj 参数
     * @return
     */
    public static Msg error(String msg, Object obj) {
        return new Msg(false, "-1", obj);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
