package gr.codelearn.spring.showcase.core.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class OrderItem extends BaseModel {
	private String serial; // Should this be changed to product?
	private Integer quantity;
	private BigDecimal price;
}
