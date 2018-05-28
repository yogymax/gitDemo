package com.scp.java.ten.basics;

import java.util.HashSet;
import java.util.Set;

public class CollectionBasics5 {
	public static void main(String[] args) {
		
		int i=1929;
		//System.out.println(i & 15);
		
		
		/**
		 * HASHCODE AND EQUALS METHOD
		 * 
		 * object
		 * 		hashcode  address based
		 * 		equals == 
		 * 
		 * userdefined 
		 * 		in case not present hashcode and equals -- object
		 * 		if present -- same will be used
		 * 
		 * 
		 */
		
		
		Mobiles samsung1 = new Mobiles(10,"A");//1000
		Mobiles samsung2 = new Mobiles(10,"A");//1200
		Mobiles samsung3 = new Mobiles(10,"A"); //900
		Mobiles samsung4 = new Mobiles(10,"B"); //900
		
		HashSet<Mobiles> setOfmobiles = new HashSet<>(); //16
		setOfmobiles.add(samsung1);
		setOfmobiles.add(samsung2);
		setOfmobiles.add(samsung3);
		setOfmobiles.add(samsung4);
		
		System.out.println(setOfmobiles.size());
		
		//equals == ref equality
		//hashcode == address based comparism
		
		
		
		Env e1 = new Env(1,"LocalQA");//1
		Env e2 = new Env(1,"LocalQA");//
		Env e3 = new Env(2,"LocalQA");//2
		Env e4 = new Env(3,"LocalQA");//3
		
		/**
		 * equals  --- ==
		 * hashcode
		 * 
		 * 
		 */
		
		Env e5 = e4;//Duplicate
		Set<Env> setOfEnvs = new HashSet<>();
		setOfEnvs.add(e1);
		setOfEnvs.add(e2);
		setOfEnvs.add(e3);
		setOfEnvs.add(e4);
		setOfEnvs.add(e5);
		
	//	System.out.println("SetOfEnv Size -- "+setOfEnvs.size());
		
		Set<Integer> setOfNums = new HashSet<>();
		setOfNums.add(new Integer(1));
		setOfNums.add(new Integer(1));
		setOfNums.add(new Integer(10));
		setOfNums.add(new Integer(13));
		setOfNums.add(new Integer(11));
		
		//System.out.println(setOfNums.size());
		
	}
}


class Env{
	private int envId;
	private String envName;
	public Env(int envId, String envName) {
		super();
		this.envId = envId;
		this.envName = envName;
	}
	public Env() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEnvId() {
		return envId;
	}
	public void setEnvId(int envId) {
		this.envId = envId;
	}
	public String getEnvName() {
		return envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}
	@Override
	public String toString() {
		return "\n Env [envId=" + envId + ", envName=" + envName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + envId;
		result = prime * result + ((envName == null) ? 0 : envName.hashCode());
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
		Env other = (Env) obj;
	/*	if (envId != other.envId)
			return false;*/
		if (envName == null) {
			if (other.envName != null)
				return false;
		} else if (!envName.equals(other.envName))
			return false;
		return true;
	}
	
	
	
	
	
	
}



/**
 * 
 * 
 * Collection
 * 		-- only object not primities
 * 		-- homogenous + hetrogenous object hold
 * 		-- every collection implemented class has backend ds
 * Set - -Inteface
 * 		-- duplicates are not allowed
 * 		-- single null is allowed
 * 		-- sequence order is not maintained
 * 
 * set
 * 		--hashset(C) -- hashtable
 * 			--Linkedhashset(c) (DoubleLinkedlist+hashtable)
 * 		--sortedset(I)
 * 			--NavigableSet(i)
 * 				--treeset(c) (BalanceTree)
 * 
 * 		
 */




class Mobiles{
	private int mobId;
	private String mobName;
	
	public Mobiles(int mobId, String mobName) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
	}
	
	@Override
	public String toString() {
		return "\n Mobiles [mobId=" + mobId + ", mobName=" + mobName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobId;
		result = prime * result + ((mobName == null) ? 0 : mobName.hashCode());
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
		Mobiles other = (Mobiles) obj;
		if (mobId != other.mobId)
			return false;
		if (mobName == null) {
			if (other.mobName != null)
				return false;
		} else if (!mobName.equals(other.mobName))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}

