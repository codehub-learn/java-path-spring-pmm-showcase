package gr.codelearn.spring.showcase.app.service;

import gr.codelearn.spring.showcase.app.domain.Customer;
import gr.codelearn.spring.showcase.app.domain.Order;
import gr.codelearn.spring.showcase.app.domain.OrderItem;
import gr.codelearn.spring.showcase.app.domain.PaymentMethod;
import gr.codelearn.spring.showcase.app.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {
	private final OrderRepository orderRepository;

	@Override
	public JpaRepository<Order, Long> getRepository() {
		return orderRepository;
	}

	@Override
	public Order initiateOrder(final Customer customer) {
		return null;
	}

	@Override
	public void addItem(final Order order, final OrderItem item, final int quantity) {

	}

	@Override
	public void updateItem(final Order order, final OrderItem item, final int quantity) {

	}

	@Override
	public void removeItem(final Order order, final OrderItem item) {

	}

	@Override
	public Order checkout(final Order order, final PaymentMethod paymentMethod) {
		return null;
	}

	@Override
	public List<Order> findBySubmitDate(final Date submitDate) {
		return null;
	}
}
