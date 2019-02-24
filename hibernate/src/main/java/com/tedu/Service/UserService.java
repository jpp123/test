package com.tedu.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.pojo.User;


public interface UserService {

	List<User> findAll();

}
