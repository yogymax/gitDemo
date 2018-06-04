package com.scp.access.modifiers;

public class A {
	public String publicVar="Public";
	protected String protectedVar="Protected";
	 		String defaultVar="default";
	private String privateVar="private";
	
	
	public void instanceMethod(){
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);
		
	}
	
	static public String publicVar1="Public";
	
	static public void staticMethod(){
		
	}
	
	
	
	
	
	
	

}
