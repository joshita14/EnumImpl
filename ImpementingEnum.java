package com.interview.prep.enums;

public class ImpementingEnum {
	
	/*
	 * Enums are implicitly public static final.
	 */
	static Level level = Level.MIDDLE;
	
	public static void main(String[] args) {
		System.out.println(level);
		
		for(Level level : Level.values()){
			System.out.println(level);                           //prints all the elements of enum
		}
		
		level.getEnumMethod();
	}
}
