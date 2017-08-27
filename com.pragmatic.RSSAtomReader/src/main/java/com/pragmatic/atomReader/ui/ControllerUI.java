package com.pragmatic.atomReader.ui;

import java.util.List;

public class ControllerUI {

	public List<String> rssList;
	public List<String> shortNewsList;
	public List<String> fullNewsList;
	public List<String> unreadNews;
	
	

	public List<String> getRssList(){
		rssList.add("CNN");
		rssList.add("BBC");
		rssList.add("Sky News");
		rssList.add("Fox News");
		return rssList;
	}
	
	public List<String> getShortNewsList(){
		return shortNewsList;
	}
	
	public List<String> getFullNewsList(){
		return fullNewsList;
	}
	
	public List<String> getUnreadNews(){
		return unreadNews;
	}
	
}
