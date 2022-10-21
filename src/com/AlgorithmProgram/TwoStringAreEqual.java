package com.AlgorithmProgram;

import java.util.Arrays;

public class TwoStringAreEqual {
	public static void main(String[] args)     {
        String[] s1 = { "A", "B", "C" };
        String[] s2 = { "X", "Y", "Z" };
 
        if (Arrays.equals(s1, s2)) {
            System.out.println("Both arrays are equal");
        }
        else {
            System.out.println("Both arrays are not equal");
        }
    }
}
