package com.example.demo.topic_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicsController {

	@Autowired
	private TopicsService topicservice ; 
	
	
	@RequestMapping("/topics")
	public List <Topics> allTopics (){
		 
		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopics(@PathVariable String id) {
		return topicservice.getTopics(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/topics")
	public void addTopic(@RequestBody Topics topic) {
		 topicservice.addTopics(topic);
		
	}
	@RequestMapping(method = RequestMethod.PUT , value ="/topics/{id}")
	public void updateTopics(@RequestBody Topics topic ,@PathVariable String id) {
		topicservice.updateTopics(topic,id);
	}
	@RequestMapping(method = RequestMethod.DELETE , value ="/topics/{id}")
	public void deleteTopics(@PathVariable String id) {
		topicservice.deleteTopics(id);
	}
	
		
}
