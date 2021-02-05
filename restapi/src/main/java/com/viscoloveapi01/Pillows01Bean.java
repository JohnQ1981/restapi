package com.viscoloveapi01;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ViscoPillows")
public class Pillows01Bean {
	@Id
	private int p_id;
	private String p_name;
	private String p_type;
	public Pillows01Bean() {

	}
	public Pillows01Bean(int p_id, String p_name, String p_type) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_type = p_type;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	@Override
	public String toString() {
		return "Pillows01Bean [p_id=" + p_id + ", p_name=" + p_name + ", p_type=" + p_type + "]";
	}





}
