package com.DataStructureProgram;

import java.util.*;

public class UnorderedListProgram {
	static Scanner sc= new Scanner(System.in);
	static LinkedList<Object> list=new LinkedList<Object>();	
	
	
	public static <E> void textSaveProgm(String values) {
		// The Value Will Save For Like Text
		String str1= new String("Hello java I am Writing The Program");
		// The String Will be splitted add to the LinkedList
		String strArr[]=str1.split(" ");
		for (int i=0; i < strArr.length; i++)  {
			list.add(strArr[i]);
		}
		display();  // for the display 
		program(values);
	}
	
             //  search the value are available or not
	public static <E> void program(String values) {
		for (int j=0; j < list.size(); j++) {
			// if the value available then its remove
			if (values.equals(list.get(j))) {
				list.remove(values);
				System.out.println("-------------The Value Are Found And They Are Remove------------");
				j=list.size()+1;
				display();
				
			}
			// if the value are not available then its added in linkedList
			if(list.size()-1==j) {
				list.add(values);
				j=list.size()+2;
				System.out.println("  ");
				System.out.println("--------------The Values Are added Succesfully-------------");
				display();
			}
		}
	}
	// Display the linkedlist 
		public static void display() {
			for(int i=0; i < list.size(); i++) {
				System.out.print(list.get(i)+"  ");  
				}
		}
		
	public static void main(String[] args) {
		textSaveProgm("Hello");
		

	}

}
