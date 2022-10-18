package com.sankalp.app.repository;

import com.sankalp.app.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {
}
