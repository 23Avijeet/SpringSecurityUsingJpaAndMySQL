package com.avijeet.repository;

import org.springframework.data.repository.CrudRepository;

import com.avijeet.model.UserDao;

public interface UserRepository extends CrudRepository<UserDao, Integer>{
	UserDao findByUsername(String username);

}


