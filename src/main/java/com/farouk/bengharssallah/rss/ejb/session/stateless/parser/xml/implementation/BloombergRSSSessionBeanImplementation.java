package com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.implementation;

import java.util.LinkedList;

import javax.ejb.Stateless;

import com.farouk.bengharssallah.rss.ejb.session.stateless.parser.xml.BloombergRSSSessionBean;
import com.farouk.bengharssallah.rss.parser.bloomberg.BloombergNews;
import com.farouk.bengharssallah.rss.parser.bloomberg.BloombergParser;

@Stateless(name="BloombergRSSSEjb")
public class BloombergRSSSessionBeanImplementation implements BloombergRSSSessionBean{
	
	private static final String bloomberg_etf_stories_rss = "http://www.bloomberg.com/feeds/podcasts/etf_report.xml";
	
	private LinkedList<BloombergNews> bloomberg_etf__stories_list = null;

	@Override
	public LinkedList<BloombergNews> getBloombergETFStories()  {
												if(bloomberg_etf__stories_list == null){
													            bloomberg_etf__stories_list = new LinkedList<BloombergNews>();
													            BloombergParser parser = new BloombergParser(bloomberg_etf_stories_rss);
													            bloomberg_etf__stories_list = parser.getNews();
										                                  }
										return bloomberg_etf__stories_list;
	                                }

           }
