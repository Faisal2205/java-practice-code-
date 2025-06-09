package com.singleton;

public class Jalebi {

	// Eager way to create Singleton object.
	
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi()
	{
		return jalebi;
	}
}
