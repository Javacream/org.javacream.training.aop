package org.javacream.training.aop.invoice;

public class Accounting {

	public static void main(String[] args) {
		InvoiceService invoiceService = new InvoiceServiceImpl();
		invoiceService.create(19.99);
		invoiceService.find(42);
		invoiceService.cancel(42);
	}

}
