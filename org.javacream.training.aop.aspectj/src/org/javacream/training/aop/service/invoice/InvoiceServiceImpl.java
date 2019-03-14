package org.javacream.training.aop.service.invoice;

import java.util.Random;

public class InvoiceServiceImpl {
	private Random random = new Random();
	public Invoice create(double amount) {
		return new Invoice(random.nextLong(), amount);
	}

	public Invoice find(long id) {
		return new Invoice(id, random.nextDouble());
	}

	public void cancel(long id) {
		//Nothing...
	}

	
}
