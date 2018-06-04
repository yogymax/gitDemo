package com.scp.access.modifiers;

public class C {

	
	public void instanceMethod1(){
		A a = new A();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		System.out.println(a.defaultVar);
		//System.out.println(a.privateVar);
	}
	
}
