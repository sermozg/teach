package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class z1433 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int n = 0,m = 0;
		Scanner scanner = null; 
		PrintWriter writer = null; 
		try { 
		 scanner = new Scanner(new BufferedReader(new FileReader("input.txt"))); 
		 writer = new PrintWriter("output.txt"); 
		 if (scanner.hasNextInt()) {n = scanner.nextInt();}
		 if (scanner.hasNextInt()) {m = scanner.nextInt();}
		 int x = m%n;
		 if (x==0) {
			 writer.println(m/n);
		 } else {
			 writer.println(m/n+1); 
		 }
		} finally { 
			 if (scanner != null) { scanner.close(); } 
			 if (writer != null) { writer.close(); } 
		} 
	}
}
