package com.example.springbootcurdoperation.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootcurdoperation.entity.Student;

public interface StudentRepo extends CrudRepository<Student,Integer> {
	
	
	public List<Student> findByCity(String city);
	
	List<Student> findByNameAndCity(String name,String city);

	List<Student> findByName(String city);
}
