package com.qhit.lh.gr3.hm.exam.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageBean<T> implements Serializable {
	private static final long serialVersionUID = 3509375972998939764L;
	public static String CURRENT_INDEX = "currentIndex";
	public static String PAGE_SIZE = "pageSize";
	public static String INDEX = "index";
	
	/**
	 * 当前页
	 */
	private int currentIndex;
	
	/**
	 * 每页记录数
	 */
	private int pageSize;
	
	/**
	 * 总记录数
	 */
	private int totalNumber;
	
	/**
	 * 总页数
	 */
	private int totalPage;
	
	/**
	 * 下一页
	 */
	private int nextIndex;
	
	/**
	 * 上一页
	 */
	private int preIndex;
	
	/**
	 * 当前页的记录数
	 */
	private List<T> Items;

	/**
	 * @param currentIndex
	 * @param pageSize
	 * @param totalNumber
	 * @param items
	 */
	public PageBean(int currentIndex, int pageSize, int totalNumber,
			List<T> items) {
		super();
		this.currentIndex = currentIndex;
		this.pageSize = pageSize;
		this.totalNumber = totalNumber;
		this.Items = items;
	}
	
	public PageBean(){
		pageSize = 10;
		currentIndex = 1;
		Items = new ArrayList<>();
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public List<T> getItems() {
		return Items;
	}

	public void setItems(List<T> items) {
		Items = items;
	}
	
	/**
	 * 总页数
	 * @return
	 */
	public int getTotalPage(){
		int size = this.totalNumber/this.totalPage;
		if(this.totalNumber%this.pageSize !=0){
			size = size + 1;
		}
		this.totalPage = size;
		
		return totalPage;
	}
	
	/**
	 * 当前的下一页，如果当前页大于等于最后一页
	 * 那下一页就是最后一页
	 * @return
	 */
	public int getNextIndex(){
		if(this.currentIndex >= this.getTotalPage()){
			this.nextIndex = this.currentIndex;
		}else{
			this.nextIndex = this.currentIndex + 1;
		}
		
		return nextIndex;
	}
	
	/**
	 * 当前的上一页，如果当前页小于等于第一页那么上一页为0
	 * @return
	 */
	public int getPreIndex(){
		if(this.currentIndex <= 1){
			this.preIndex = 0;
		}else{
			this.preIndex = this.currentIndex - 1; 
		}
		return preIndex;
	}
	
	
}
