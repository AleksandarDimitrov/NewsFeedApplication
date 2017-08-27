package com.pragmatic.atomReader.ui;

import java.util.List;

public class Table {

	private List<String> tableRss;
	private List<String> tableNews;
	
	
	public Table(List<String> tableRss, List<String> tableNews) {
		super();
		this.tableRss = tableRss;
		this.tableNews = tableNews;
	}


	public List<String> getTableRss() {
		return tableRss;
	}


	public void setTableRss(List<String> tableRss) {
		this.tableRss = tableRss;
	}


	public List<String> getTableNews() {
		return tableNews;
	}


	public void setTableNews(List<String> tableNews) {
		this.tableNews = tableNews;
	}
}
