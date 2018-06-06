package com.scp.collection.sorting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapContracts {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(14,"A1",40000);//4  "X7",16
		Emp e2 = new Emp(13,"A2",70000);//1  "X2",11
		Emp e3 = new Emp(11,"A3",60000);//2	 "X3",12
		Emp e4 = new Emp(12,"A4",50000);//3  "X6",13
		Emp e5 = new Emp(1,"A1",40000);
		Emp e6 = e5;
		
		ValueContainer v1 = new ValueContainer("X1",10);
		ValueContainer v2 = new ValueContainer("X2",11);
		ValueContainer v3 = new ValueContainer("X3",12);
		ValueContainer v4 = new ValueContainer("X6",13);
		ValueContainer v5 = new ValueContainer("X5",14);
		ValueContainer v6 = new ValueContainer("X7",16);
		
		
		HashMap<Emp,ValueContainer> hmap = new HashMap<>();
		hmap.put(e1,v1);//null
		hmap.put(e2,v2);//null
		hmap.put(e3,v3);//null
		hmap.put(e4,v4);//null
		hmap.put(e5,v5);//x1 10
		hmap.put(e6,v6);//x5 14
		
		
		System.out.println(hmap.size());//4
		
		Set<Entry<Emp,ValueContainer>> entrySet = hmap.entrySet();
		Iterator<Entry<Emp,ValueContainer>> entryItr = entrySet.iterator();
		while(entryItr.hasNext()){
			System.out.println("");
			Entry<Emp,ValueContainer> entry = entryItr.next();
			System.out.print("Key --" +entry.getKey());
			System.out.print("  Value --" +entry.getValue());
		}
		
		
	}
	
}


class Emp{
	private int empId;
	private String empName;
	private int salary;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	public Emp(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n Emp [empId=" + empId + ", empName=" + empName + ", salary="
				+ salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}


class ValueContainer{
	String x;
	int y;
	@Override
	public String toString() {
		return "\n ValueContainer [x=" + x + ", y=" + y + "]";
	}
	public ValueContainer(String x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	
}
