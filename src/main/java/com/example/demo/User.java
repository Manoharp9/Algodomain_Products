package com.example.demo;


import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String ProductName;
    @Column
    private String ProductType;
    @Column
    private String ProductCategory;
    @Column
    private int ProductPrice;
    @Column
    private int Discount;
    @Column
    private int Gst;
    @Column
    private int Dcharge;
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String productName, String productType, String productCategory, int productPrice, int discount,
			int gst, int dcharge) {
		super();
		this.id = id;
		ProductName = productName;
		ProductType = productType;
		ProductCategory = productCategory;
		ProductPrice = productPrice;
		Discount = discount;
		Gst = gst;
		Dcharge = dcharge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public String getProductCategory() {
		return ProductCategory;
	}

	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	public int getDiscount() {
		return Discount;
	}

	public void setDiscount(int discount) {
		Discount = discount;
	}

	public int getGst() {
		return Gst;
	}

	public void setGst(int gst) {
		Gst = gst;
	}

	public int getDcharge() {
		return Dcharge;
	}

	public void setDcharge(int dcharge) {
		Dcharge = dcharge;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ProductName=" + ProductName + ", ProductType=" + ProductType + ", ProductCategory="
				+ ProductCategory + ", ProductPrice=" + ProductPrice + ", Discount=" + Discount + ", Gst=" + Gst
				+ ", Dcharge=" + Dcharge + "]";
	}
    
	
	
}
    
    
    
    
