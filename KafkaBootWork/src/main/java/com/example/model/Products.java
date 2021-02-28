package com.example.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity 
public class Products {
	
	public int getPogId() {
		return PogId;
	}
	public void setPogId(int pogId) {
		PogId = pogId;
	}
	public String getSupc() {
		return Supc;
	}
	public void setSupc(String supc) {
		Supc = supc;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getSub_Category() {
		return Sub_Category;
	}
	public void setSub_Category(String sub_Category) {
		Sub_Category = sub_Category;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getSeller_Code() {
		return Seller_Code;
	}
	public void setSeller_Code(String seller_Code) {
		Seller_Code = seller_Code;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	@Id
	int PogId;
	String Supc;
	String Brand;
	String Description;
	int Size;
	String Category;
	String Sub_Category;
	int Price;
	int Quantity;
	String Country;
	String Seller_Code;
	int Stock ;
	public Products(int pogId, String supc, String brand, String description, int size, String category,
			String sub_Category, int price, int quantity, String country, String seller_Code, int stock) {
		super();
		PogId = pogId;
		Supc = supc;
		Brand = brand;
		Description = description;
		Size = size;
		Category = category;
		Sub_Category = sub_Category;
		Price = price;
		Quantity = quantity;
		Country = country;
		Seller_Code = seller_Code;
		Stock = stock;
	}

}
