package com.tedu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.pojo.Student;
import com.tedu.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}
	@Override
	public List<Student> findByNmae(String name) {
		
		return studentRepository.findByName(name);
	}
	@Override
	public List<Student> findBySex(String sex) {
		
		return studentRepository.findBySex(sex);
	}
	
	@Override
	public List<Student> findByAddress(String address) {
		return studentRepository.findByAddress(address);
	}
	
	@Override
	public void updateNmaeById(String name, Long id) {
		
		studentRepository.UpdateNameById(name, id);
	}

}
