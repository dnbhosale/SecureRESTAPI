package com.dn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String code;
	private double discount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Coupon(long id, String code, double discount) {
		super();
		this.id = id;
		this.code = code;
		this.discount = discount;
	}
	
	Coupon(){}

}
