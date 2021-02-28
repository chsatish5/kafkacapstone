package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Products;

@RestController
@RequestMapping("/test")
public class KafkaController {
	@Autowired
    private KafkaTemplate<String, Products> 
        kafkaTemplate; 
  
    private static final String TOPIC 
        = "Products"; 
    
    @GetMapping("/") 
       public void postToTopicM()
       {
    	 System.out.println("test");
       }
   @GetMapping("/publish") 
      public String postToTopic()
      
    { 
    	int PogId = 100;
    	String Supc = "Supc";
    	String Brand = "B100";
    	String Description = "D100";
    	int Size = 100;
    	String Category = "C100";
    	String Sub_Category= "S100";
    	int Price = 100;
    	int Quantity = 100;
    	String Country = "CN100";
    	String Seller_Code= "SL100";
    	int Stock =100;
        kafkaTemplate.send( 
            TOPIC, 
            new Products( PogId,  Supc,  Brand,  Description,  Size,  Category,
        			 Sub_Category,  Price,  Quantity,  Country,  Seller_Code,  Stock)); 
  
        return "Published successfully"; 
    } 

} 
