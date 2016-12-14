package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.implementation;

import java.util.LinkedList;

import javax.ejb.Stateless;

import com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.MarketRSSSessionBean;
import com.farouk.bengharssallah.rss.parser.market.MarketNews;
import com.farouk.bengharssallah.rss.parser.market.MarketParser;

@Stateless(name="MarketRSSEjb")
public class MarketRSSSessionBeanImplementation implements MarketRSSSessionBean {
	
	private static final String market_rss = "http://moneymovesmarkets.com/journal/rss.xml";
	
	private LinkedList<MarketNews> market_news_list = null;
	

	@Override
	public LinkedList<MarketNews> getMarketNews()  {
										if(market_news_list == null){
											                market_news_list = new LinkedList<MarketNews>();
												            MarketParser parser = new MarketParser(market_rss);
												            market_news_list = parser.getNews();
								                                   }
								        return market_news_list;
	                  }

    }
