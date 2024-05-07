package com.prachi.springboot.SpringJDBCEx;

import com.prachi.springboot.SpringJDBCEx.model.Student;
import com.prachi.springboot.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setMarks(99);
		s1.setName("Prachi");
		s1.setRollNo(104);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
