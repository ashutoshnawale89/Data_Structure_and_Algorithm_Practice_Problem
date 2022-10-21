package com.AlgorithmProgram;

import java.util.Arrays;

public class InsertionSort {
	// insertion
	    public static void Insert(char arr[]) {
		 for(int i=1; i<arr.length; i++) {
	           char current = arr[i];
	           int j = i - 1;
	               while(j >= 0 && arr[j] > current) {
	                   //Keep swapping
	                   arr[j+1] = arr[j];
	                   j--;
	               }
	           arr[j+1] = current;
	       }
		 for(int i=0; i<arr.length; i++) {
	           System.out.print(arr[i]+" ");
		 }
	    }
		   public static void main(String args[]) {
		       char arr[] = {'S','a','G','T','Q'};
		       InsertionSort obj =new InsertionSort();
		       obj.Insert(arr);
		      
		   }
		}

