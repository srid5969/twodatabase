package com.javadevjournal.product.data;

import javax.persistence.*;

@Entity
public class ProductModel {

	@Id
	@Column
	private int id;

	@Column
	private String code;
	@Column
	private String name;
	@Column
	private double price;

	protected ProductModel() {
	}

	public ProductModel(String code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Product[id=%d, code='%s', name='%s', price='%s']", id, code, name, price);
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}