package com.scp.java.ten.basics;


public class TestEnum  extends Object{
	
	
	/**
	 * javacoding convettions
	 * 	
	 * Method and Variables --  start with small letter + camelcase
	 * Class/Interface/AbstractClass names -- start with capital + camelcase
	 * packagename --- all small seperated by . dots
	 * constants -- all capitable and seperated by underscores
	 * identier -- method/class/var -- make sure less than 15 chars and should be meaningful
	 * 
	 * 
	 * curly braces  -- make sure you write it at class method block level itself dont write at new line
	 * 
	 * &&  ||   -- if anyof the statement execution predicates the output..next statements
	 * 			will not be executed
	 * 			||   -- true
	 * 			&&  -- false
	 * 
	 * nullpointer -- 
	 * 		Always your constant values should be at lhs
	 * 		"admin".equals(username) -- ideally this is correct one
	 * 		username.equals("admin") -- chances to get a nullpointer exception
	 * 
	 * 
	 * replace multile if else with switch conditions 
	 * 
	 * 
	 * enum --- it's a datatype in java  which holds predefined constants
	 * 			days of week --
	 * 			seasons -- 
	 * 			months
	 * 
	 * 
	 * you cannot extend any other class using enum --already Extented Enum class
	 * user defined enum has few methods such as tostring,values -- Enum class
	 * You cannot extend user defined Enum --- final
	 * Every property of Enum is bydefault public static final of that type
	 * 		
	 * 		enum Days{
	 * 			Mon
	 * 			Tue
	 * 		}
	 * 	
	 * 		public static final Days Mon = new Days();		
	 * 
	 * you write enum inside class/interface/outside class but not inside method
	 * 
	 * you can access enum properties using enum.dot as bydefualt thoes are static
	 * why public -- as enum holds predefined constants which should be accessible throughout the application
	 * 1.5 -- Switch condition
	 * 
	 * outside class Enum  -- public default strictfp
	 * inside class Enum  -- public default strictfp  + private protected and static
	 * 
	 * 
	 * 
	 * 
	 * What is enum
	 * Why to use enum
	 * Properties representation
	 * Can we extend enum
	 * Can enum extend other class/enum/interface
	 * what are the places we can write enum
	 * can we have abstract methods inside enum
	 * semicolon, methods wala rule
	 * enum methods -- values,tostring,ordinal along with return types
	 * Can we have methods constructors 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// p s f DaysEnum Sat = new DaysEnum();
		//System.out.println(a);
		

		DaysEnum days[] = DaysEnum.values();
		
		for (DaysEnum day : days) {
			System.out.println("Day :" +day +" index :" +day.ordinal()) ;
		}
		
		
		
		
		
	}

	
	/**
	 * p s f DaysEnum Sun = new DaysEnum();
	 * p s f DaysEnum Mon = new DaysEnum();
	 * p s f DaysEnum Tues = new DaysEnum();
	 * 

	 *
	 */
	
	
	private static boolean checkDays(DaysEnum day) {
		if(day.equals(DaysEnum.Sun)){
			System.out.println("party time...");
		}
		
		
		
		/*if(m1() && m2()){
			System.out.println("inside if");
			return true;
		}
		
		System.out.println("inside checkcredetials");*/
		return false;
		
		
	}

	private static boolean m2() {
		System.out.println("inside m2");
		return false;
	}

	private static boolean m1() {
		System.out.println("inside m1");
		return true;
	}

}



//public static final DaysEnum Sun of the day = DaysEnum("Party");


// public static final DaysEnum Sun = DaysEnum("Party");
enum DaysEnum {
	Sun("Party"),
	Mon("BoringDay"),
	Tues("Work load"),
	Wed("Friday is coming"),
	Thur("Friday..."),
	Fri("NO work..go home"),
	Sat;

	
	
	DaysEnum(String s) {
		//System.out.println("inside constrctor....");
	}
	
	DaysEnum() {
		//System.out.println("inside constrctor....");
	}
	
	
}





interface Xyz{
	
	enum A{
		
	}
	
	
}


class Empe{
	public final Address sat = new Address();
	public final Address sun = new Address();
	public final Address mon = new Address();
	public final Address tues = new Address();
	
}

class Address{

	public Address() {
		super();
		System.out.println("inside default constuctor");
	}
	
	

	
	
}






