package com.AlgorithmProgram;

public class PrimeNumber {
	static int m=1;
	public static void primenum(int upperlimit) {
	int i=0;
	int num=0;
	for (i=1; i<= upperlimit; i++) {
		int count=0;
		for (num=i;num>=1; num--) {
			if (i%num==0) {
			    count=count+1;
			//	System.out.println(i++);
			}
		}
		if(count==2) {
			System.out.println(i++);		
		}
	}
	}
	public static void main (String[]args)   {
		PrimeNumber obj=new PrimeNumber();
	     obj.primenum(1000);
	   
	 }
}






