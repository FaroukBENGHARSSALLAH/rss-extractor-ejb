package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml;

import java.util.LinkedList;

import javax.ejb.Local;

import com.farouk.bengharssallah.rss.parser.cnbc.CNBCNews;

@Local
public interface CNBCRSSSessionBean {
	
     public  LinkedList<CNBCNews>  getCNBCTopStories();
	
	 public  LinkedList<CNBCNews>  getCNBCMoneyNews()  ;

}
