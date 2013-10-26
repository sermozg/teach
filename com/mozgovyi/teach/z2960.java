package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class z2960 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = null; 
		PrintWriter out = null; 
		try { 
			in = new BufferedReader(new FileReader("input.txt")); 
		 	out = new PrintWriter(new FileWriter("output.txt")); 
		 	long a = Integer.parseInt(in.readLine());
		 	long b = Integer.parseInt(in.readLine());
		 	if ((a==1 && b==1) || (a!=1 && b!=1)){
			 	out.print("YES");	 		
		 	} else {
		 		out.print("NO");
		 	}
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
