package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="BikeInfo")
@Entity

public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String brand;
	private int price;
	private String color;
	private boolean isElectricBike;
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;

	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;

	}
	public void setisElectricBike(boolean isElectricBike) {
		this.isElectricBike=isElectricBike;
	}
	public boolean getisElectricBike() {
		return isElectricBike;
	}

}
