package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml;

import java.util.LinkedList;

import javax.ejb.Local;

import com.farouk.bengharssallah.rss.parser.bloomberg.BloombergNews;

@Local
public interface BloombergRSSSessionBean {
	
        public  LinkedList<BloombergNews>  getBloombergETFStories() ;
	

         }
