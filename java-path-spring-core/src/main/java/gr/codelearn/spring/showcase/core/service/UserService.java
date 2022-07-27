package gr.codelearn.spring.showcase.core.service;

import gr.codelearn.spring.showcase.core.domain.User;

public interface UserService extends BaseService {
	boolean register(User user);

	boolean lock(User user);

	boolean unlock(User user);
}
