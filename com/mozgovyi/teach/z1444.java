package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class z1444 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int n = 0, m = 0, w = 0;
		Scanner scanner = null; 
		try { 
			scanner = new Scanner(new BufferedReader(new FileReader("input.txt"))); 
			if (scanner.hasNextInt()) {n = scanner.nextInt();}
			if (scanner.hasNextInt()) {m = scanner.nextInt();}
			if (scanner.hasNextInt()) {w = scanner.nextInt();}
			int[][] myArr = new int[n][m];
			for (int k=1; k<=w; k++) {
				int i = scanner.nextInt();
				int j = scanner.nextInt();
				myArr[i-1][j-1] = -1;
			}
			makeArray(myArr, n, m);
			printArr(myArr, n, m);
			
		} finally { 
			 if (scanner != null) { scanner.close(); } 
		} 
	}
	
	private static void printArr(int[][] myArr, int n, int m) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (myArr[i][j] == -1) {
						writer.print("*");
					} else {
						writer.print(myArr[i][j]);
					}
					writer.print(" ");					
				}
				writer.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) { writer.close(); } 			
		}
		
	}

	public static void makeArray(int[][] arr, int n, int m){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] != -1) {
					int count  = 0;
					if (i-1>=0) {
						if (arr[i-1][j]==-1) count++;
						if (j-1>=0)
							if (arr[i-1][j-1]==-1) count++;
						if (j+1<m)
							if (arr[i-1][j+1]==-1) count++;
					}
					if (i+1<n) {
						if (arr[i+1][j]==-1) count++;
						if (j-1>=0)
							if (arr[i+1][j-1]==-1) count++;
						if (j+1<m)
							if (arr[i+1][j+1]==-1) count++;
					}
					if (j-1>=0)
						if (arr[i][j-1]==-1) count++;
					if (j+1<m)
						if (arr[i][j+1]==-1) count++;
					arr[i][j] = count;
				}				
			}
		}
	}
}
