package com.scp.java.ten.basics;

public class TestClass {

	public static void main(String[] args) {
		if(m1() && m2()){
			System.out.println("inside if");
		}else
			System.out.println("else");
	}

	private static boolean m2() {
		System.out.println("m2");
		return true;
	}

	private static boolean m1() {
		System.out.println("m1");
		return false;
	}

}


