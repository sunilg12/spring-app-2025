package com.ourfirstapp.first_spring_app;

import com.ourfirstapp.first_spring_app.model.Address;
import com.ourfirstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication

//or 3 annotations combined

//@ComponentScan
//@Configuration
//@EnableAutoConfiguration

public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello spring boot");

//###	Example for a tight couple
//		Employee emp = new Employee();
//		emp.id=123;
//		emp.name="sunil";
//		emp.email="sunil@email.com";
//		emp.designation="Junior developer";
//
//		Address addrs = new Address();
//		addrs.doorno=207;
//		addrs.streetName="nagar";
//		addrs.city="hyderabad";
//
//		emp.address=addrs;
//
//		System.out.println("Emp is " + emp);
//		System.out.println("Addrs is " + addrs);
//
//		addrs.streetName="new nagar";
//		addrs.city="new hyderabad";
//
//		System.out.println("Emp is " + emp);
//		System.out.println("Addrs is " + addrs);

//		  loose coupling
//        setter injection
//		Employee emp1 = new Employee();
//		emp1.setId(103);
//		emp1.setName("sunil");
//		emp1.setEmail("sunil@gmail.com");
//		emp1.setDesignation("senior developer");
//
//		Address addrs1 = new Address();
//		addrs1.setDoorno(244);
//		addrs1.setStreetName("nagara");
//		addrs1.setCity("suraram");
//
//		emp1.setAddress(addrs1);
//		System.out.println("Emp is " + emp1);
//		System.out.println("Addrs is " + addrs1);
//
////		## changing address with emp1 object
//		emp1.getAddress().setStreetName("AAAA");
//		emp1.getAddress().setCity("ccccc");
//
//		System.out.println("Emp after change is " + emp1);
//		System.out.println("Addrs after change is " + addrs1);
//
////		constructor injection
//		Address addrs2 = new Address(222, "noida", "delhi");
//		Employee emp2 = new Employee(101, "sunil", "sunil@123mail.com", "worker", addrs2);
//
//		System.out.println("Emp2 after change is " + emp2);
//		System.out.println("Addrs2 after change is " + addrs2);
	}
}

