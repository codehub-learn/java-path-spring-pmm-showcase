package gr.codelearn.spring.showcase.core.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class Product extends BaseModel {
	private String name;
	private String sku;
	private BigDecimal price;
	private Category category;
}
