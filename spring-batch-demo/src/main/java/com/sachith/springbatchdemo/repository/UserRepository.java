package com.sachith.springbatchdemo.repository;

import com.sachith.springbatchdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
