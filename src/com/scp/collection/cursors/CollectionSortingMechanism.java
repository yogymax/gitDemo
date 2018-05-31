package com.scp.collection.cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortingMechanism {
	
	public static void main(String[] args) {
		
		/**
48 - 0
57-  9
	95
65 -A
90	Z
	95
97 a
122 z
		 * 
		 */
		
/*		String str = "09_AZ_az";
		char[] chArray= str.toCharArray();
		for (char ch : chArray) {
			System.out.println((int)ch);
		}

		Integer value = 10;
		//1010
		String st = value.toBinaryString(20);
		System.out.println(Integer.parseInt(st));
*/		
		
		
		
		
		List<Integer> listOfNums= new ArrayList<Integer>();
		listOfNums.add(190);
		listOfNums.add(20);
		listOfNums.add(406);
		listOfNums.add(1078);
		listOfNums.add(130);
		listOfNums.add(190);
		listOfNums.add(180);
		
		System.out.println("Unsorted numbers -- "+listOfNums);
		Collections.sort(listOfNums);
		System.out.println("Sorted numbers -- "+listOfNums);
		
		Car car1 = new Car(11,"swift",956000);
		Car car2 = new Car(12,"XuV500",100000);
		Car car3 = new Car(13,"1zerna",110000);
		Car car4 = new Car(14,"Audi",952000);
		
		List<Car> cars = new ArrayList<>();
		cars.add(car4);
		cars.add(car2);
		cars.add(car1);
		cars.add(car3);
		
		System.out.println("Unsorted numbers -- "+cars);
		//Collections.sort(cars); Natural sorting
		Collections.sort(cars,new CarPriceSort());//Price sort
		System.out.println("Sorted Cars by Price -- "+cars);
		Collections.sort(cars,new CarNameSort());//Name sort
		System.out.println("Sorted Cars by Name -- "+cars);
	}
	
	

}

class CarPriceSort implements Comparator<Car>{

	@Override
	public int compare(Car car1, Car car2) {
		return (int) (car1.getCarPrice()-car2.getCarPrice());
	}
	
}

class CarNameSort implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getCarName().compareTo(o2.getCarName());
	}
	
}

/**
 *
 * To sort user defined objs you have two imp interfaces those are
 * 	1.Comparable
 * 			int compareTo(obj)
 *	  --natural sorting -- you have a single sorting sequence at a time
 * 		-- Collections.sort(list)	
 * 		--java.lang
 * 
 * 	2.Comparator
 * 			int compare(obj1,obj2)
 * 			boolean equals(obj1)
 * 		--customized sorting -- you can have many sorting seqs at a time
 * 		-- Collections.sort(list,comparatortypeobj)
 * 		-- java.util
 * 
 * methods inside comparble and comaparator are callback methods
 * 
 *MEthod returns ---  
 * 0 == equal
 * +ve =  LHS obj is greater swap the objects
 * -ve = LHS obj is smaller no need to sort which already in sorted seq
 * 
 */


class Car {//implements Comparable<Car>{
	private int carId;
	private String carName;
	private long carPrice;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public long getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "\n Car [carId=" + carId + ", carName=" + carName + ", carPrice="
				+ carPrice + "]";
	}
	public Car(int carId, String carName, long carPrice) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*@Override
	public int compareTo(Car alelaCarOb) {
		return  alelaCarOb.getCarId() - this.getCarId();
		//return this.getCarName().compareTo(alelaCarOb.getCarName());
		//return (int) (this.getCarPrice()-alelaCarOb.getCarPrice());
	}*/
	
	
	
	
	
	
}
