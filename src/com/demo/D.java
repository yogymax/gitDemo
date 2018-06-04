package com.demo;

import com.scp.access.modifiers.A;

public class D extends A{

	
	public void instanceMethod1(){
		//System.out.println(A.publicVar);
		System.out.println(protectedVar);
		//System.out.println(defaultVar);
		//System.out.println(privateVar);
	}
}
