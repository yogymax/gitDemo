package com.demo;

import com.demo.EmpFactory.EmpTypes;

public class TestFactoryDesignPattern {
	public static void main(String[] args) {
		Emp e1 = EmpFactory.getEmpInstance(EmpTypes.pemp);
		Emp e2 = EmpFactory.getEmpInstance(EmpTypes.cemp);
		
		
		System.out.println(e1 instanceof PEmp);//true
		System.out.println(e1 instanceof CEmp);//false
		
		System.out.println(e2 instanceof PEmp);//false
		System.out.println(e2 instanceof CEmp);//true
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getNoOfHolidays());
		System.out.println(e1.getSalary());
		
		System.out.println("----------------------");
		System.out.println(e2.getEmpId());
		System.out.println(e2.getNoOfHolidays());
		System.out.println(e2.getSalary());
	}
}

abstract class Emp{
	abstract public int getSalary();
	abstract public int getNoOfHolidays();
	abstract public int getEmpId();

}

class PEmp extends Emp{

	@Override
	public int getSalary() {
		return 50000;
	}

	@Override
	public int getNoOfHolidays() {
		// TODO Auto-generated method stub
		return 31;
	}

	@Override
	public int getEmpId() {
		// TODO Auto-generated method stub
		return 102102;
	}

	
}

class CEmp extends Emp{

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 25000;
	}

	@Override
	public int getNoOfHolidays() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int getEmpId() {
		// TODO Auto-generated method stub
		return 1021;
	}
	
}

class EmpFactory {
	
	public static Emp getEmpInstance(EmpTypes type){
		if(type.equals(EmpTypes.pemp)){
			return new PEmp();
		}else if(type.equals(EmpTypes.cemp)){
			return new CEmp();
		}
		return null;
	}
	

	enum EmpTypes{
		pemp,
		cemp
	}
	
}


