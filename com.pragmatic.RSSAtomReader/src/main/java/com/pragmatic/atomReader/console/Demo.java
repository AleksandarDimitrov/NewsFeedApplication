package com.pragmatic.atomReader.console;

import java.util.List;

public class Demo {
	public static void main(String[] args) {

		RomeFeedController rc = new RomeFeedController();
		

		List<Channel> returnAllFeedSources = rc.returnAllFeedSources();
		for (Channel channel : returnAllFeedSources) {
			String modifyFeedLink = rc.modifyFeedLink(channel);
			System.out.println("\nLink before modification: "+ channel.getLink());
			System.out.println("Link after modification: "+ modifyFeedLink+"\n");
			System.out.println("NEWS TITLES :");
			List<NewsItem> returnAllNews = rc.returnAllNews(channel);
			for (NewsItem newsItem : returnAllNews) {
				System.out.println(newsItem.getTitle());
			}
			
		}

		
	}

}
