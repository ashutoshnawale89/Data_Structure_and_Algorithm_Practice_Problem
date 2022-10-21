package com.AlgorithmProgram;
import java.util.*;

public class GenericSort  {
	public static void Sorting(int[]arr ) {
		//bubble sort
		 for(int i=0; i<arr.length-1; i++) {
	           for(int j=0; j<arr.length-i-1; j++) {
	        	   if (arr[j-1]> arr[j])  {  //array[i - 1].compareTo(array[i]) 
	                   //swap
	                   int temp = arr[j];
	                   arr[j] = arr[j+1];
	                   arr[j+1] = temp;
	               }
	           }    
	       }
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.println("");
	}    
	public static void main(String[] args) {
		int add[];


		int arr[] = {7, 8, 1, 3, 2,12,14,18};
		int arr2[] = {7, 8, 1, 3, 2,12,14,100};
		GenericSort obj=new GenericSort();
		obj.Sorting(arr);
		obj.Sorting(arr2);
	}	 
}

