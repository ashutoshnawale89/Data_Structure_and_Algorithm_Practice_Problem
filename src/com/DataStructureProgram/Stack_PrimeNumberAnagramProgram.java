package com.DataStructureProgram;

import java.util.ArrayList;

public class Stack_PrimeNumberAnagramProgram {

	static int arr[][]=new int[10][30];                          //   that 2D array are save The value For Prime Number In 100--100 unit
	static ArrayList<Integer> list = new ArrayList<Integer>();  //  this array to save the Anagram Number
	static ArrayList<Integer> arr1 = new ArrayList<Integer>(); //   This array to save the Prime Number Program and 
	                                                          //   store only the numbers in that range that are Anagrams. 
	static int digit2=0;
	static int digit=0;
	
	
	public static void primenu(int upperlimit) {
		int i=0;
		int num=0;
		int j=0,k=0;
		for (i=1; i<= upperlimit; i++) {
			int count=0;
			for (num=i;num>=1; num--) {
				if (i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {
				arr[j][k]=i;
				//		System.out.println("arr["+j+"]["+k+"]  "+arr[j][k]);
				k++;
			}
			if(i%100==0) {
				k=0;
				j++;
			}

		}
		anagramNumber();
	}
	public static void anagramNumber() {
		digit2 =0;
		digit=0;
		for(int i=0; i < 10;i++) {
			for (int j=0; j <30; j++)  {
				if(arr[i][j]!=0) {
					int number=arr[i][j];
					digit=0;
					while (number>0)   
					{  
						digit=number%10+digit;   
						//dividing the number by 10  
						number=number/10;  
					}
					for(int k=i; k >= 0;k--) {
						for(int m=j; m >= 0;m--) {
							digit2=0;
							int number2= arr[k][m];
							while (number2>0)   
							{  
								digit2=number2%10+digit2;   
								//dividing the number by 10  
								number2=number2/10;  
							}
							if (digit==digit2) {
								list.add(arr[k][m]);
							//	System.out.println(arr[k][m]);								
							}
						}
					}
				}
			}
		}
		anagram();
	}

	public static void anagram() {
		int count;
		for(int i=0; i< list.size();i++) {
			int num=list.get(i);
			count=0;
			for (int j=0; j< list.size(); j++) {
				if (num==list.get(j)) {
					count++;
				}
			}
				if(count==1) {
					arr1.add(list.get(i));
				}
		}
		// Printing the Prime & Anagram Number
//		for (int i = 0; i < arr1.size(); i++) {
//			if (arr1.get(i)!=0)
//		     System.out.println(arr1.get(i);
//		}
			}
	
	public Node head;
	// FOR NODE CLASS
   class Node  {
		int data;
		Node next;
		// Constructor 
		Node (int data){
			this.data=data;
			this.next=null;
		}
	}
   
   public boolean isEmpty() {
		return head == null;
	}  
   
   // Push Method
		public void push(int data) {
			Node newNode=new Node(data);
			if (head == null) {
				head=newNode; 
			}
			else {
				newNode.next = head;
				head = newNode;
			}
		}
			// REMOVE - POSITION
			public int Pop() {
				if (head == null) { 
					return -1;
				}
				else {
					int top = head.data;
					head=head.next;
					return top;
				}
			}
			// PEEK - POSITION
			public int peek() {
				if (head == null) { 
					return -1;
				}
				else {
					return head.data;
				}
			}
		
	public static void main (String[]args)   {
		System.out.println("Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using");

		Stack_PrimeNumberAnagramProgram obj=new Stack_PrimeNumberAnagramProgram();
		primenu(1000);	
		// Push Value in Stack  
		for (int i = 0; i < arr1.size(); i++) {
			if (arr1.get(i)!=0);{
			obj.push(arr1.get(i));
			}
		}
		//   peak & Pop(remove) code
		while(!obj.isEmpty()) {
			if(obj.peek()!=0) {
			System.out.println(obj.peek());
			}
			obj.Pop();
		}
		
	}
}
