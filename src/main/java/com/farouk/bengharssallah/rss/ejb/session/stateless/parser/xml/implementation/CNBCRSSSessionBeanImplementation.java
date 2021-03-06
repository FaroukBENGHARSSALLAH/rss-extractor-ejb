package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.implementation;

import java.util.LinkedList;

import javax.ejb.Stateless;

import com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.CNBCRSSSessionBean;
import com.farouk.bengharssallah.rss.parser.cnbc.CNBCNews;
import com.farouk.bengharssallah.rss.parser.cnbc.CNBCParser;

@Stateless(name="CNBCRSSEjb")
public class CNBCRSSSessionBeanImplementation implements CNBCRSSSessionBean {
	
	private static final String cnbc_top_stories_rss = "http://www.cnbc.com/id/100003114/device/rss/rss.html";
	private static final String cnbc_money_rss = "http://www.cnbc.com/id/15839069/device/rss/rss.html";
	
	private LinkedList<CNBCNews> cnbc_news_top_stories_list = null;
	private LinkedList<CNBCNews> cnbc_news_money_list = null;

	@Override
	public LinkedList<CNBCNews> getCNBCTopStories()  {
										 if(cnbc_news_top_stories_list == null){
											             cnbc_news_top_stories_list = new LinkedList<CNBCNews>();
											             CNBCParser parser = new CNBCParser(cnbc_top_stories_rss);
											             cnbc_news_top_stories_list = parser.getNews();
								                                    }
								         return cnbc_news_top_stories_list;
	             }

	@Override
	public LinkedList<CNBCNews> getCNBCMoneyNews()  {
										 if(cnbc_news_money_list == null){
											             cnbc_news_money_list = new LinkedList<CNBCNews>();
											             CNBCParser parser = new CNBCParser(cnbc_money_rss);
											             cnbc_news_money_list = parser.getNews();
								                                    }
                                         return cnbc_news_money_list;
	              }

         }
