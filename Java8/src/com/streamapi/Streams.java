package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<Employee> e = Arrays.asList
				(new Employee(112, "Surendra", 26, 60000.00, "Sales"),
				new Employee(110, "Vamsi", 23, 79000.00, "Marketing"),
				new Employee(112, "Nani", 23, 25000.00, "Hr"),
				new Employee(142, "Kishore", 29, 100000.00, "Sales"));
		
		List<Product> p = Arrays.asList
				(new Product(14, "Iphone", "Mobile", 4),
				new Product(1125, "Android", "Mobile", 1),
				new Product(1109, "Macbook", "Laptop", 10),
				new Product(1154, "Windows", "Laptop", 2));
		
		//Max Salary 
		Employee maxSal = e.stream().sorted((a,b) -> b.getSalary().compareTo(a.getSalary())).findFirst().orElse(null);
		System.out.println("Max Salary: " +maxSal.getName() +" "+maxSal.getSalary());
		
		//Sorting by Id
		List<Employee> sortedById = e.stream().sorted((a,b)->a.getId()-b.getId()).collect((Collectors.toList()));
		System.out.println("Sorted by Id: "+sortedById);
		
		//Sorting by name
		List<Employee> sortedByName = e.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());
		System.out.println("Sorted by Name: "+sortedByName);
		
		//Using For each
		e.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(i->System.out.println(i));		
		
		//Group by category and stock count
		Map<String, Integer> map = p.stream().collect(Collectors.groupingBy
				(Product::getProductCategory,Collectors.summingInt(Product::getProductStock)));
		for(Map.Entry<String, Integer> kv : map.entrySet()) {
			System.out.println("Category: " +kv.getKey()+", Stock Count: "+kv.getValue());
		}
		
		//Highest salary by each department
		Map<String, Optional<Employee>> salByDept = e.stream().collect(Collectors.groupingBy
				(Employee::getDepartment,
						Collectors.maxBy((a,b)->(int) (a.getSalary()-b.getSalary()))));
		System.out.println(salByDept);
		
		//Count number of employees in each department
		Map<String, Long> countEmpByDept = e.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(countEmpByDept);
		
	}

}
