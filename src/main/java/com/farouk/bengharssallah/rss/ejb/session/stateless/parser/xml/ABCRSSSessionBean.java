package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml;

import java.util.LinkedList;

import javax.ejb.Local;

import com.farouk.bengharssallah.rss.parser.abc.ABCINews;
import com.farouk.bengharssallah.rss.parser.abc.ABCNews;

@Local
public interface ABCRSSSessionBean {
	
         public  LinkedList<ABCNews>  getABCTopStories()  ;
         
         public  LinkedList<ABCNews>  getABCWorldNews() ;
	
	     public  LinkedList<ABCNews>  getABCSportNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCEntertainmentNews() ;
	     
	     public  LinkedList<ABCNews>  getABCArtsNews() ;
	     
	     public  LinkedList<ABCNews>  getABCCommunityNews() ;
	     
	     public  LinkedList<ABCNews>  getABCFamilyNews() ;
	     
	     public  LinkedList<ABCNews>  getABCMusicNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCMoneyNews() ;
	     
	     public  LinkedList<ABCINews>  getABCITechnologyNews();

}
