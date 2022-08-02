package gr.codelearn.spring.showcase.app.domain;

import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
public abstract class BaseModel implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	private Long id;
}
