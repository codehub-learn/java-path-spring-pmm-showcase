package gr.codelearn.spring.showcase.core.service;

import gr.codelearn.spring.showcase.core.base.BaseComponent;
import gr.codelearn.spring.showcase.core.domain.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class BaseServiceImpl<T extends BaseModel> extends BaseComponent implements BaseService<T> {
	public abstract JpaRepository<T, Long> getRepository();

	@Override
	public List<T> createAll(final T... items) {
		return createAll(Arrays.asList(items));
	}

	@Override
	public List<T> createAll(final List<T> items) {
		return getRepository().saveAll(items);
	}

	@Override
	public T create(final T item) {
		logger.trace("Creating {}.", item);
		return getRepository().save(item);
	}

	@Override
	public void update(final T item) {
		logger.trace("Updating {}.", item);
		getRepository().save(item);
	}

	@Override
	public void delete(final T item) {
		final T itemFound = getRepository().getOne(item.getId());
		logger.trace("Deleting {}.", itemFound);
		getRepository().delete(itemFound);
	}

	@Override
	public void deleteById(final Long id) {
		final T itemFound = getRepository().getById(id);
		logger.trace("Deleting {}.", itemFound);
		getRepository().deleteById(id);
	}

	@Override
	public boolean exists(final T item) {
		logger.trace("Checking whether {} exists.", item);
		return getRepository().existsById(item.getId());
	}

	@Override
	public T get(final Long id) {
		logger.trace("Retrieving item with id {}.", id);
		return getRepository().findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public List<T> findAll() {
		logger.trace("Retrieving all items.");
		return getRepository().findAll();
	}
}
