package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class z315 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = null; 
		PrintWriter out = null; 
		try { 
			in = new BufferedReader(new FileReader("input.txt")); 
		 	out = new PrintWriter(new FileWriter("output.txt")); 
		 	long n = Long.valueOf(in.readLine());
		 	double s = 0.0;
		 	if (n>0) {
			 	for (int i = 1;i<=n;i++){
				 	s += java.lang.Math.pow(i, 2); 
			 	} 		
		 	}
		 	out.print(s);
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
