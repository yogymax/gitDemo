package com.demo;

import com.scp.access.modifiers.A;

public class D extends A{

	
	public static void main(String[] args) {
		String str ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(str.substring(3));//defghijklmnopqrstuvwxyz
		System.out.println(str.substring(3,8));//defgh
		
		
	}
	
	public void instanceMethod1(){
		//System.out.println(A.publicVar);
		System.out.println(protectedVar);
		//System.out.println(defaultVar);
		//System.out.println(privateVar);
	}
}
