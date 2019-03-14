package org.javacream.training.aop;

import org.javacream.training.aop.service.invoice.Accounting;
import org.javacream.training.aop.service.order.Shop;

public class Application {

	public static void main(String[] args) {
		new Accounting().buy();
		new Shop().order();
	}

}
