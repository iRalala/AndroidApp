package com.rssaggregator.android.network;

import com.rssaggregator.android.network.model.Category;
import com.rssaggregator.android.network.model.Channel;
import com.rssaggregator.android.network.model.Credentials;
import com.rssaggregator.android.network.model.Item;

public interface RssApi {

  void logIn(Credentials credentials);

  void signUp(Credentials credentials);

  void fetchData();

  void addCategory(String categoryName);

  void subscribeFeed(Category category, String rssLink);

  void unsubscribeFeed(Integer channelId);

  //
  //
  // Update Read Items. Mark items as read.
  //
  //
  void updateReadAllItems();

  void updateReadItemsByChannelId(Channel channel);

  void updateReadStateItem(Item item, Boolean state);

  void updateStarStateItem(Item item, Boolean state);
}
