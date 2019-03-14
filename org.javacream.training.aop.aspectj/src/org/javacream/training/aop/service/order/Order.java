package org.javacream.training.aop.service.order;

public class Order {

	@Override
	public String toString() {
		return "Order [id=" + id + ", amount=" + amount + ", item=" + item + "]";
	}
	private long id;
	private double amount;
	private String item;
	public Order(long id, double amount, String item) {
		super();
		this.id = id;
		this.amount = amount;
		this.item = item;
	}
	public double getAmount() {
		return amount;
	}
	public String getItem() {
		return item;
	}
}
