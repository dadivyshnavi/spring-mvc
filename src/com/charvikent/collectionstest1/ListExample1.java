package com.charvikent.collectionstest1;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.charvikent.collectionstest1.model.Employee1;

public class ListExample1 {
	
	public static void main(String args[]) {
		
		List<Employee1> li=new LinkedList<Employee1>();
		

Employee1 emp1=new Employee1();
		
		emp1.setId(101);
		emp1.setName("harini");
		emp1.setDesignation("abc");
		emp1.setSalary(15000);

Employee1 emp2=new Employee1();
		
		emp2.setId(104);
		emp2.setName("hari");
		emp2.setDesignation("efg");
		emp2.setSalary(14000);

Employee1 emp3=new Employee1();
		
		emp3.setId(102);
		emp3.setName("meena");
		emp3.setDesignation("xyz");
		emp3.setSalary(25000);
		
		li.add(emp1);
		li.add(emp2);
		li.add(emp3);
		
		System.out.println("Objects in List");
		
		for(Employee1 entry:li) {
			System.out.println(entry.getId()+"  "+entry.getName()+"   "+entry.getDesignation()+"    "+entry.getSalary());
		}
		
		li.remove(1);
		
		System.out.println("Objects in List after Removing");
		
		for(Employee1 entry:li) {
			System.out.println(entry.getId()+"  "+entry.getName()+"   "+entry.getDesignation()+"    "+entry.getSalary());
		}
		
		li.add(emp2);
		li.add(emp3);
		
		System.out.println("Objects in List after adding");
		for(Employee1 entry:li) {
			System.out.println(entry.getId()+"  "+entry.getName()+"   "+entry.getDesignation()+"    "+entry.getSalary());
		}
		
	emp1.setName("kusuma");
	
	System.out.println("Objects in List after updating");
	for(Employee1 entry:li) {
		System.out.println(entry.getId()+"  "+entry.getName()+"   "+entry.getDesignation()+"    "+entry.getSalary());
	}
	
	
	Collections.sort(li);
	
	
	
	System.out.println("Objects in List after sorting");
	for(Employee1 entry:li) {
		System.out.println(entry.getId()+"  "+entry.getName()+"   "+entry.getDesignation()+"    "+entry.getSalary());
	}
	
	Collections.sort(li,new MyComparator1());
	
	System.out.println("Objects in List after sorting using comparator");
	
	for(Employee1 entry:li) {
		System.out.println(entry.getId()+"  "+entry.getName()+"   "+entry.getDesignation()+"    "+entry.getSalary());
	}
	
	
	}
	
}
