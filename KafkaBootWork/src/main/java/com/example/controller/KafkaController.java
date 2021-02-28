package com.example.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Products;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/producer")
public class KafkaController {
	@Autowired
    private KafkaTemplate<String, Products> 
        kafkaTemplate; 
  
    private static final String TOPIC 
        = "Products"; 
    

   @GetMapping("/publish") 
      public String postToTopic() throws Exception
      
    { 

	
	        ObjectMapper objectMapper = new ObjectMapper();
	        Products product = objectMapper.readValue(new File("products.json"), Products.class);
	      	       
        kafkaTemplate.send( 
            TOPIC, 
           product); 
  
        return "Published successfully"; 
    } 

} 
