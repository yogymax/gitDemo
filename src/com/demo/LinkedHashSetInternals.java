package com.demo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashSetInternals {

	
	/**
	 * 
	 * 
	 * 
	 * Internally uses LinkedHashmap
	 * Seq order is reserved
	 * Node Structure --- |before|key|value|hash|next|after|
	 * Constrcutors
	 * 			()
	 * 			(cap)
	 * 			(collection)
	 * 			(cap,loadFactor)
	 * 
	 * Synchoronized -- 
	 * 				Nhiye
	 * 				
	 *Collections.SynechronizedSet(lhset)
	 *
	 * iterator		
	 * 		--
	 * 
	 * no get method -- in set underlying implemented classes
	 * hashtable + LinkedList
	 * 
	 * 16 --
	 * 
	 * 
	 * sortedSet (1.2)
	 * NavigableSet(1.6)--
	 * TreeSet --- (1.4)
	 * 
	 * 
	 * 	--
	 * 		--Duplicate not allowed
	 * 		-- Seq not preserved
	 * 		-- null --
	 * 			1.6 -- null --first --kahich allowed
	 * 			-- BalancedTree -- 
	  *         -- Treeset allows only those objects which we can compare 
	 * 
	 * 
	 * 12 4,17,120,8,9,102,43,14
	 * 
	 * Set --
	 * 	hashcode
	 * equals
	 * 
	 * comparable/comparator 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		//ortedSet
		
		Book b1 = new Book(1012,"Spring4",10201);
		Book b2 = new Book(12,"Spring1",143101);
		Book b3 = new Book(13,"Spring2",9201);
		Book b11 = new Book(1,"Sprteqwg4",201);
		Book b21 = new Book(31,"daxang1",6101);
		Book b31 = new Book(41,"Sasapring2",701);

		Comparator<Book> idCompare = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getBookId()-o2.getBookId();
			}
		};
		
		
		TreeSet<Book> treeSet1 = new TreeSet<>(idCompare);
		
		
		System.out.println("using Linkedhashset");
		LinkedHashSet<Book> setOfBooks1 = new LinkedHashSet<>();
		
		setOfBooks1.add(b1);
		setOfBooks1.add(b2);
		setOfBooks1.add(b3);
		setOfBooks1.add(b1);
		setOfBooks1.add(b11);
		setOfBooks1.add(b21);
		setOfBooks1.add(b31);
		System.out.println(setOfBooks1.size());
		Iterator<Book> itr = setOfBooks1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		
		
		System.out.println("using hashset");
		Set<Book> setOfBooks = new HashSet<>();
		setOfBooks.add(b1);
		setOfBooks.add(b2);
		setOfBooks.add(b3);
		setOfBooks.add(b1);
		setOfBooks.add(b11);
		setOfBooks.add(b21);
		setOfBooks.add(b31);
		System.out.println(setOfBooks.size());
		Iterator<Book> itr1 = setOfBooks.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}

		
		
		
	}
}


class Book implements Comparable<Book>{
	private int bookId;
	private String bookName;
	private int bookPrice;
	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookPrice=" + bookPrice + "]";
	}
	public Book(int bookId, String bookName, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result
				+ ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookPrice;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookPrice != other.bookPrice)
			return false;
		return true;
	}
	@Override
	public int compareTo(Book o) {
		return this.bookId-o.bookId;
	}
	
	
}
