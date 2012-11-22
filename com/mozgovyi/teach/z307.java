package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class z307 {

	static double power (double a, int n){
		double p = 1.0;
		for (int i = 1; i<=n; i++){
			p *= a;
		}
		return p;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = null; 
		PrintWriter out = null; 
		try { 
			in = new BufferedReader(new FileReader("input.txt")); 
		 	out = new PrintWriter(new FileWriter("output.txt"));
		 	String s = in.readLine();
		 	String[] ar = s.split(" ");
		 	double a = Double.valueOf(ar[0]);
		 	int n = Integer.valueOf(ar[1]);
		 	out.print(power(a,n));
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
