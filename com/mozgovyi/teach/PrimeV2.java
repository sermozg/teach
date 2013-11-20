package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int n = 0;
		Scanner scanner = null; 
		PrintWriter writer = null; 
		try { 
			 scanner = new Scanner(new BufferedReader(new FileReader("input.txt"))); 
			 writer = new PrintWriter("output.txt"); 
			 if (scanner.hasNextInt()) {n = scanner.nextInt();}
			 List<Integer> list = new ArrayList<Integer>();
			 System.out.println(System.currentTimeMillis());
			 System.out.println("Wait...");
			 for (int i = 2; i <= n; i++) {
				boolean b = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0){
						b = false;
						break;
					}
				}
				if (b) list.add(i);
			}
			for (Integer i : list) {
				writer.println(i.intValue());
			}
		} finally { 
			 if (scanner != null) { scanner.close(); } 
			 if (writer != null) { writer.close(); } 
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("The End...");
	}

}
