package com.charvikent.collectionstest1.model;

public class Employee1 implements Comparable<Employee1>{
	private int Id;
	private String Name;
	private String Designation;
	private float Salary;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [Id=" + Id + ", Name=" + Name + ", Designation=" + Designation + ", Salary=" + Salary + "]";
	}
	
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return Name.compareToIgnoreCase(o.getName());
	}

	/*@Override
	public int compareTo(Employee1 obj) {
		// TODO Auto-generated method stub
		
		if(Salary>obj.getSalary())
		return -1;
		else if(Salary<obj.getSalary())
			return +1;
		else
			return 0;

	
	}*/
}
