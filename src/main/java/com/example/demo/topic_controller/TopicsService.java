package com.example.demo.topic_controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	private List<Topics> topics =  new ArrayList <> (Arrays.asList(new Topics("1","head first","to learn java"),
												new Topics("2" , "c" ,"learn c")))  ;
	
	public List <Topics> getAllTopics() {
		return topics;
	}
	
	public Topics getTopics(String id) {
		return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void  addTopics(Topics topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopics(Topics topic, String id) {
		for(int i = 0 ;i <topics.size();i++) {
			Topics t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopics(String id) {
		// TODO Auto-generated method stub
		for(int i = 0 ;i <topics.size();i++) {
			Topics t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
			}
		}
		
	}
	
}
