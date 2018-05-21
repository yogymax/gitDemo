package com.scp.java.ten.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;



/**
 * Collection
 * 		-- Only stores objects
 * 		-- every implemented class has backend Datastrcuture
 * 		-- Every implemented class growable in nature
 * 
 *
 * ArrayList
 * 		-- ArrayList(); ArrayList(int); ArrayList(collectionType)
 * 		-- Growable in nature    Arrays.copyOf(existingArray,cp+(cp>>1)); 
 * 		-- Not synechronized
 * 				-- fast
 * 				-- In single threaded env it's is a good choince 
 * 				-- If you want to use it in multithreaded env, you need to 
 * 					synechronize it else data inconsitency problem will occur
 * 				how will you synechronize
 * 						-- Collections.synchronizeList(listOb)
 * 		-- Collections.unmodifiableList(listOb);
 * 		-- remove clear removeAll retainall
 *	**	-- If your appliction req is frequeent search and retrive -- then 
 *			you should go for arraylist as it's a index based
 *	** -- you should not use Arraylist if your operations are frequent 
 *			insertion and deletetion
 * 		-- cursor -- Iterator ListIterator
 *		-- 100%
 *
 *-- size -- how many elements 
 *-- capacity -- how many can accoumadate
 *-- loadfactor/fillratio -- when to increase the capacity
 *
 *
 *
 *
 *  0 0 0 0 1 0 1 0
 *  0 0 0 0 0 1 0 1  = 5
 * 
 * 
 * 
 * 
 *
 */
public class CollectionBasics3 {
	public static void main(String[] args) {
		/*int [] num1 = {10,203,12,12,3,10,203,12,12,3};//10
		System.out.println("Initial -- "+num1.length);
		
		num1=Arrays.copyOf(num1,num1.length+(num1.length>>1));//15
		System.out.println("One -- "+num1.length);
		
		num1=Arrays.copyOf(num1,num1.length+(num1.length>>1));//
		System.out.println("Two --"+num1.length);
		
		
		List<Integer> list1 = new ArrayList<>();//10
		List<Integer> list2 = new ArrayList<>(50);
		List<Integer> list3 = new ArrayList<>(list2);
		*/
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10); //new Integer(10)
		numbers.add(12);
		numbers.add(1310);
		numbers.add(1450);
		numbers.add(316);
		numbers.add(316);
		numbers.add(14036);
		numbers.add(1206);
		numbers.add(1206);
		numbers.add(102);
		
		System.out.println("print duplicates from list");
		HashSet<Integer> set = new HashSet<>();
		for(Integer item :numbers){
			if(set.add(item)==false){
				System.out.println(item);
			}
		}
		
		
		
		printArrayListElements(numbers);
		
		/*List<Vehicle> vechilesList = new ArrayList<>();
		vechilesList.add(new Vehicle(11,"X1"));
		vechilesList.add(new Vehicle(12,"T1"));
		vechilesList.add(new Vehicle(13,"Y1"));
		vechilesList.add(new Vehicle(14,"ZY"));
		vechilesList.add(new Vehicle(15,"AB"));
		
		
		System.out.println(numbers);
		System.out.println(vechilesList);

		
		List<Integer> listNumbers = new LinkedList<>();
		listNumbers.add(10);
*/		
		//Doubly LinkedList
		
		
	}

	public static void printArrayListElements(List<Integer> numbers) {
		System.out.println("using for loop");
		
		for(int i=0;i<numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		
		
		System.out.println("using foreach loop");
		for(Integer i:numbers){
			System.out.println(i);
		}

		
		
		System.out.println("using iterator");//hasNext next remove
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		System.out.println("using listiterator");
		ListIterator<Integer> litr = numbers.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}	
		
		System.out.println("using consumer functional interface");
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
					System.out.println(t);
			}
		});
		
		
		System.out.println("usnig lambda expression");
		numbers.forEach(n -> System.out.println(n));
		
		System.out.println("using lambda expression");
		numbers.forEach(System.out::println);
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}

class Vehicle{
		int vehicleId;
		String vehicleName;
		public Vehicle(int vehicleId, String vehicleName) {
			super();
			this.vehicleId = vehicleId;
			this.vehicleName = vehicleName;
		}
		public int getVehicleId() {
			return vehicleId;
		}
		public void setVehicleId(int vehicleId) {
			this.vehicleId = vehicleId;
		}
		public String getVehicleName() {
			return vehicleName;
		}
		public void setVehicleName(String vehicleName) {
			this.vehicleName = vehicleName;
		}
		@Override
		public String toString() {
			return "\nVehicle [vehicleId=" + vehicleId + ", vehicleName="
					+ vehicleName + "]";
		}
		
		
		public Vehicle(){
			
		}
		
		
		
}


class Mahindra extends Vehicle{
	
}




