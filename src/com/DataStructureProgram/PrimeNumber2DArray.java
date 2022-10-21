package com.DataStructureProgram;


public class PrimeNumber2DArray {
	static int arr[][]=new int[10][30]; 
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
			System.out.println("arr["+j+"]["+k+"]  "+arr[j][k]);
			k++;
		}
		if(i%100==0) {
			k=0;
			j++;
		}
		
	}
	}
	public static void main (String[]args)   {
		primenu(1000);
	}
}
