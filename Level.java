package com.interview.prep.enums;

 public enum Level {
	 
	 HIGH(100),
	 LOW(200),
	 MIDDLE(20022),
	 ; // semicolon needed when fields / methods follow
	 
	 private final int levelCode;

	    Level(int levelCode1) {
	        this.levelCode = levelCode1;
	    }
	    
	  /*
	   * A Java Enum is a special Java type used to define collections of constants. More precisely, 
	   * a Java enum type is a special kind of Java class. 
	   * An enum can contain constants, methods etc. Java enums were added in Java 5.
	   * 
	   * Notice how the Java enum in the example above has a constructor which takes an int. 
	   * The enum constructor sets the int field. When the constant enum values are defined, an int value is passed to the enum constructor.
       * The enum constructor must be either private or package scope (default). 
       * You cannot use public or protected constructors for a Java enum.
       * 
	   */
	    void getEnumMethod(){
	    	
	    	for(Level level : Level.values()){
	    		System.out.println("Coming from Enum class  "+level);
	    	}
	    }
 }
 
      