		package com.scp.serialization;
		import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
/**
 * Externalization serialize a part of ur object --
 * developer's responsibility
 * Child of serialization -- not a marker 
 * writeExternal(ObjectOutput)
 * readExternal(ObjectInput)
 * default Constrcutor is mandatory -- no reflection 
 * Consumes less bandwith --
 * 
 *  Serialization vs DeSe
 *  Seri - Exter
 */


		public class TestSerialVersionUID {
		  public static void main(String[] args) throws IOException, ClassNotFoundException {
			/*  	Student1 st1 = new Student1(10, "PQR");
			  	
			  	FileOutputStream fos = new FileOutputStream("abcd.txt");
			  	ObjectOutputStream oos = new ObjectOutputStream(fos);
			  	oos.writeObject(st1);
			  	oos.close();
*/			  	
			  	FileInputStream fis = new FileInputStream("abcd.txt");
			  	ObjectInputStream ois =new ObjectInputStream(fis);
			  	Student1 dst = (Student1)ois.readObject();
			  	System.out.println(dst);
		  }
		}
		
		class Student1 implements Externalizable{
			
			
			
			
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 2L;
			
			/**
			 * Serialization --- Externalization ==
			 * 
			 * marker interface -- No marker
			 * Process handled by JVM --- By Developer -- 
			 * Parent -- Child of serialization
			 * Reflection -- Constrcutor
			 * Whole object will be serializaed -- part of object
			 * 
			 * 
			 * 
			 * 
			 */
			
			int studId;
			String studName;
			String address;
			
			public Student1(int studId, String studName,String ad) {
			//public Student1(int studId, String studName) {
				super();
				this.studId = studId;
				this.studName = studName;
				this.address=ad;
			}
			@Override
			public String toString() {
				return "Student [studId=" + studId + ", studName=" + studName + ", address=" + address + "]";
			}
			@Override
			public void writeExternal(ObjectOutput out) throws IOException {
				
			}
			@Override
			public void readExternal(ObjectInput in) throws IOException,
					ClassNotFoundException {
				// TODO Auto-generated method stub
				
				
			}
			
/**			
 * 1 -- 100
 * 
 * 1--100
 * 4 -- 2.5
 * no of cores --- CPU intensive 4
 * Io intensive --  >4   6 9
 *
 * Impls Runnable
 * Extends Thread
 * Impls Callable
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
 * 1000/60 == 
 * 
 * 
 * 
 */
			
			
		}
