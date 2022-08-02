package gr.codelearn.spring.showcase.app.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class Order extends BaseModel {
	private Customer customer;
	private Date submitDate;
	private final Set<OrderItem> orderItems = new HashSet<>();
	private PaymentMethod paymentMethod;
	private BigDecimal cost;
}
