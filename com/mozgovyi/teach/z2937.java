package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class z2937 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = null; 
		PrintWriter out = null; 
		try { 
			in = new BufferedReader(new FileReader("input.txt")); 
		 	out = new PrintWriter(new FileWriter("output.txt")); 
		 	int x = Integer.parseInt(in.readLine());
		 	int x1 = x+1;
		 	int x2 = x-1;
			out.println("The next number for the number "+x+" is "+(x1)+".");
			out.println("The previous number for the number "+x+" is "+(x2)+".");
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
