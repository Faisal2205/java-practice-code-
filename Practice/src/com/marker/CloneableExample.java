package com.marker;

public class CloneableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Employee e1 = new Employee(101,"Ravi");
			Employee e2 = (Employee) e1.clone();
			
			System.out.println("Original: "+e1.emp_id + " " + e1.name);
			System.out.println("Clone: "+e2.emp_id + " " + e2.name);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
