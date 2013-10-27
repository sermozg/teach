package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class z2947 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner in = null; 
		PrintWriter out = null; 
		try { 
			in = new Scanner(new BufferedReader(new FileReader("input.txt"))); 
		 	out = new PrintWriter(new FileWriter("output.txt")); 
		 	int n = in.nextInt();
		 	n = n % 1440;
		 	int h = n/60;
		 	int m = n%60;
		 	out.print(h);
		 	out.print(" ");
		 	out.print(m);
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
