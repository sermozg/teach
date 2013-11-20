package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeEratosfen {

	/**
	 * @param args
	 * Решето Эратосфена
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int n = 0;
		Scanner scanner = null; 
		PrintWriter writer = null; 
		try { 
			 scanner = new Scanner(new BufferedReader(new FileReader("input.txt"))); 
			 writer = new PrintWriter("output.txt"); 
			 if (scanner.hasNextInt()) {n = scanner.nextInt();}
			 List<Integer> list = new ArrayList<Integer>();
			 int[] a = new int[n+1];
			 for (int i = 1; i <=n; i++)
				 a[i] = i;
			 a[1] = 0;
			 
			 System.out.println(System.currentTimeMillis());
			 System.out.println("Wait...");
			 int i = 2;
			 while (i <= n) {
				if (a[i] != 0) list.add(a[i]);
				for (int j = i; j<=n; j = j + i) {
					a[j] = 0;
				}
				i++;
			 }

			 for (Integer i1 : list) {
				 writer.println(i1.intValue());
			 }
			 
		} finally { 
			 if (scanner != null) { scanner.close(); } 
			 if (writer != null) { writer.close(); } 
		}
		
		System.out.println(System.currentTimeMillis());
		System.out.println("n/ln(n)="+n/Math.log(n));
		System.out.println("The End...");
	}

}
