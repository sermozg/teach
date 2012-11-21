/**
 * 
 */
package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author sermozg
 *
 */
public class z253 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = null; 
		PrintWriter out = null; 
		try { 
			in = new BufferedReader(new FileReader("input.txt")); 
		 	out = new PrintWriter(new FileWriter("output.txt")); 
		 	double x = Double.parseDouble(in.readLine());
		 	if (x%400==0){ 
		 		out.println("YES");
		 	}
		 	else if (x%4==0 && x%100!=0){
		 		out.println("YES");
		 	}
		 	else {
		 		out.println("NO");
		 	}
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
