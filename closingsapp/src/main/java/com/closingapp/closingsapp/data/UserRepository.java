package com.closingapp.closingsapp.data;

import com.closingapp.closingsapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
