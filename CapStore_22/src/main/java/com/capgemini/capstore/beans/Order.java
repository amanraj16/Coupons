package com.capgemini.capstore.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "OrderDetail")
public class Order {

	@NotNull
	@OneToOne
	private DummyOrder order;
	@Column(name = "orderDate")
	@NotNull
	private Date orderDate;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	private Customer customer;
	@OneToOne
	@NotNull
	private Merchant merchant;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	private Product product;
	@Column(name = "deliveryStatus")
	@NotNull
	private DeliveryStatus deliveryStatus;
	@Column(name = "productQuantity")
	@NotNull
	private int productQuantity;
	@Column(name = "totalPrice")
	@NotNull
	private double totalProductPrice;
	@Column(name = "finalPrice")
	@NotNull
	private double finalProductPrice;

	public DummyOrder getOrder() {
		return order;
	}

	public void setOrder(DummyOrder order) {
		this.order = order;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getTotalProductPrice() {
		return totalProductPrice;
	}

	public void setTotalProductPrice(double totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}

	public double getFinalProductPrice() {
		return finalProductPrice;
	}

	public void setFinalProductPrice(double finalProductPrice) {
		this.finalProductPrice = finalProductPrice;
	}

}
