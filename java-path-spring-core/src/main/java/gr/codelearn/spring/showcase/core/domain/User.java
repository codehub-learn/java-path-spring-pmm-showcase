package gr.codelearn.spring.showcase.core.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class User extends BaseModel {
	private String email;
	private String firstname;
	private String lastname;
	private String address;
}
