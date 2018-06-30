package com.charvikent.collectionstest1;
import com.charvikent.collectionstest1.model.Employee1;
import java.util.Comparator;  
public class MyComparator1 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getDesignation().compareTo(o2.getDesignation());
	}
	
}
