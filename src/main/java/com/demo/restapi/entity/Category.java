package com.demo.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "product_code",length = 3 )
	private String product_code;
	@Column(name = "name")
	private String name;
	@Column(name ="quntity")
	private int quntity;
	@Column(name ="price")
	private Double price;
	
	public Category() {
		
	}
	
	
	
	public Category(String product_code, String name, int quntity, Double price) {
		super();
		this.product_code = product_code;
		this.name = name;
		this.quntity = quntity;
		this.price = price;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", product_code=" + product_code + ", name=" + name + ", quntity=" + quntity
				+ ", price=" + price + "]";
	}
	

	
}
