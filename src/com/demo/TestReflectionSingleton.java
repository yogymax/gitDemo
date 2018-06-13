package com.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflectionSingleton {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			
		D2 ob1 = D2.getInstance();
		
		D2  newOb =null;
		Constructor ob[] = D2.class.getConstructors();
			for (Constructor constructor : ob) {
				constructor.setAccessible(true);
				newOb= (D2) constructor.newInstance();
			}
			
			/**
			 * Abstract class Comp  -
			 * 				getHDD();
			 * 				getRAM();
			 * 				getCPU(); 
			 * 
			 * PC extends Comp
			 * 			getHDD(){------}
			 * 			getRAM(){------}
			 * 			getCPU(){------}
			 * 			getPCMethod(){-----} //spefic to PC
			 * 
			 * Server extends Comp
			 * 			getHDD(){------}
			 * 			getRAM(){------}
			 * 			getCPU(){------}
			 * 
			 * 
			 * ComputerFactory {
			 * 
			 *   public static Computer getComputer(type,hd,cpu,ram){
			 *    if(type.equal(PC)){
			 *    	 	return new PC(hd,cpu,ram);
			 *    }else if(type.equals("Server")){
			 *     		return new Server(hd,cpu,ram);
			 *    } 		return "ABC";
			 *   
			 *   
			 *   }
			 * 
			 * }
			 */
			
			System.out.println("Breaking singleton using reflection ");
			System.out.println(ob1==newOb); //false
			
			
	}

	
/*
	* Enum -- is a datatype in a java
 * which holds predefined constant values
 *  so we can provide compile time safety and avoid runtime errors which
 *  might occur due to invalid input
 */
	
}


//using eager inilization
		//object will be created in advance -- if not required will be inside memory ultimately will affect application performance
class A{
	private static final A aOb= new A();
	private A(){
	}
	public static A getInstance(){
		return aOb;
	}
	
}

//using eager inilization -- using static block
//object will be created in advance -- if not required will be inside memory ultimately will affect application performance
class B{
	private static final B bOb;
	static{
		bOb = new B();
	}
	private B(){
	}
	public static B getInstance(){
		return bOb;
	}
}


//using lazy loading
//It will not work in mutithreaded env-- if two thread comes inside a
//method at the same time -- they will end up with creating multiple objects
class C{
	private static C cOb;
	private C(){
	}
	public static C getInstance(){
		if(cOb==null){
			cOb=new C();
		}
		return cOb;
	}
}

//using Threadsafe SingleTone
//it will impact application perfomarce as it's a static method synechronied
//that method will be locked class level -- no object can access if one of the thread already  acquired a lock on it.
class D1{
	private static D1 bOb;
	private D1(){
	}
	public static synchronized D1 getInstance(){
		if(bOb==null){
			bOb=new D1();
		}
		return bOb;
	}
}

//Double Checking ThreadSafe SingleTon
//This is break -- using reflection mechanism -- as you can changes constrctors access modier
class D2{
	private static D2 bOb;
	private D2(){
	}
	public static D2 getInstance(){
		if(bOb==null){
			synchronized (D2.class) {
				if(bOb==null){
						bOb=new D2();
				}
			}
		}
		return bOb;
	}
}

//Bill Pugh

class X{

	private static final class innerClass{
			private static final X xOb= new X();
	}
	private X(){
	}
	public static X getInstance(){
		return innerClass.xOb;
	}
	
}

//using enum
enum Y{
	Yob;
}
