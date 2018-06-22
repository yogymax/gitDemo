		package com.scp.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
		
/**
 *  Serialization Keyword chart ---
 *  Serialization vs deserialization
 *  WriteObject vs ReadObject -- when you will override and why private--thn 
 *  how it's overriden as you are narrow down the scope
 *  Serialization inheritance scenarios
 *  transient and volatile keyword
 * 
 * 
 * 
 * 
 * 
 *
 */


		public class TestSerializatonConcept {
		
			public static void main(String[] args) throws IOException, ClassNotFoundException {
				
				//Student st1 = new Student(411046); //id =10 , clgID =1111 pinc411046
				//final id
				//static clgid
				//transient pic
				//10 | 1111| 0
				
				Company infy1 = new Company(1021, "Pune",10000);
				File file = new File("C:\\Users\\Yogesh\\Desktop\\Notes\\Serialization\\stud.txt");
				
				
				
				/*FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(st1);
				oos.close();
				*/
				System.out.println("Serialization Completed");
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				//Company infy2 = (Company)ois.readObject();
				TestSerialVersionUID deStud = (TestSerialVersionUID)ois.readObject();
				ois.close();
				
				System.out.println("DeSerialization Completed");
				
				//System.out.println("Se -- " + st1);
				System.out.println("De -- " +deStud);
				
				//System.out.println(infy1==infy2); // false
				
				
				
				//System.out.println("Se "+infy1);
				//System.out.println("DSE "+infy2);
				
				
				
			}
			
			
		}

		
		
		class Student implements Serializable{
			final int id;
			static int collageId;
			transient int pincode;
			
			public Student(int pincode) {
				super();
				this.pincode = pincode;
				collageId=11111;
				this.id=10;
			}

			@Override
			public String toString() {
				return "Student [id=" + id + ", pincode=" + pincode + ", Cid=" + collageId + "]";
			}
			
			
			
			
		}
		
		
		
		
		
		class Company implements Serializable{

			private static final long serialVersionUID = 1L;
			int headCount;
			String address;
		 transient double companyProfit;
			
			@Override
			public String toString() {
				return "Company [headCount=" + headCount + ", address="
						+ address + ", CompayProfit="
								+ companyProfit + "]";
			}

			private void writeObject(ObjectOutputStream oos) throws IOException{
				oos.defaultWriteObject(); // -- 1021,Pune,0
				oos.writeObject(1020120);
				String ob = companyProfit+"10201";
				oos.writeObject(ob); //1000010201
				
				System.out.println("Encrypted while se--"+ob); 
			}
			
			private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
				ois.defaultReadObject(); //1021,Pune,0
				int dummyNo = (int)ois.readObject();
				System.out.println("de -- " +dummyNo);
				String ob = (String )ois.readObject();
				System.out.println("de -- Profile" +ob);//1000010201
				ob= ob.substring(0,5);
				this.companyProfit= Double.parseDouble(ob);
				System.out.println("de -- decrypted Profile" +companyProfit);
			}
			
			/**
			 * Serialization -- Java ob -- file/new supported
			 * De -- File/nw -- java ob
			 * 
			 * transient -- not to serialize --will be serizalied to the default values
			 * 
			 * private void writeObject(OOS){
			 * 		oos.defaultWriteObject();
			 * 		cp = cp*2; //87
			 * 		oos.writeObject(cp);
			 * }
			 * 
			 * private void readObject(ois){
			 * 		ois.defaultReadObject();
			 * 		Double encrptedOne = ois.readObject();
			 * 		Double decruptedOne = encypteone/2;
			 * 		this.cp=decruptedOne;
			 * }
			 * 
			 * 
			 * 
			 * A imp s   B  -- (a), (b)
			 * A      b impl s (a) --no   (b) yes -- but A shuld hav defualt contr -- A chya fields serialize hotil pn as per daty
			 * 
			 * A s  b s  -- private meth
			 * 
			 * 
			 * 
			 * 
			 * 
			 * A 
			 * 		x=10
			 * B impl se
			 * 		y=20
			 * 
			 *  writeOb(a); // notser
			 *  writeOb(b);  ==y=20 ..x =null , 0.0,0
			 * 
			 * 
			 * A IMPL S
			 * B e A
			 * 
			 * WRITE (a)
			 * WRITE(B )
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			
			
			
			
			
			//Innerclass -- eager inilization -- instace -- Object readResolve()
			
			public Company(){
				System.out.println("Inside default constrcutor");
			}
			
			public Company(int headCount, String address,double cmpyP) {
				super();
				this.headCount = headCount;
				this.address = address;
				this.companyProfit=cmpyP;
				System.out.println("Inside p constrcutor");
			}
			
			
		}
		
		
		
		
		
/**		
 * 
 * transient -- Serialization
 * 
 * 
 * Volatile -- Synchronization
 * 
 * 
 * 
 * 
 * 
 */
		
		
		
		
		
		/**
		 *  Converting java object into n/w supported or file supported format -- Serialization 
		 * Converting n/w supported or file supported format into Java Object-- DeSerialization
		 */
