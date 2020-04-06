package com.friends.pms.service;

public interface IEntityService<T> {
	public T saveEntity(T t);
	public T getEntityById(Long id);
	public Iterable<T> getAllEntities();
	public void deleteEntityById(Long id);
	public T updateEntity(T t);
}
