package com.eight.co;

public class String_Methods {
	public static void main(String[] args) {
		String a ="Welcome to Java ";
		int b = a.length();
		System.out.println(b);
		String a1="Welcome to java";
	    boolean c = a.equals(a1);
	    System.out.println(c);
	    boolean d = a.equalsIgnoreCase(a1);
	    System.out.println(d);
<<<<<<< HEAD
	    String  jo = "Git push  b to a success";
	    System.out.println(jo);
	   
	    
	    
=======
	    String e = a.toUpperCase();
	    System.out.println(e);
	    String f = a.toLowerCase();
	    System.out.println(f);
	    boolean g = a.startsWith("Wel");
	    System.out.println(g);
	    boolean h = a.endsWith(" to Java");
	    System.out.println(h);
	    boolean i = a.contains("come to");
	    System.out.println(i);
	    boolean j = a.endsWith("Java");
	    System.out.println(j);
	    String add = "Continue Practical session";
	     String concat = a.concat(add);
	     System.out.println(concat);
>>>>>>> 8c2d864f43b5cdc1ba55e40359a21e14cd5fe2b4
	}

}
