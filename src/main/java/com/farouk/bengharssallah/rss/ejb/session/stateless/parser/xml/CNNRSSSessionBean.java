package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml;

import java.util.LinkedList;

import javax.ejb.Local;

import com.farouk.bengharssallah.rss.parser.cnn.CNNINews;
import com.farouk.bengharssallah.rss.parser.cnn.CNNNews;

@Local
public interface CNNRSSSessionBean  {
	
    public  LinkedList<CNNNews>  getCNNTopStories()  ;
	
	public  LinkedList<CNNNews>  getCNNWorldNews() ;
	
	public  LinkedList<CNNNews>  getCNNSportNews()  ;
	
	public  LinkedList<CNNINews>  getCNNTechnologyNews()  ;
	
	public  LinkedList<CNNNews>  getCNNTravelNews()  ;

}
