package com.caibang.org.BasicModel;

import java.util.List;

/**
 * 分页对象
 * @author lwq
 */
public class Page<T> {

	private int pageCurrent;// 当前页
	private int itemTotal;// 总条数
	private int pageSize;// 分页大小
	private int pageCount;// 总页数
	private int startIndex;// 起始行
	private List<T> Items;// 查询数据
	private List<T> AllItems;// 全部数据
	private boolean success;
	private String msg;
	private Object obj;
	
	public List<T> getAllItems() {
		return AllItems;
	}

	public void setAllItems(List<T> allItems) {
		AllItems = allItems;
	}

	public Page() {
		this.success = true;
		this.msg = "成功!";
	}

	public int getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
		setStartIndex();
	}

	public int getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
		this.pageCount = this.itemTotal % this.pageSize == 0 ? this.itemTotal / this.pageSize
				: this.itemTotal / this.pageSize + 1;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		setStartIndex();
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<T> getItems() {
		return Items;
	}

	public void setItems(List<T> items) {
		this.Items = items;
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

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex() {
		if (this.pageCurrent != 0 && this.pageSize != 0) {
			this.startIndex = (this.pageCurrent - 1) * this.pageSize;
		} else {
			this.startIndex = 0;
		}
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	@Override
	public String toString() {
		return "Page [pageCurrent=" + pageCurrent + ", itemTotal=" + itemTotal + ", pageSize=" + pageSize
				+ ", pageCount=" + pageCount + ", startIndex=" + startIndex + ", Items=" + Items + ", success="
				+ success + ", msg=" + msg + ", obj=" + obj + "]";
	}

}
