package com.scp.java.ten.basics;

/**
 * Content Equality
 * 
 * EMPC -- object eqauls -- ref equality
 * 
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		EmpC e1 = new EmpC(10,"A");
		EmpC e2 = new EmpC(10,"B");
		EmpC e3 = new EmpC(10,"C");
		EmpC e4 = new EmpC(10,"D");
		EmpC e5 = new EmpC(10,"E");
		EmpC e6 = new EmpC(10,"F");
		
		List<EmpC> nums1 = new ArrayList<EmpC>();
		nums1.add(e1);
		nums1.add(e2);
		nums1.add(e3);
		nums1.add(e4);
		
		List<EmpC> nums2 = new ArrayList<EmpC>();
		nums2.add(e1);
		nums2.add(e2);
		nums2.add(e5);
		nums2.add(e6);
		
		nums2.retainAll(nums1);
		System.out.println(nums2);
	}

}

class EmpC implements Delayed{
	int empId;
	String empName;
	public EmpC(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "EmpC [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}




