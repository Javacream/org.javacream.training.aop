package org.javacream.training.aop.invoice;

public interface InvoiceService {
	public Invoice create(double amount);
	public Invoice find (long id);
	public void cancel(long id);
		
}
