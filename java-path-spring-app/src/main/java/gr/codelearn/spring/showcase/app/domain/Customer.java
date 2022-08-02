package gr.codelearn.spring.showcase.app.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class Customer extends BaseModel {
	private String email;
	private String firstname;
	private String lastname;
	private Integer age;
	private String address;
	private CustomerCategory customerCategory;
}
