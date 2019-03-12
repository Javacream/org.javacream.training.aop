package org.javacream.training.aop.order;

public class Shop {

	public static void main(String[] args) {
		OrderService orderService = new OrderServiceImpl();
		orderService.order("Book", 42);
	}

}
