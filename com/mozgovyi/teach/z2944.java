package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class z2944 {

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
		 	int d1 = n/100;
		 	int d2 = (n/10)%10;
		 	int d3 = n%10;
		 	out.println(d1+d2+d3);
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}
	
}
