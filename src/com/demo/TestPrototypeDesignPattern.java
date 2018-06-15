		package com.demo;

import java.util.ArrayList;
import java.util.List;
		
		public class TestPrototypeDesignPattern {
		public static void main(String[] args) throws CloneNotSupportedException {
				
			Computer comp = new Computer(100, 2);
			Computer comp1 = comp.clone();
		
			System.out.println(comp==comp1);//false
			
		}
		}
		
		
		class Computer implements Cloneable{
			int hdd;
			int ram;
			List<Computer> listOfComps = new ArrayList<Computer>();
			
			public Computer(int hdd, int ram) {
				super();
				this.hdd = hdd;
				this.ram = ram;
			}
			
			public Computer clone()throws CloneNotSupportedException{
				return (Computer)super.clone();
			}
			
/**			
 * Creatational 
 * 		-- singleton
 * 					-- Eagar loading -- using Static field initialization/static block initialization
 * 					-- Lazy Loading
 * 					-- Thread Safe -- Static method sync
 * 					-- Double Checking -- block level sync
 * 					-- Bill Pugh -- static inner class + Eager loading
 * 					-- Enum -- Reflection cannot break
 * 					-- Serialization/Deserilization  -- Object readResolve()
 * 		--Factory
 * 					-- Mobile
 * 								-- iPhone
 * 								--Samsung
 * 								--Mi
 * 					MobileFactory
 * 							public static Mobile getInstance(type,param....)
 * 									if(typ==x)
 * 											return x(....)
 * 					TestClass
 * 
 *  	--Abstract Factory
 * 						--Mobile
 * 									--iPhone
 * 									-- Samsung
 * 									--Mi
 * 						--AbstractMobileFactories --   Mobile getMobile();
 * 									--iPhoneFactory
 * 									--SamsungFactory
 * 									--MiFactory
 * 						MobileFactory
 * 									public static Mobile getMobileInstance(AbstractMobileFactories amb){
 * 										return amb.getMobile();
 * 								}
 * 					TestClass
 * 
 * Builder 
 * 				-- Computer
 * 						x,y ; //mandatory
 * 						p,q,r,m,n ; -- optional fields
 * 						Computer(InnerComputer inc){
 * 							this.x=inc.x;
 * 							this.x=inc.y;
 * 							this.x=inc.p;-----q--r--m--n;
 * 						}		
 * 
 * 					static class InnerComputer{
 * 						x,y ; //mandatory
 * 						p,q,r,m,n ; -- optional fields
 * 
 * 							InnerComputer(x,y){ --constructor with mandatory fields
 * 					}			
 * 					
 *				write below methods for all optional fields --p,q,r,m,n
 *					public InnerComputer setP(pval){
 *								this.p=pval;
 *								return this;
 *					}
 *				
 *				public Computer build(){
 *					return new Computer(this);
 *				}
 *		
 *			TestClass
 *
 *
 *Prototype -- shallow deepcloning-- 
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
 * 
 * 							}
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
		
