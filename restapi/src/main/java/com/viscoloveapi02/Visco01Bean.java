package com.viscoloveapi02;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="viscolove2020")
public class Visco01Bean {
	@Id
	private int id;
	private String pname;
	private double price;
	public Visco01Bean(int id, String pname, double price) {

		this.id = id;
		this.pname = pname;
		this.price = price;
	}
	public Visco01Bean() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Visco01Bean [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}



}
