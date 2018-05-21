package com;

/*
 *  String Handling:
 *  ----------------
 *  
 *  	java.lang.String
 *  	java.lang.StringBuffer
 *  	java.lang.StringBuilder ( JDK 1.5 )
 *  
 *  
 *  ---------------------------
 *  
 *  def: String
 *  ------------
 *  
 *    --> group of chars
 *    
 *    C, C++  --> char[]
 *    
 *    Java    --> char[], String class
 *    
 *    --------------------
 *    
 *    Notes :
 *    -------
 *    
 *    --> In Java, String objects can be created in 2 ways
 *    
 *    			--> Without 'new' operator
 *    
 *    				 String objects stored in SCP(String constant pool)
 *    				 SCP will maintain unique String objs even if you create second time.	
 *    
 *    			--> With 'new' operator	
 *    
 *                  will store in normal Heap with memory allocation.
 *  	
 *    --> All  String Objs are immutable/non-volatile
 *        Objects by default.
 *        
 *        		--> For security
 *        
 *        
 *   --------------------------------------------------
 *   Ex.
 *        
 *        1. Get SSN String value from User, validate it
 *            
 *             format : ||-||||-||| -->  123-4324-564
 *             
 *        2. Email Validation.
 *        
 *        3. Name Sorting.
 *        
 *        4. Get Password From User, check First & last chars
 *           are 'c' and rest must be digits.
 *           
 *        5. Get One File path from user, extract file Name alone
 *           from that.   
 *        
 *        
 *        --------------------------------------------
 *        
 *        
 *        Limitation of String class:
 *        ---------------------------
 *        
 *        --> Immutable .
 *        
 *        
 *           soln:
 *           -----
 *           
 *               --> StringBuffer  ( Mutable ) : synchronized
 *               
 *               --> StringBuilder ( Mutable )  : Non-Synchronized : JDK 1.5
 *               
 *               
 *    ------------------------------------------------------------
 *    
 *        1. Get String Obj, Print reverse it.
 *        
 *        2. Get String with multiple words, 
 *           print reverse output.  ( Split it , Push and Pop ( use Stack ))
 *        
 *        
 */

public class StringHandling_Demo {

	public static void main(String[] args) {

		// Way 1
		String a = "abc";
		String b = "abc";

		System.out.println(a == b); // True
		System.out.println(a.equals(b)); // True

		// way 2
		String c = new String("abc");
		String d = new String("abc");

		System.out.println(c == d); // False
		System.out.println(c.equals(d)); // TRUE

		// ---------------------------

		String myName = "Naga";
		// String newName = myName.concat(" N");
		myName.concat("N"); // Waste oprn
		myName = myName.concat(" N");

		System.out.println(myName);
		// System.out.println(newName);

		// -------------------------------------------

		String p = "A"; // 1 obj
		p.concat("B"); // 2 objs
		p = p.concat("C"); // 2 objs

		// How many str objs created, how many un-used

		System.out.println(p);

		// -------------------------------------------
		System.out.println("-------------------------------");
		// String Handling Methods:

		String s = "abcdefgha";

		// To Get String Length
		int len = s.length();
		System.out.println(len);

		// To Get One char by Index
		char ch = s.charAt(7);
		System.out.println(ch);

		// To Find char seq index on String
		// int idx = s.indexOf("a");
		int idx = s.lastIndexOf('a');
		System.out.println(idx);

		// To check char seq existence
		boolean bo = s.contains("naga");
		System.out.println(bo);

		// To Check String starts/ends with
		boolean isStartWith = s.startsWith("ab");
		boolean isEndsWith = s.endsWith("ab");
		System.out.println(isStartWith);

		// Comparing str with other

		String a1 = "abc";
		String a2 = "aBc";

		// To compare references : '=='
		System.out.println(a1 == a2);

		// To compare their content : boolean
		// boolean bo1 = a1.equals(a2);
		boolean bo1 = a1.equalsIgnoreCase(a2);
		System.out.println(bo1);

		// Compare : for sorting
		// int v = a1.compareTo(a2);
		int v = a1.compareToIgnoreCase(a2);
		System.out.println(v);

		// TO Remove Front and Back white spaces
		String yourName = " naga  ";
		System.out.println(yourName);
		System.out.println(yourName.trim());

		// To Split string by delims ( String separators )

		String breakFast = "Idly,Egg Roll,Vada";
		String[] breakFasts = breakFast.split("[,]");

		for (String food : breakFasts) {
			System.out.println(food);
		}

		// ------------------------------------

		// Case conversion

		String name = "abc";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		// -------------------------------------

		// String to Binary array

		String s1 = "char data";
		byte[] binary = s1.getBytes();

		// -------------------------------------

		// String to char array;

		String s2 = "string";

		char[] ca = s2.toCharArray();

		// char array to String
		String s3 = ca.toString();

		// ---------------------------------------

		String emptyStr = "";
		System.out.println(emptyStr.isEmpty());

		// -----------------------------------------

		// To Get Sub-String

		String s4 = "abcdefgh";
		String subStr = s4.substring(3, 5);
		System.out.println(subStr);

		// ---------------------------------------------

		// To match the String with Regular Exp format

		String mobile = "9945674228";
		boolean match = mobile.matches("\\d{10}");
		System.out.println(match);

		// -------------------------------------------

		// To Format the String

		double sal = 5500;
		String fs = String.format("Your Salary is: %f", sal);
		System.out.println(fs);

		// -------------------------------------------

		// Primitive To String conversion:
		int pri = 123;
		String strVal = String.valueOf(pri);

		System.out.println(strVal);

		// ----------------------------------------------

		// Replace str char

		String name1 = "naga";
		name1 = name1.replace('n', 'N');
		System.out.println(name1);

		// --------------------------------------------

		// Concat

		String p1 = "abc";
		String q1 = "abc";

		System.out.println(p1.concat(q1));
		System.out.println(p1 + q1);

		// -------------------------------------

		Character.isDigit('1');

	}

}
