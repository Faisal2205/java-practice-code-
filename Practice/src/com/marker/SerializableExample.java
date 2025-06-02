package com.marker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Student s1 = new Student(1,"Alice");
		
		try {
			FileOutputStream fileOutput = new FileOutputStream("student.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOutput);
			out.writeObject(s1);
			out.close();
			fileOutput.close();
			
			System.out.println("Student Object has been serialized...");
			
			FileInputStream fileInput = new FileInputStream("student.ser");
			ObjectInputStream input = new ObjectInputStream(fileInput);
			Student s2 = (Student) input.readObject();
			input.close();
			fileInput.close();
			
			System.out.println("Deserialized Student: " + s2.id + ", " + s2.name);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
