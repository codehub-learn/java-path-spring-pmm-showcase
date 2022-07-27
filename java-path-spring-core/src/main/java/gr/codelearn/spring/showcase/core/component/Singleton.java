package gr.codelearn.spring.showcase.core.component;

import gr.codelearn.spring.showcase.core.base.BaseComponent;
import org.springframework.stereotype.Component;

@Component
public class Singleton extends BaseComponent {
	private int value = 0;

	public void incrementValueByOne() {
		logger.info("Increasing bean's value by one {}.", ++value);
	}
}
