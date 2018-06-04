package com.scp.access.modifiers;

public class B extends A {

	
	public void instanceMethod1(){
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		//System.out.println(privateVar);
	}
	
	/*public void instanceMethod2(){
		A a  = new A();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		System.out.println(a.defaultVar);
		//System.out.println(a.privateVar);
	}*/
}
