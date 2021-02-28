package com.example.KafkaBootWork;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Products;

public interface ProductRepository  extends CrudRepository<Products, Integer> {

}