package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml;

import java.util.LinkedList;

import javax.ejb.Local;

import com.farouk.bengharssallah.rss.parser.market.MarketNews;

@Local
public interface MarketRSSSessionBean {
	
      public  LinkedList<MarketNews>  getMarketNews()  ;

}
