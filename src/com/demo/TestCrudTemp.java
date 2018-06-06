	package com.demo;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.List;

	/**
	 * 
	 * Test Class 
	 * 
	 * Emp class
	 * 		id,nm, tostring pc (Note -- right click on class -- source )
	 * Product class
	 * 		id,nm, tostring pc
	 * 
	 * interface Myservice
	 * 		CRUD 
	 * 
	 * interface MyObj  -- to have all object under same structure -- Product n EMp
	 * 
	 * MyEmpService iml Myservice
	 * MyProductService imp Myservice
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 */


	public class TestCrudTemp {

		static MyService service =null;
		
		static{
			service = new MyEmpService(); //AB
		}
		
		public static void main(String[] args) throws IOException, InterruptedException {
			
			
			Employee e1 = new Employee(10,"A1");//900
			e1 = new Employee(20,"b"); // can change ref or value
			
			final Employee e2 = new Employee(10,"A1");//1000
			//e2=e1; // can change values but not ref
			
			
			//should not change value or ref -- immutable/**
			
			String s1 ="ABC";//immutable object
			StringBuffer sb = new StringBuffer(s1); //mutatble - reverse.append
			s1 = sb.toString();//immutbale
			StringBuilder sbc = new StringBuilder(s1);
			
			/**
			 * class -- final
			 * make private final -- variables
			 * make constructor as private
			 * remove setters -- keep only getters
			 * Make sure there is no mutable field in a class
			 * if present you should retun a copy from it's getter
			 * final Emp e1 = new Emp();
			 */
			
			
			//Runtime -- Process -- Inputstream -- InputStreamReader 
			//-- Bufferreader -- readline
			
			
			
			/*Process process = Runtime.getRuntime().exec("cmd /c javac -version");//Runtime.getRuntime().exec("C:\\Program Files\\Java\\jdk1.7.0\\bin\\javac.exe");
			process.waitFor();
			InputStream ips = process.getInputStream();*/
			
			ProcessBuilder   ps=new ProcessBuilder("java.exe");
			ps.redirectErrorStream(true);
			Process p = ps.start();
			
			String line = null;
			BufferedReader breadr = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while((line=breadr.readLine())!=null){
				System.out.println(line);
			}
				
			
			
			/*Employee e0 = new Employee(10,"Emp10");
			Employee e1 = new Employee(11,"Emp11");
			Employee e2 = new Employee(12,"Emp12");
			Employee e3 = new Employee(13,"Emp13");
			*/
			/*service.addEntity(e0);
			service.addEntity(e1);
			service.addEntity(e2);
			service.addEntity(e3);
			
			System.out.println("Get All EMployeesss..");
			System.out.println(service.getAllEntities());
		*/	
			/*System.out.println("Get whose id is 12");
			System.out.println(service.getEntity(12));
			
			System.out.println("Get whose id is 100");
			System.out.println(service.getEntity(100));
			*/
			
			
			System.out.println(service.deleteEntity(11));
			System.out.println(service.getAllEntities());
			
			
			
		}
	}

	//cotract which specifies what inside service but not how
	interface MyService1{
		public MyObj getEntity(int id);
		public boolean deleteEntity(int id);
		public MyObj updateEntity(MyObj o);
		public boolean addEntity(MyObj o);
		public List<MyObj> getAllEntities();
	}



	class MyEmpService1 implements MyService {

		static List<Employee> empList = new ArrayList<Employee>();
		
		
		@Override
		public MyObj getEntity(int uid) {
			for(Employee item:empList){
				if(item.empId==uid){
					return item;
				}
			}
			return null;

		}
		
		
		private boolean checkInstanceOf(MyObj o) {
			return o instanceof Employee;
		}
		
		
		@Override
		public boolean deleteEntity(int uid) {
			
			MyObj ob= getEntity(uid); //Null or Obj
			
			if(ob==null){
				System.out.println("Emp not present");
			}else{
				for(Employee item:empList){
						if(item.empId==uid){
							empList.remove(item);
							return true;
						}
					
				}
				
			}
			
			return false;
		}

		@Override
		public MyObj updateEntity(MyObj uob) {
			
			Employee uemp = (Employee)uob;
			//check ahe ka
			if(uemp==null){
				System.out.println("Emp doesnt exist...so cannot update");
			}else{
				for(Employee item:empList){
					
					if(item.empId==uemp.empId){
						item.empId=uemp.empId;
						item.empName=uemp.empName;
						return item;
					}
					
				}
			}
			return null;
		}

		@Override
		public boolean addEntity(MyObj o) {
			
			boolean flag = checkInstanceOf(o);
			if(!flag){
				System.out.println("object is not of a type of emp");
				return false;
			}
			
			Employee emp = (Employee)o;
			return empList.add(emp);
		}

		@Override
		public List<MyObj> getAllEntities() {
			List<MyObj> myObjs = new ArrayList<>();
			for(Employee e :empList){
				myObjs.add(e);
			}
			return myObjs;
		}
		
	}


	class MyProductService1 implements MyService{

		static List<Product> productList = new ArrayList<Product>();
		
		@Override
		public MyObj getEntity(int uid) {
			for(Product item:productList){
				if(item.productId==uid){
					return item;
				}
			}
			
			return null;

		}

		@Override
		public boolean deleteEntity(int uid) {
			MyObj ob= getEntity(uid); //Null or Obj
			
			
			if(ob==null){
				System.out.println("Product not present");
			}else{
				for(Product item:productList){
						if(item.productId==uid){
							productList.remove(item);
							return true;
						}
				}
				
			}
			
			return false;
		}

		@Override
		public MyObj updateEntity(MyObj uob) {
			boolean flag = checkInstanceOf(uob);
			
			if(!flag){
				System.out.println("MyObj is not a type of Product");
				return null;
			}
			Product uProd = (Product)uob;
			//check ahe ka
			if(uProd==null){
				System.out.println("Product doesnt exist...so cannot update");
			}else{
				for(Product item:productList){
					if(item.productId==uProd.productId){
						item.productId=uProd.productId;
						item.productName=uProd.productName;
						return item;
					}
					
				}
			}
			return null;
		}

		@Override
		public boolean addEntity(MyObj o) {
			
			boolean flag = checkInstanceOf(o);
			
			if(!flag){
				System.out.println("Object is not a type of prodcut");
				return false;
			}
			
			Product prod = (Product)o;
			return productList.add(prod);	
			
		}

		private boolean checkInstanceOf(MyObj o) {
			return o instanceof Product;
		}

		@Override
		public List<MyObj> getAllEntities() {
			List<MyObj> myObjs = new ArrayList<>();
			for(Product e :productList){
				myObjs.add(e);
			}
			return myObjs;
		}
		
	}

	interface MyObj1 {
		//just to have product and emp object under same umbrella
	}

	final class Employee1 implements MyObj{
		int empId;
		String empName;
		public Employee1(int empId, String empName) {
			super();
			this.empId = empId;
			this.empName = empName;
		}
		@Override
		public String toString() {
			return "\n Employee [empId=" + empId + ", empName=" + empName + "]";
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		
		
		
		
	}

	class Product1 implements MyObj{
		int productId;
		String productName;
		public Product1(int productId, String productName) {
			super();
			
			this.productId = productId;
			this.productName = productName;
		}
		@Override
		public String toString() {
			return "\nProduct [productId=" + productId + ", productName="
					+ productName + "]";
		}
		
		
	}





	
	
