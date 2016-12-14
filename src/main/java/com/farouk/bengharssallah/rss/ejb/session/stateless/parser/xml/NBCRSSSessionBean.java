package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml;

import java.util.LinkedList;

import javax.ejb.Local;

import com.farouk.bengharssallah.rss.parser.nbc.NBCNews;

@Local
public interface NBCRSSSessionBean {
	
			    public  LinkedList<NBCNews>  getNBCTopStories() ;
				
				public  LinkedList<NBCNews>  getNBCSportNews()  ;
				
				public  LinkedList<NBCNews>  getNBCTechnologyNews()  ;

}
