package com.pragmatic.atomReader.console;

import java.util.List;

public interface FeedController {

	public void addFeedSource(String URL);

	public void removeFeedSource(Channel feed);

	public List<Channel> returnAllFeedSources();

	public List<NewsItem> returnAllNews(Channel feed);

	public List<NewsItem> returnUnreadNews();

	public String newsLink(NewsItem item);
}
