package com.pack.Spring.client;
import com.pack.Spring.Dao.*;
import com.pack.Spring.model.*;
import com.pack.Spring.service.*;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeCRUDClient {
	 public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	        Employeeservice employeeService = context.getBean("employeeservice", Employeeservice.class);
	        Employee pavan = new Employee(23, "nivi",21,25000);

	        //employeeService.saveEmployee(pavan);
	        List<Employee> list=employeeService.fetchAllEmployees();
	       // list.forEach(System.out::println); //method reference
	        Employee emp=employeeService.findById(2);
	        System.out.println(emp);
	        //employeeService.deleteEmployee(2);

	    }
}
