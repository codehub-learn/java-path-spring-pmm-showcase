package gr.codelearn.spring.showcase.core.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class BaseComponent {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@PostConstruct
	private void init() {
		logger.trace("Loaded {}.", getClass().getName());
	}

	@PreDestroy
	private void destroy() {
		logger.trace("Ready to shutdown {}.", getClass().getName());
	}
}
