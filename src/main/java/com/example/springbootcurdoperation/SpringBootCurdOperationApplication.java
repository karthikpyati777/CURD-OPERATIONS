package com.example.springbootcurdoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springbootcurdoperation.service.StudentService;

@SpringBootApplication
public class SpringBootCurdOperationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootCurdOperationApplication.class, args);
		
		 StudentService bean = ctx.getBean(StudentService.class);
		// bean.saveByOneFile();
	//	 bean.saveMultipleFile();
//		 bean.findByStudentId();
	//	 bean.findAllStudents() ;
//		 bean.findAllByStudentIds();
		// bean.numberOfStudents();
//		 bean.studentPresentOrNot();
//		 bean.deleteStudentById(); 
//		 bean.deleteAllStudentsByIds();
//		 bean.deleteAllStudents();
//		 bean.testFindByMethods();
		 bean.testNameAndCity();
	}

	
}
