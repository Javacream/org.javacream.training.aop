package org.javacream.training.aop.service.order;

import java.util.Random;

public class OrderServiceImpl implements OrderService {
	private Random random = new Random();
	@Override
	public Order order(String item, int number) {
		return new Order(random.nextLong(), number, item);
	}

}
