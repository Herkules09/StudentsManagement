package com.example.demo;

import com.example.demo.repostitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		/**
		Student student1 = new Student("Kacper","Kurowski","kacperkur123@gmail.com");
		studentRepository.delete(student1);

		Student student2 = new Student("Kamil","Kierat","ruchacz69@onet.pl");
		studentRepository.save(student2);
        **/
	}
}
