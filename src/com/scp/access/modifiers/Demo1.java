package com.scp.access.modifiers;

public class Demo1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp e1 = new Emp("A",20);
		Emp e2 = e1.clone();
		
		e1.setEname("B");
		
		System.out.println(e1==e2);//false
		System.out.println(e1.getEname()==e2.getEname());
		
	}
	
	
}




class Emp implements Cloneable{
	
	private String ename;
	private int empid;
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
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
		Emp other = (Emp) obj;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
	@Override
	protected Emp clone() throws CloneNotSupportedException {
		return (Emp) super.clone();
	}
	//private Address ad; //has a
	@Override
	public String toString() {
		return "\n Emp [ename=" + ename + ", empid=" + empid+"]"; //+ ", ad=" + ad + "]";
	}
	public Emp(String ename, int empid) {
		super();
		this.ename = ename;
		this.empid = empid;
		//this.ad = ad;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	/*public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}*/
	
	
}

class Address{
	private String city;
	private int pinCode;
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "\nAddress [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	
}