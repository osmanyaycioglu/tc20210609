package com.training.micro.security;

import org.springframework.data.repository.CrudRepository;

public interface IUserDAO extends CrudRepository<User, String> {

}
