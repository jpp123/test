package com.tedu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tedu.pojo.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findById(Integer id);

	public User save(User user);

	


}
