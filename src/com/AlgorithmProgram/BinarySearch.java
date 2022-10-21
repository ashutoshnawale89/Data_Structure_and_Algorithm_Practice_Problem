package com.AlgorithmProgram;

public class BinarySearch {
	public void binary(int arr[],int n)  {
		   int s=0;
		   int e=arr.length-1;
		   int  mid=(s+e)/2;
		   while (s <= e) {
			   mid=(s+e)/2;
			   if (n== arr[mid]) {
				   System.out.println("The value is Place in "+mid+"  position");
				   break;
			   }
			  else if (n < arr[mid]) {
				   e=mid-1;
			   }
			  else  {
				  s=mid+1;
			   }
			   
		   }  
	}
	public static void main(String[] args)   {  
	   BinarySearch obj=new BinarySearch();
	   int [] arr= {10,20,30,40,50,60,70,80,90,100};
	   obj.binary(arr, 50);
	}
}
