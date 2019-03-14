package org.javacream.training.aop.service.order;

public class Shop {

	public void order() {
		OrderService orderService = new OrderServiceImpl();
		Order order = orderService.order("Book", 42);
		System.out.println("created order" + order);
	}

}
