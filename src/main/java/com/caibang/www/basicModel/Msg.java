package com.caibang.www.basicModel;

/**
 * 相应类
 */
public class Msg {
	private boolean success ;			//是否成功
	
	private String msg;					// 提示信息
	
	private Object obj;					// 返回对象
	
	public Msg(){
		this.success = true;
		this.msg = "成功!";
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
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
		return "Msg [success=" + success + ", msg=" + msg + ", obj=" + obj + "]";
	}
}
