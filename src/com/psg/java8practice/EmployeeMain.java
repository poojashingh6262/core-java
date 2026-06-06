package com.psg.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		List <Employee> emp = Arrays.asList(new Employee (101, "uv", "Pune", 45000.3, 25),
				new Employee(102, "Raj", "Mumbai", 67000.5, 30), new Employee(103, "Neha", "Delhi", 52000.0, 28),
				new Employee(104, "Rohit", "Bhopal", 39000.8, 24), new Employee(105, "Vijay", "Indore", 88000.9, 35),
				new Employee(106, "Karan", "Hyderabad", 72000.4, 31),
				new Employee(107, "Neha", "Bangalore", 61000.2, 27), new Employee(108, "Priya", "Chennai", 54000.7, 29),
				new Employee(109, "Neha", "Kolkata", 47000.6, 26), new Employee(110, "Sneha", "Jaipur", 93000.1, 38),
				new Employee(111, "Rahul", "Noida", 58000.5, 32), new Employee(112, "Pooja", "Surat", 41000.3, 23),
				new Employee(113, "Arjun", "Lucknow", 76000.8, 34), new Employee(114, "Meena", "Nagpur", 49000.9, 28),
				new Employee(115, "Suresh", "Noida", 35000.0, 22));

	//	List<Employee> collect = emp.stream().filter(abc -> abc.getBalance() >50000).collect(Collectors.toList());
		
	//	List <Employee> collect = emp.stream().filter(abc -> abc.getBalance() <50000).collect(Collectors.toList());
	
	//	Map<String,Long> calculation = emp.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
	
		Map<String, List<Employee>> calulation = emp.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.toList()));		
				
				
				System.out.println(calulation);
		
	}

}
