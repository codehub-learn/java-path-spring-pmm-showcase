package gr.codelearn.spring.showcase.core.service;

import gr.codelearn.spring.showcase.core.domain.Order;

public interface OrderService extends BaseService<Order> {
	void submit(Order order);
}
