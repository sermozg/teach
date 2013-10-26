package com.mozgovyi.teach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class z322 {

	public class Point {
		int x,y;
		
		public Point(int x, int y) {
			set(x,y);
		}
		
		void set(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		int getX() {
			return this.x;
		}
		
		int getY() {
			return this.y;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		z322 z = new z322();
		Scanner scanner = null; 
		PrintWriter writer = null; 
		try { 
			scanner = new Scanner(new BufferedReader(new FileReader("input.txt")));
			writer = new PrintWriter(new FileWriter("output.txt"));
			int n = 0;
			if (scanner.hasNextInt()) {
				n = scanner.nextInt();
			}
		 	if (n>0) {
			 	ArrayList<Point> aPoint = new ArrayList<Point>();
			 	for (int i=1; i<=n; i++) {
			 		if (scanner.hasNextInt()) {
			 			aPoint.add(z.new Point(scanner.nextInt(),scanner.nextInt()));
			 		}
			 	}
			 	Point look = null;
			 	int max = Integer.MIN_VALUE;
			 	for (Point p : aPoint) {
			 		int x = p.getX();
			 		int y = p.getY();
			 		int d = (int) Math.sqrt(x*x+y*y); 
			 		if (d > max) {
			 			max = d;
			 			look = p;
			 		}
			 	}
			 	writer.format("%d %d", look.getX(),look.getY());		 		
		 	}
		} finally { 
			 if (scanner != null) { scanner.close(); } 
			 if (writer != null) { writer.close(); } 
		} 
	}

}
