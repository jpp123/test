package com.tedu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tedu.pojo.Student;
import com.tedu.pojo.User;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	public Student findById(Integer id);

	public Student save(Student student);
	
	@Query("select s from Student s where s.name=:name")
	public List<Student> findByName(@Param("name") String name);
	
	@Query("select s from Student s where s.sex=?1")
	public List<Student> findBySex(String sex);
	
	@Query(value="select * from student where address=?1",nativeQuery=true)
	public List<Student> findByAddress(String address);
	
	@Transactional
	@Modifying
	@Query("update Student s set s.name=:name where s.id=:id")
	public int UpdateNameById(@Param("name")String name,@Param("id")Long id);


}
