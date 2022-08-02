package gr.codelearn.spring.showcase.app.service;

import gr.codelearn.spring.showcase.app.domain.Customer;
import gr.codelearn.spring.showcase.app.domain.Order;
import gr.codelearn.spring.showcase.app.domain.OrderItem;
import gr.codelearn.spring.showcase.app.domain.PaymentMethod;

import java.util.Date;
import java.util.List;

public interface OrderService extends BaseService<Order> {
	Order initiateOrder(Customer customer);

	void addItem(Order order, OrderItem item, int quantity);

	void updateItem(Order order, OrderItem item, int quantity);

	void removeItem(Order order, OrderItem item);

	Order checkout(Order order, PaymentMethod paymentMethod);

	List<Order> findBySubmitDate(Date submitDate);
}
