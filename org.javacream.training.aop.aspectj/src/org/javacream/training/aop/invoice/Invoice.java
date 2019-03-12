package org.javacream.training.aop.invoice;

public class Invoice {

	private long id;
	private double amount;
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", amount=" + amount + "]";
	}
	public Invoice(long id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}
}
