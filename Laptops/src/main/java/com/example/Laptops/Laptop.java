package com.example.Laptops;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "laptop_details")
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private String brand;
	private int price;
	private String model;
	private int ramSize;
	private int romSize;
	private boolean isMadeInIndia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getRomSize() {
		return romSize;
	}
	public void setRomSize(int romSize) {
		this.romSize = romSize;
	}
	public boolean isMadeInIndia() {
		return isMadeInIndia;
	}
	public void setMadeInIndia(boolean isMadeInIndia) {
		this.isMadeInIndia = isMadeInIndia;
	}
	

}
