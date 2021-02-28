package com.example.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.model.Products;

@Service
	public class KafkaService { 
	  
	    // Annotation required to listen 
	    // the message from Kafka server 
	    @KafkaListener(topics = "JsonTopic", 
	                   groupId = "id", containerFactory 
	                                   = "studentListner") 
	    public void
	    publish(Products product) 
	    { 
	        System.out.println("New Entry: "
	                           + product); 
	    } 
	} 

