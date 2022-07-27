package gr.codelearn.spring.showcase.core.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Category extends BaseModel {
	private String name;
	private boolean status;
	private Category parent;
	private int level;
}
