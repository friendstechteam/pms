package com.friends.pms.service.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.friends.pms.model.User;
import com.friends.pms.repository.IEntityRepository;

public class UserService implements IUserService{

	@Autowired
	private IEntityRepository<User> entityRepository;
	
	@Override
	public User saveEntity(User t) {
		return entityRepository.save(t);
	}

	@Override
	public User getEntityById(Long id) {
		return entityRepository.findById(id).get();
	}

	@Override
	public Iterable<User> getAllEntities() {
		return entityRepository.findAll();
	}

	@Override
	public void deleteEntityById(Long id) {
		
	}

	@Override
	public User updateEntity(User t) {
		// TODO Auto-generated method stub
		return null;
	}

}
