		package com.demo;
		
		public class TestAbstractFactoryDesignPattern {
		 public static void main(String[] args) {
			AbstractFactories aFactory = new MiFactory();
			Mobile myMobile =  MobileFactory.getMobileInstance(aFactory);
			System.out.println(myMobile); //
		}
		}

		abstract class Mobile{
				abstract public boolean isBluetoothAvailable();
				abstract public double getPrice();
				abstract public long getImeiNumber();
				
				public String toString(){
					return "\nBluetooth --" +isBluetoothAvailable() +"\nPrice --" +getPrice()
									+"\nIMEI --" +getImeiNumber();
				}
				
				
		}
		
		class iPhone extends Mobile{

			@Override
			public boolean isBluetoothAvailable() {
				return false;
			}

			@Override
			public double getPrice() {
				return 80000;
			}

			@Override
			public long getImeiNumber() {
				return 11111111;
			}
		}
		
		class Samsung extends Mobile{

			@Override
			public boolean isBluetoothAvailable() {
				return true;
			}

			@Override
			public double getPrice() {
				return 31000;
			}

			@Override
			public long getImeiNumber() {
				return 2222222;
			}
			
		}
		
		class Mi extends Mobile{

			@Override
			public boolean isBluetoothAvailable() {
				return true;
			}

			@Override
			public double getPrice() {
				return 15000;
			}

			@Override
			public long getImeiNumber() {
				return 3333333;
			}
			
		}
		
		interface AbstractFactories{
			 Mobile getMobile(); //public abstract
		}
		
		class iPhoneFactory implements AbstractFactories{
			@Override
			public Mobile getMobile() {
				return new iPhone();
			}
		}
		class SamsungFactory implements AbstractFactories{
			@Override
			public Mobile getMobile() {
				return new Samsung();
			}
		}

		class MiFactory implements AbstractFactories{
			@Override
			public Mobile getMobile() {
				return new Mi();
			}
		}
		

		class MobileFactory {
			 public static Mobile getMobileInstance(AbstractFactories aFactory){
				 return aFactory.getMobile();
			 }
		}
		
		
		
		
		
		
		
/**
	 * Mobile  (Interface/aClass)
	 * 		-- iPhone
	 * 		--Samsung
	 *     -- Mi
	 *     
	 * AbstractFactories (Interface/aClass)
	 * 			--Mobile getMobile();
	 *     iPhoneFactory
	 *     					Mobile getMobile -- return new iPhone(----)
	 *     SamsungFactory
	 *     				Mobile getMobile -- return new Samsung(---)
	 *     MiFactory
	 *     				Mobile getMobile -- return new Mi(---);
	 *     
	 *     MobileFactory
	 *     			public static Mobile getMobileInstance(AbstractFactories aFactory){
	 *     				return 	aFactory.getMobile();
	 *     
	 *     
	 *     
	 *     	
	 *     		
	 *     
	 *     }
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
		
		
		