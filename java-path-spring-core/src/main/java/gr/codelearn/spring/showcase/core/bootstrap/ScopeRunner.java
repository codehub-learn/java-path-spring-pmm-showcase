package gr.codelearn.spring.showcase.core.bootstrap;

import gr.codelearn.spring.showcase.core.base.BaseComponent;
import gr.codelearn.spring.showcase.core.component.Prototype;
import gr.codelearn.spring.showcase.core.component.Singleton;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@RequiredArgsConstructor
public class ScopeRunner extends BaseComponent implements CommandLineRunner {
	private final AnnotationConfigApplicationContext context;

	@Override
	public void run(final String... args) throws Exception {
		logger.info("Fetching singleton bean....");
		Singleton singleton1 = context.getBean(Singleton.class);
		singleton1.incrementValueByOne();
		Singleton singleton2 = context.getBean(Singleton.class);
		singleton2.incrementValueByOne();
		Singleton singleton3 = context.getBean(Singleton.class);
		singleton3.incrementValueByOne();

		logger.info("Fetching prototype  bean....");
		Prototype prototype1 = context.getBean(Prototype.class);
		prototype1.incrementValueByOne();
		Prototype prototype2 = context.getBean(Prototype.class);
		prototype2.incrementValueByOne();
		Prototype prototype3 = context.getBean(Prototype.class);
		prototype3.incrementValueByOne();

		context.close();
	}
}
