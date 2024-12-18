package com.filter;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int age;
	String sex;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getAge(), o.getAge());
	}

}
