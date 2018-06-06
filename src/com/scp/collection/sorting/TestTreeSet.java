package com.scp.collection.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop(15,"A1");//A1
		Laptop l2 = new Laptop(10,"A1");//A2
		Laptop l3 = new Laptop(10,"A2");//A3
		Laptop l4 = new Laptop(12,"A3");//A4
		Laptop l5= l2;
		Laptop l6 = new Laptop(15,"A1");//A6
		
		Comparator<Laptop>  nameCompare = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		
		
		TreeSet<Laptop> laptopTree= new TreeSet<Laptop>(nameCompare);
		laptopTree.add(l1);
		laptopTree.add(l2);
		laptopTree.add(l3);
		laptopTree.add(l4);
		laptopTree.add(l5);
		laptopTree.add(l6);
		System.out.println(laptopTree.size());

		
		System.out.println(laptopTree);
		
		/*TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(13);
		treeSet.add(15);
		treeSet.add(10);
		System.out.println(treeSet.size());*/
	}

}


class Laptop implements Comparable<Laptop>{
	
	private int id;
	private String name;
	@Override
	public String toString() {
		return "\n Laptop [id=" + id + ", name=" + name + "]";
	}
	public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Laptop o) {
/*		int temp = this.id-o.id;
		if(temp==0){
			temp=this.name.compareTo(o.name);
		}*/
		return (this.id-o.id)==0 ? this.name.compareTo(o.name) : this.id-o.id;
	}
	
	
	
	
	
}