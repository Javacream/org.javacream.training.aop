package org.javacream.training.aop.invoice;

import java.util.Random;

public class InvoiceServiceImpl implements InvoiceService{
	private Random random = new Random();
	@Override
	public Invoice create(double amount) {
		return new Invoice(random.nextLong(), amount);
	}

	@Override
	public Invoice find(long id) {
		return new Invoice(id, random.nextDouble());
	}

	@Override
	public void cancel(long id) {
		//Nothing...
	}

	
}
