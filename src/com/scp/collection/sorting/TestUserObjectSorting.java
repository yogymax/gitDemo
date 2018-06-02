package com.scp.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestUserObjectSorting {

	public static void main(String[] args) {
		sortingUsingComparable();
		sortingUsingComparator();
		sortingUsingAnnounymousImplementation();
		sortingUsingAnnounyButGivenInsideDomainClass();
	}

	private static void sortingUsingAnnounyButGivenInsideDomainClass() {
		System.out.println("inside sortingUsingAnnounyButGivenInsideDomainClass");
		List<Mobi> listOfMobis  = getDummyMobis();
		System.out.println("before soring --" +listOfMobis);
		
		Collections.sort(listOfMobis,MobiSortingLogicUtil.idBasedCompare);
		System.out.println("sorting based on ID" + listOfMobis);
		
		Collections.sort(listOfMobis,MobiSortingLogicUtil.idNPriceCompare);
		System.out.println("sorting based on ID nad price"+ listOfMobis);
		
		Collections.sort(listOfMobis,MobiSortingLogicUtil.nameBasedCompare);
		System.out.println("sorting based on name"+ listOfMobis);
		
		Collections.sort(listOfMobis,MobiSortingLogicUtil.priceBasedCompare);
		System.out.println("sorting based on price"+ listOfMobis);
		
		
		
		
		
		
	}

	private static void sortingUsingAnnounymousImplementation() {
		System.out.println("inside sortingUsingAnnounymousImplementation");
		List<Mobi> listOfMobis  = getDummyMobis();
		
		Comparator<Mobi> idBasedCompare = new Comparator<Mobi>(){
			@Override
			public int compare(Mobi o1, Mobi o2) {
				return o1.getMobileId() - o2.getMobileId();
			}
			
		};
		
		System.out.println("before id Sorting --" +listOfMobis);
		Collections.sort(listOfMobis,idBasedCompare);
		System.out.println("After id Sorting --" +listOfMobis);
		
		
		Comparator<Mobi> idNPriceCompare = new Comparator<Mobi>(){
			@Override
			public int compare(Mobi o1, Mobi o2) {
				int temp = o1.getMobileId()-o2.getMobileId();
				if(temp==0){
					temp = (int) (o1.getPrice()-o2.getPrice());
				}
				return temp;
			}
		};

		
		System.out.println("before id n priceSorting --" +listOfMobis);
		Collections.sort(listOfMobis,idNPriceCompare);
		System.out.println("After id n price Sorting --" +listOfMobis);
		
		
		
		
	}

	private static void sortingUsingComparator() {
		List<Mobi> listOfMobis  = getDummyMobis();
		
		System.out.println("before Sorting --" +listOfMobis);
		//Collections.sort(listOfMobis, new Mobi()); ideally should not be like this as your domain class should not have sorting logic in case of customized sorting
		Collections.sort(listOfMobis,new SortMobisBasedOnId());
		System.out.println("after based on ID Sorting --" +listOfMobis);
		Collections.sort(listOfMobis,new SortMobisBasedOnName());
		System.out.println("after based on Name Sorting --" +listOfMobis);
		Collections.sort(listOfMobis,new SortMobisBasedOnPrice());
		System.out.println("after based on price Sorting --" +listOfMobis);
		
		Collections.sort(listOfMobis,new SortMobisBasedOnNamenPrice());
		System.out.println("after based on name and price Sorting --" +listOfMobis);
		
	}

	private static List<Mobi> getDummyMobis() {
		Mobi m1 = new Mobi(11,"Samsung",20000);
		Mobi m2 = new Mobi(122,"iPhone",80000);
		Mobi m3 = new Mobi(346,"Samsung",10000);
		Mobi m4 = new Mobi(354,"LG",12000);
		Mobi m5 = new Mobi(57,"Vivo",7000);
		Mobi m6 = new Mobi(64,"Nokia",25000);
		Mobi m7 = new Mobi(64,"Nokia",333333);
		Mobi m8 = new Mobi(64,"Nokia",25000);
		
		List<Mobi> listOfMobis = new ArrayList<Mobi>();
		listOfMobis.add(m1);
		listOfMobis.add(m2);
		listOfMobis.add(m3);
		listOfMobis.add(m4);
		listOfMobis.add(m5);
		listOfMobis.add(m6);
		listOfMobis.add(m7);
		listOfMobis.add(m8);
		return listOfMobis;
		
	}

	private static void sortingUsingComparable() {
		Mobile m1 = new Mobile(1102,"Samsung",20000);
		Mobile m2 = new Mobile(122,"iPhone",80000);
		Mobile m3 = new Mobile(346,"MI",10000);
		Mobile m4 = new Mobile(354,"LG",12000);
		Mobile m5 = new Mobile(57,"Vivo",7000);
		Mobile m6 = new Mobile(64,"Nokia",25000);
		
		List<Mobile> listOfMobiles = new ArrayList<Mobile>();
		listOfMobiles.add(m1);
		listOfMobiles.add(m2);
		listOfMobiles.add(m3);
		listOfMobiles.add(m4);
		listOfMobiles.add(m5);
		listOfMobiles.add(m6);
		
		System.out.println("NO of Mobiles in a list --" +listOfMobiles.size());
		/*System.out.println("iterating mobiles---");
		for (Mobile item : listOfMobiles) {
			System.out.println(item);
		}
		*/
		
		System.out.println("Mobiles in a list before sort --" +listOfMobiles);
		Collections.sort(listOfMobiles); //natural
		System.out.println("Mobiles in a list after sort --" +listOfMobiles);
		

		
	}
	
}

/**
 * 
 * Mobile class -- domain object 
 *
 */

class Mobile implements Comparable<Mobile>{
	private int mobileId;
	private String modelName;
	private long price;
	@Override
	public String toString() {
		return "\n Mobile [mobileId=" + mobileId + ", modelName=" + modelName
				+ ", price=" + price + "]";
	}
	public Mobile(int mobileId, String modelName, long price) {
		super();
		this.mobileId = mobileId;
		this.modelName = modelName;
		this.price = price;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public int compareTo(Mobile o) {
		//return (int) (this.getPrice()-o.getPrice());
		//return this.getMobileId()-o.getMobileId();
		//return this.getModelName().compareTo(o.getModelName());
		

		int temp = this.getModelName().compareTo(o.getModelName());
		if(temp==0){
			temp = (int) (this.getPrice() - o.getPrice());
		}
		return temp;
	
		
		
	}
	
	
	
	
	
}


/**
 * comparable -
 * 		-- is an interface, used for natural sorting -
 * 				why it's a natural -- in collection sort no need to specify
 * 				soring mechanism as it takes based on domain object
 * 				compareto method
 * 		-- int compareTo(ob)
 * 		-- at a time you can have maximum one sorting seq, in case your client
 * 			want other sorting seq you need to change the domain class compareto 
 * 			method sorting logic
 * 		-- java.lang
 * 		-- mutilple fields but maximum one sorting sequences
 * comparator
 * 		-- is also an interface, used for customized sorting
 * 				why it's a customized -- in collection sort you can specify sorting seq
 * 		-- int compare(ob1,o2)
 * 		-- boolean equals(ob1)  -- Note -- no need override bydefault taken it from object class in which we have already an implementation which performs
 * 			ref equality
 * 		-- you can many sorting sequences no need to make changes in domain class
 * 		-- java.util
 *      -- mutilple fields multiple sorting sequences 
 * 
 * 
 * 0 -- both objects are equal
 * + -- LHS object is greater so swap is required
 * - -- RHS object is smaller keep as it is
 * 
 * String field -- call compareTo of string class
 * numberic -- minus
 * 
 * 
 */


class Mobi {

	private int mobileId;
	private String modelName;
	private long price;
	@Override
	public String toString() {
		return "\n Mobile [mobileId=" + mobileId + ", modelName=" + modelName
				+ ", price=" + price + "]";
	}
	public Mobi(int mobileId, String modelName, long price) {
		super();
		this.mobileId = mobileId;
		this.modelName = modelName;
		this.price = price;
	}
	public Mobi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

}


class SortMobisBasedOnPrice implements Comparator<Mobi>{
	@Override
	public int compare(Mobi o1, Mobi o2) {
		return (int) (o1.getPrice()-o2.getPrice());
	}
}

class SortMobisBasedOnId implements Comparator<Mobi>{
	@Override
	public int compare(Mobi o1, Mobi o2) {
		return o1.getMobileId()-o2.getMobileId();
	}
}

class SortMobisBasedOnName implements Comparator<Mobi>{
	@Override
	public int compare(Mobi o1, Mobi o2) {
		int temp = o1.getModelName().compareTo(o2.getModelName());
		return temp;
	}
}



class SortMobisBasedOnNamenPrice implements Comparator<Mobi>{
	@Override
	public int compare(Mobi o1, Mobi o2) {
		int temp = o1.getModelName().compareTo(o2.getModelName());
		if(temp==0){
			temp = (int) (o1.getPrice() - o2.getPrice());
		}
		return temp;
	}
}





/**
 * comparable
 * 		-- domain class implements comaparable and provides imlementation to 
 * 			compareTomethod -- can use many fields but at time single seq is allowed
 * comparator
 * 		-- using domain class
 * 		-- using seperate classes
 * 		-- using Annonymousclass -- on demand impltn.
 * 
 * 
 * 
 * All wrapper class , String  -- supports natural
 * 
 */




class MobiSortingLogicUtil {
	
	
	public static Comparator<Mobi> idBasedCompare = new Comparator<Mobi>(){
		@Override
		public int compare(Mobi o1, Mobi o2) {
			return o1.getMobileId() - o2.getMobileId();
		}
		
	};
	
	
	public static Comparator<Mobi> idNPriceCompare = new Comparator<Mobi>(){
		@Override
		public int compare(Mobi o1, Mobi o2) {
			int temp = o1.getMobileId()-o2.getMobileId();
			if(temp==0){
				temp = (int) (o1.getPrice()-o2.getPrice());
			}
			return temp;
		}
	};

	
	
	public static Comparator<Mobi> nameBasedCompare = new Comparator<Mobi>() {
		@Override
		public int compare(Mobi o1, Mobi o2) {
			return o1.getModelName().compareTo(o2.getModelName());
		}
	};
	
	public static Comparator<Mobi> priceBasedCompare = new Comparator<Mobi>() {
		@Override
		public int compare(Mobi o1, Mobi o2) {
			return (int) (o1.getPrice()- o2.getPrice());
		}
	};
	
	
	
}




