package com.hsm.model;

public class Product {
	//产品id
	private int id;
	//产品名称
	private String name;
	//产品描述
	private String description;
	//产品数量
	private int quantity;
	public Product(int id, String name, String description, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}
	public Product() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
