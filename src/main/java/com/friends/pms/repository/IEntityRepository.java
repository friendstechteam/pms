package com.friends.pms.repository;

import org.springframework.data.repository.CrudRepository;

public interface IEntityRepository<T> extends CrudRepository<T, Long> {

}
