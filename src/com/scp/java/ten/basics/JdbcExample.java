package com.scp.java.ten.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//trywithresources

public class JdbcExample {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Product p1 = new Product(111,"iPhone",80000);
		ProductService service = new ProductServiceImpl();
		/*service.addProduct(p1);
		System.out.println("product successfully added....!");*/
		
		/*
		 System.out.println("Get all products from database...!"); 
		 List<Product> listOfProducts = service.getAllProduct();
		for (Product product : listOfProducts) {
			System.out.println(product);
		}*/
		
		
		//System.out.println("get product is  -- "+service.getProduct(111));
		p1.setProductPrice(75000);
		
		//System.out.println("Updated product values are -- " +service.updateProduct(p1));
		
		//System.out.println("delete product from database -- " +service.deleteProduct(p1.getProductId()));
		
		
		
	}

}


class Product{
	private int productId;
	private String productName;
	private double productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n Product [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + "]";
	}
}

interface ProductService{
	public boolean addProduct(Product p);
	public boolean deleteProduct(int id);
	public Product updateProduct(Product p);
	public Product getProduct(int id);
	public List<Product> getAllProduct();
}

class ProductServiceImpl implements ProductService{

	static Connection conn = null;
	static {
		conn= DatabaseUtil.getDatabaseConnection();
	}
	
	
	
	private Statement getStatement(){
		Statement stmt  = null;
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	/**
	 * 
	 * Differ 
	 * 		-- ky return kart
	 * 		-- kadhi kont use karaych
	 * execute -- 
	 * executeUpdate -- 
	 * executeQuery  -- 
	 * 
	 */
	
	
	@Override
	public boolean addProduct(Product p) {
		String insertQuery = "INSERT INTO PRODUCTS VALUES(";
		String finalQuery =insertQuery+p.getProductId()+",'" +p.getProductName()+"',"+p.getProductPrice()+")";
		Statement stmt = getStatement();
		int noOfRowsAfftected =0;
		try {
			noOfRowsAfftected=stmt.executeUpdate(finalQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return noOfRowsAfftected==1;
	}

	@Override
	public boolean deleteProduct(int id) {
		Product dbProduct = getProduct(id);
		int noOfRowsAfftected =0;
		if(null!=dbProduct){
			Statement stmt = getStatement();
			try {
				noOfRowsAfftected=stmt.executeUpdate("delete from products where p_id="+id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return noOfRowsAfftected==1;
	}

	@Override
	public Product updateProduct(Product p) {
		Product dbProduct = getProduct(p.getProductId());
		String updateQuery = "UPDATE PRODUCTS SET P_NAME='";
		updateQuery= updateQuery+p.getProductName()+"',P_PRICE="+p.getProductPrice()+" WHERE P_ID="+p.getProductId();
		
		if(null!=dbProduct){
			Statement stmt = getStatement();
			try {
				stmt.executeUpdate(updateQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return getProduct(p.getProductId());
	}

	@Override
	public Product getProduct(int id) {
		Statement stmt = getStatement();
		ResultSet resultSet;
		Product product = null;
		try {
			resultSet = stmt.executeQuery("select * from products where p_id="+id);
			while(resultSet.next()){
				product = new Product();
				try {
					product.setProductId(resultSet.getInt("P_ID"));
					product.setProductName(resultSet.getString("P_NAME"));
					product.setProductPrice(resultSet.getDouble("P_PRICe"));
					return product;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		

		Statement stmt = getStatement();
		ResultSet resultSet;
		Product product = null;
		List<Product> listOfProducts = new ArrayList<Product>();
		try {
			resultSet = stmt.executeQuery("select * from products");
			while(resultSet.next()){
				product = new Product();
				try {
					product.setProductId(resultSet.getInt("P_ID"));
					product.setProductName(resultSet.getString("P_NAME"));
					product.setProductPrice(resultSet.getDouble("P_PRICe"));
					listOfProducts.add(product);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return listOfProducts;
		
	
}
}


class DatabaseUtil{
	private static Connection connection= null; 
	
	//boilerplate
	
	public static Connection getDatabaseConnection(){
			if(connection==null){
				try {
					Class.forName("org.hsqldb.jdbcDriver"); // pass databsae driverclass
					connection= DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","SA","");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
					
		return connection;
	}
	
	
	public static void dbResourceCleanUp(Connection conn,Statement stmt ,ResultSet resultSet){
		
		
		if (null!=resultSet){
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(null!=stmt){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(null!=conn){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}




interface AppQueries{
	
	
	String insert_product ="";
	
	
	public static void main(String[] args) {
		Product p = new Product(10,"pqr",123.1);
		//String insertQuery = "INSERT INTO PRODUCTS VALUES(";
		//String finalQuery =insertQuery+p.getProductId()+",'" +p.getProductName()+"',"+p.getProductPrice()+")"; 
		
		String updateQuery = "UPDATE PRODUCTS SET P_NAME='";
		updateQuery= updateQuery+p.getProductName()+"',P_PRICE="+p.getProductPrice()+" WHERE P_ID="+p.getProductId();
		
		
		System.out.println(updateQuery);
		
	}
	
	
	
	/**
	 * 
	CREATE TABLE Products (
    P_ID int,
    P_Name varchar(255),
    P_PRICE NUMERIC
);

//INSERT INTO PRODUCTS VALUES(1,'MOBILE',1021.00)
 
//UPDATE PRODUCTS SET P_NAME='ABC', P_PRICE=112.0 WHERE P_ID=1
//SELECT * FROM PRODUCTS
//SELECT * FROM PRODUCTS WHERE P_ID=1
 
// DELETE FROM PRODUCTS WHERE P_ID=1
 
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

	 */
	
	
	
	
}




