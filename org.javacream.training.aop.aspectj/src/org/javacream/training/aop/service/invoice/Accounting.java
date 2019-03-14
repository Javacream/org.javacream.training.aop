package org.javacream.training.aop.service.invoice;

public class Accounting {
	
	public void buy() {
		InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
		Invoice invoice = invoiceService.create(19.99);
		System.out.println("Received invoice" + invoice);
		invoiceService.find(42);
		invoiceService.cancel(42);
		
	}

}
