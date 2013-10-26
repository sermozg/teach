package com.mozgovyi.teach;

import java.io.*;

class z2936 {

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
		 	double a = Double.parseDouble(in.readLine());
		 	double b = Double.parseDouble(in.readLine());
		 	double c = Math.sqrt(a*a+b*b);
			out.println(c);
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}

}
