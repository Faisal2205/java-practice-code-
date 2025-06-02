package com.oops.concept;

class Car {
        String brand;
        String model;
        
//        public Car(String brand, String model)
//        {
//        	this.brand = brand;
//        	this.model = model;
//        }
//        
         Car(String brand, String model) {
			// TODO Auto-generated constructor stub
        	this.brand = brand;
        	this.model = model;
		}

		void showCarDetails()
        {
        	System.out.println("Car Brand: "+ brand +" Car model: " + model);
        }
}
