package com.caibang.www.common.basicModel;

import lombok.Data;

/**
 * 相应类
 */
@Data
public class Msg {
    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 成功代码:0success;-1false
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * object
     */
    private Object obj;

    public Msg() {
        this.success = true;
        this.code = 0;
    }

    public Msg(boolean success, Integer code, String msg, Object obj) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }


    public Msg(boolean success, Integer code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public Msg(boolean success, Integer code, Object obj) {
        this.success = success;
        this.code = code;
        this.obj = obj;
    }

    public Msg(boolean success, Integer code) {
        this.success = success;
        this.code = code;
    }

    /**
     * 操作成功
     *
     * @return
     */
    public static Msg success() {
        return new Msg(true, 0);
    }

    /**
     * 操作成功
     *
     * @param msg 描述说明
     * @return
     */
    public static Msg success(String msg) {
        return new Msg(true, 0, msg);
    }


    /**
     * 操作成功
     *
     * @param obj 参数
     * @return
     */
    public static Msg success(Object obj) {
        return new Msg(true, 0, obj);
    }

    /**
     * 操作成功
     *
     * @param msg 描述说明
     * @param obj 参数
     * @return
     */
    public static Msg success(String msg, Object obj) {
        return new Msg(true, 0, obj);
    }

    /**
     * 操作失败
     *
     * @return
     */
    public static Msg error() {
        return new Msg(false, -1);
    }

    /**
     * 操作失败
     *
     * @param msg 描述说明
     * @return
     */
    public static Msg error(String msg) {
        return new Msg(false, -1, msg);
    }


    /**
     * 操作失败
     *
     * @param obj 参数
     * @return
     */
    public static Msg error(Object obj) {
        return new Msg(false, -1, obj);
    }

    /**
     * 操作失败
     *
     * @param msg 描述说明
     * @param obj 参数
     * @return
     */
    public static Msg error(String msg, Object obj) {
        return new Msg(false, -1, obj);
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
