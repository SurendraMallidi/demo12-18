package com.filter;


import java.util.Arrays;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		 
		List<Employee> employees = Arrays.asList(new Employee(123, "Surendra", 26, "Male"),new Employee(144, "Vamsi", 25, "Male"),new Employee(12, "Samantha", 31, "Female"));
		List<Integer> l = Arrays.asList(23,12,1,45);
		for(Employee e : employees) {
			System.out.println(e);
		}
	}


}
