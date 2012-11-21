package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class z3074 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = null; 
		PrintWriter out = null; 
		try { 
			in = new BufferedReader(new FileReader("input.txt")); 
		 	out = new PrintWriter(new FileWriter("output.txt")); 
		 	long x = Integer.parseInt(in.readLine());
		 	double f1=0.0;
		 	double f2=1.0;
		 	double f=0.0;
		 	if (x==0){
		 		
		 	}
		 	else if (x==1){
		 		f=1.0;
		 	}
		 	else{
			 	for (int i=2; i<=x; i++) {
			 		f=f1+f2;
			 		f1=f2;
			 		f2=f;
			 	}
		 	}
		 	NumberFormat form = new DecimalFormat("0");
		 	out.println(form.format(f));
		} finally { 
			 if (in != null) { in.close(); } 
			 if (out != null) { out.close(); } 
		} 
	}
}
