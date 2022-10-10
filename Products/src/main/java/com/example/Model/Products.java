package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products_details")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id ;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="weight")
	private String productWeight;
	
	@Column(name="description")
	private String productDescription;
	public Products(){ 
		
	}
	public Products(long id, String productName, String productWeight, String productDescription ){
		super();
		this.id=id;
		this.productName=productName;
		this.productWeight=productWeight;
		this.productDescription=productDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	
	


}