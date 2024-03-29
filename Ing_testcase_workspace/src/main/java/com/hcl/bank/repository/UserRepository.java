package com.hcl.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.bank.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByNameAndPassword(String name, String password);

}
