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
public class Product extends BaseModel {
	private String serial;
	private String name;
	private BigDecimal price;
	private Category category;
}
