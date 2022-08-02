package gr.codelearn.spring.showcase.app.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class OrderItem extends BaseModel {
	private Product product;
	private Integer quantity;
	private BigDecimal price;
}
