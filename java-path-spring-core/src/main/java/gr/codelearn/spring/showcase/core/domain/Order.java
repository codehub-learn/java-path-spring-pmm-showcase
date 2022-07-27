package gr.codelearn.spring.showcase.core.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@SuperBuilder
public class Order extends BaseModel {
	private User user;
	private Date submitDate;
	private List<OrderItem> orderItems;
	private BigDecimal cost;
}
