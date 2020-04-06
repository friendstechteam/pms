package com.friends.pms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.friends.pms.repository.IEntityRepository;

public class EntityService<T> implements IEntityService<T>{

	@Autowired
	private IEntityRepository<T> entityRepository;
	
	@Override
	public T saveEntity(T t) {
		return entityRepository.save(t);
	}

	@Override
	public T getEntityById(Long id) {
		return entityRepository.findById(id).get();
	}

	@Override
	public Iterable<T> getAllEntities() {
		return entityRepository.findAll();
	}

	@Override
	public void deleteEntityById(Long id) {
		entityRepository.deleteById(id);
	}

	@Override
	public T updateEntity(T t) {
		return entityRepository.save(t);
	}

}
