package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class z351 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = null; 
		PrintWriter out = null; 
		try { 
			in = new BufferedReader(new FileReader("input.txt")); 
		 	out = new PrintWriter(new FileWriter("output.txt")); 
		 	int n = Integer.parseInt(in.readLine());
		 	int f = 1;
		 	for (int i = 1;i<=n;i++){
			 	f *= i; 
		 	} 		
		 	out.print(f);
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
