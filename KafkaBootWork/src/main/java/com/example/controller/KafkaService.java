package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.KafkaBootWork.ProductRepository;
import com.example.model.Products;

@Service
	public class KafkaService { 
	@Autowired
	ProductRepository productRepository;
	    // Annotation required to listen 
	    // the message from Kafka server 
	    @KafkaListener(topics = "Products", 
	                   groupId = "id", containerFactory 
	                                   = "productListner") 
	    public void
	    publish(Products product) 
	    { 
	    	productRepository.save(product);
	    	System.out.println(product);
	    } 
	} 

