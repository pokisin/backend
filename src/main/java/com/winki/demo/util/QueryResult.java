package com.winki.demo.util;

import java.util.List;

public class QueryResult {
	
	private int totalRecods;
	private List<Object> list;
	
	public int getTotalRecods() {
		return totalRecods;
	}
	public void setTotalRecods(int totalRecods) {
		this.totalRecods = totalRecods;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
}
