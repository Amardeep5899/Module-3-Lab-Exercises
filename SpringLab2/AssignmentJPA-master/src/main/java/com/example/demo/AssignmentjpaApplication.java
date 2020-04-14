package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Dao.TrainerDao;
import com.example.entity.Trainers;



@SpringBootApplication
public class AssignmentjpaApplication implements CommandLineRunner {

	@Autowired
	TrainerDao tdo;
	
	public static void main(String[] args) {
		SpringApplication.run(AssignmentjpaApplication.class, args);
	}
	
	@Override
	public void run(String arg[]) throws Exception {
		
		
		  Trainers t1 = new Trainers(1, "amar", "kanpur");
		  Trainers t2 = new Trainers(2,"deep","delhi");
		
		  
		 tdo.create(t1); 
		 tdo.create(t2); 
		  
		 
		
	}
	


}
