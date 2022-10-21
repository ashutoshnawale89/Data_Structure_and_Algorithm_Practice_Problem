package com.DataStructureProgram;

import java.util.ArrayList;

public class PrimeNumber_AnagramProgram {

	static int arr[][]=new int[10][30]; 
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static int arr1[]=new int[500]; 
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
		int num=0;
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
		int index=0;
		for(int i=0; i< list.size();i++) {
			int num=list.get(i);
			count=0;
			for (int j=0; j< list.size(); j++) {
				if (num==list.get(j)) {
					count++;
				}
			}
				if(count==1) {
					arr1[index]=list.get(i);
					index++;
				}
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]!=0)
		      System.out.println(arr1[i]);
		}
			}
	public static void main (String[]args)   {
		primenu(1000);	
	}
}
