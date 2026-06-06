package com.psg.java8practice;

public class Employee {

	int id ;
	String name ;
	String city ;
	int age ;
	double balance; 
	
	public Employee(int id, String name, String city, double balance, int age) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		this.balance = balance;
		this.age = age;
		
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", balance=" + balance
				+ "]";
	}
	
	
}
