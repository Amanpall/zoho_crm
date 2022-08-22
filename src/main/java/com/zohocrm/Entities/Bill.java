package com.zohocrm.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bill")
public class Bill {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
    private long id ;
	  @Column(name = "name" ,nullable =false,length = 50)
	private String name;
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Column(name = "mobile" ,nullable =false,length = 50 ,unique = true)
	private long mobile;
    @Column(name = "Product" ,nullable =false,length = 50)
	private String product;
    @Column(name = "Model" ,nullable =false,length = 50)
	private String model;
    @Column(name = "Discount" ,nullable =false,length = 50)
	private String discount;
    @Column(name = "Prize" ,nullable =false,length = 50)
	private  long prize;
    @Column(name = "Amount" ,nullable =false,length = 50)
	private long totalamount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public long getPrize() {
		return prize;
	}
	public void setPrize(long prize) {
		this.prize = prize;
	}
	public long getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(long totalamount) {
		this.totalamount = totalamount;
	}
}
