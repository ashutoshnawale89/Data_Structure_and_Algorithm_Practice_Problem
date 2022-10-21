package com.AlgorithmProgram;

import java.util.Arrays;    // import for change ascending order and lowercase form

public class Anagrams {
	// write method
		public static void isAnagram(String str1, String str2) {  
	        String s1 = str1;
	        String s2 = str2;
	       boolean status = true;   // boolean is conside bcz status is true or false in next condition
	        if (s1.length() != s2.length()) {    // find length
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();   // words change in lowecase 
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();    // words change in lowecase
	            Arrays.sort(ArrayS1);                               // word change in ascending orders
	            Arrays.sort(ArrayS2);                               // word change in ascending orders
	            status = Arrays.equals(ArrayS1, ArrayS2);             // true or false define in ascending order
	        System.out.println(Arrays.equals(ArrayS1, ArrayS2));
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	   
	    public static void main(String[] args) {  
	        isAnagram("Keep", "Peek");  
	        isAnagram("Mother In Law", "Hitler Woman");  
	    }  
	}  
