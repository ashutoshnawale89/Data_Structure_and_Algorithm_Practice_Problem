package com.AlgorithmProgram;
  

import java.util.*; 

public class AnagramPalindr {
	static int[] user=new int[168];
	static int m=0;
	public void PrimeAnagramPalindarnumber(int upperlimit) {
		//  prime Number object in method
		int i=0;
		int num=0;
		for (i=1; i<= upperlimit; i++) {
			int count=0;
			for (num=i;num>=1; num--) {
				if (i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {        // print Prime Number in ""i"" objecjt
				user[m]=i;
				m++;
				                    // Palindrome object in method
				int r,sum=0,temp,obj;
				obj=i;
				temp=i; 

				for (int j=0;obj>j;){    
					r= obj%10;              //getting remainder  
					sum=(sum*10)+r;    
					obj= obj/10;    
				}    
				if(temp==sum)   { 
					System.out.println("Palindrome & Anagram number is  "+temp); 
			}
			}
		}
	}	
	public static void main(String [] args) {
		AnagramPalindr obje=new AnagramPalindr();
		obje.PrimeAnagramPalindarnumber(1000);
		
		

	}
}
