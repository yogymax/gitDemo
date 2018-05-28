package com.scp.java.ten.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class CollectionSet {
	static Book b4;
	
	public static void main(String[] args) {

	HashSet<Integer> setOfInt = new HashSet<>();
	setOfInt.add(10);
	setOfInt.add(20);
	setOfInt.add(10);
	setOfInt.add(12);
	setOfInt.add(new Integer(10));
	setOfInt.add(new Integer(20));
	
	System.out.println(setOfInt.size());//3
	
	HashSet<String> setOfString = new HashSet<>();
	setOfString.add("A");
	setOfString.add("A");
	setOfString.add("A");
	setOfString.add("A");
	setOfString.add("A");
	System.out.println(setOfString.size());
	
	/**
	 * no hashcode and equals -- both will come from object class
	 * 		-- set contract will be not work as expected
	 * 				-- even if object are same by content might get different
	 * 					bucket as obj's hashcode is based on address
	 * 
	 * 		even object are same by contents and placed into differenet buckets
	 * 		equals will be be applicable - as differnt buckets
	 * 
	 * 		even if these two objects placed into same bucket
	 * 		as equals from object class will check ref equality
	 * 
	 * both are from userdefined class
	 * 		-- will work provided that both methods are using same fields
	 * 
	 * equals from object class and hashcode from Userdefined class
	 * 			--even if same bucket as hashcode is ovverriden but
	 * 				equals will check ref 
	 * hashcode from object and equals from userdefined class
	 * 			-- even if contents are same might get differnet bucket as 
	 * 				hashcode is calculated based on user defined object's address
	 * 			
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 		
	 * 
	 * 
	 * Book [bookName=Core java, bookId=10]=ORMFramewordk5, 
 Book [bookName=Spring, bookId=10]=ORMFramewordk4, 
 Book [bookName=Hibernate, bookId=9]=ORMFramewordk3}

	 * 
	 */
	
	
	
	
	Book b1 = new Book("Core java",10);
	Book b2 = new Book("Spring",10);
	Book b3 = new Book("Hibernate",9);
	Book b4 = new Book("Spring",10);
	Book b5 = b1;
	HashSet<Book> setOfBook= new HashSet<>();
	System.out.println(setOfBook.add(b1)); //true
	System.out.println(setOfBook.add(b2)); //true
	System.out.println(setOfBook.add(b3)); // true
	System.out.println(setOfBook.add(b4)); //false
	System.out.println(setOfBook.add(b5)); //false
	
	System.out.println(setOfBook);
	//set --  b1, b2,b3 
	
	
	HashMap<Book,String> mapOfBooks = new HashMap<>();
	System.out.println(mapOfBooks.put(b1,"JavaDev1")); //null
	System.out.println(mapOfBooks.put(b2,"SpringFramework2"));//null
	System.out.println(mapOfBooks.put(b3,"ORMFramewordk3"));//null
	System.out.println(mapOfBooks.put(b4,"ORMFramewordk4"));//SpringFramework2
	System.out.println(mapOfBooks.put(b5,"ORMFramewordk5"));//JavaDev1
	// b1,ORMFramewordk5
	//b2 ORMFramewordk4
	//b3 ORMFramewordk3
	System.out.println(mapOfBooks);
	printCollectionInfo(mapOfBooks);
	
	}
	private static void printCollectionInfo(HashMap<Book, String> mapOfBooks) {
		
		System.out.println("\n\n");
		
		System.out.println("#########Using KeySet##################");
		Set<Book> setOfBooks =  mapOfBooks.keySet();
		Iterator<Book> itrB = setOfBooks.iterator();
		while(itrB.hasNext()){
			Book key = itrB.next();
			System.out.println("Key --" +key +" :: " +"Value --" +mapOfBooks.get(key)) ;
		}
		
		
		System.out.println("#########Using Values##################");
		Collection<String> listOfValues =mapOfBooks.values();
		List<String> listOfVal = new ArrayList<String>(listOfValues);
		Iterator<String> itr = listOfVal.iterator();
		while(itr.hasNext()){
			String val= itr.next();
			//System.out.println("Key --" +key);
			System.out.println("Value --" +val);
		}
		
		
		System.out.println("#########Using EntrySet##################");
		Set<Entry<Book,String>> setOfMapEntries = mapOfBooks.entrySet();
		Iterator<Entry<Book,String>> entryItr = setOfMapEntries.iterator();
		while(entryItr.hasNext()){
			Entry<Book,String> entry = entryItr.next();
			System.out.println("Key --"+entry.getKey() +" :: " +"Value -- "+entry.getValue());
			
			
		}
		
		
		
		
		
		
	}
	
}


class Book{
	String bookName;
	int bookId;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result
				+ ((bookName == null) ? 0 : bookName.hashCode());
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
		return true;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int bookId) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "\n Book [bookName=" + bookName + ", bookId=" + bookId + "]";
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	
	
	
	
}

