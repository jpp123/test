package com.tedu.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.pojo.Student;
import com.tedu.pojo.User;


public interface StudentService {

	List<Student> findAll();

	List<Student> findByNmae(String name);

	List<Student> findBySex(String sex);

	List<Student> findByAddress(String address);

	void updateNmaeById(String name, Long id);

}
