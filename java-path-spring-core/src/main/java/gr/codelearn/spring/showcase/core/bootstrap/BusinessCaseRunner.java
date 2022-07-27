package gr.codelearn.spring.showcase.core.bootstrap;

import gr.codelearn.spring.showcase.core.base.BaseComponent;
import gr.codelearn.spring.showcase.core.domain.User;
import gr.codelearn.spring.showcase.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@RequiredArgsConstructor
public class BusinessCaseRunner extends BaseComponent implements CommandLineRunner {
	private final UserService userService;

	@Override
	public void run(final String... args) throws Exception {
		User newUser = User.builder().firstname("John").lastname("Miler").email("test@test.gr").build();
		if (userService.register(newUser)) {
			logger.info("User registered {}.", newUser);
		} else {
			logger.error("User {} could not be registered.", newUser);
		}
	}
}
