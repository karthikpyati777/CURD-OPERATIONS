package com.example.springbootcurdoperation.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcurdoperation.entity.Student;
import com.example.springbootcurdoperation.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

	public void saveByOneFile() {

		Student s = new Student();
		s.setName("ganapti");
		s.setCity("raichur");

		repo.save(s);

	}

	public void saveMultipleFile() {

		Student s = new Student();
		s.setName("pavan");
		s.setCity("kanakagiri");
		
		Student s1 = new Student();
		s1.setName("shilpa");
		s1.setCity("bangalore");

		Student s2 = new Student();
		s2.setName("Bharath");
		s2.setCity("Raichur");

		List<Student> asList = Arrays.asList(s,s1,s2);
		
		repo.saveAll(asList);

	}
	
	
	public void findByStudentId() {
		
		Optional<Student> findById = repo.findById(2);
		
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		else
		{
			System.out.println("No Record present");
		}
	}
	public void findAllStudents() {
		
		Iterable<Student> findAll = repo.findAll();
		
		findAll.forEach(s->System.out.println(s));
	}
	
	public void findAllByStudentIds() {
		
		List<Integer> asList = Arrays.asList(2,4,1);
		Iterable<Student> findAllById = repo.findAllById(asList);
		findAllById.forEach(e->System.out.println(e));
	}
	
	public void numberOfStudents() {
		
		long count = repo.count();
		System.out.println("total number of students : "+count);
	}
	
	public void studentPresentOrNot() {
		
		boolean existsById = repo.existsById(3);
		
		if(existsById) {
			System.out.println("Student id is present : "+ existsById);
		}
		else {
			System.out.println("Student id is not present : " + existsById);
		}
	}
	
	public void deleteStudentById() {
		
		 repo.deleteById(2);
		
	}
	
	public void deleteAllStudentsByIds() {
		List<Integer> asList = Arrays.asList(2,3);
		repo.deleteAllById(asList);
	}
	
	public void deleteAllStudents() {
		repo.deleteAll();
	}
	
	public void testFindByMethods() {
		List<Student> findByCity = repo.findByCity("bangalore");
		findByCity.forEach(e->{
			System.out.println(e);
		});
	}
	
	public void testNameAndCity() {
//		List<Student> findByCity = repo.findByNameAndCity("karthik", "gangavathi");
		List<Student> findByCity = repo.findByNameAndCity("karthik", "gangavathi");
		findByCity.forEach(e->{
			System.out.println(e);
		});
	}
}
