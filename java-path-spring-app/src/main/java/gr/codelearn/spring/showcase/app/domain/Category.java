package gr.codelearn.spring.showcase.app.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class Category extends BaseModel {
	private String description;
}
