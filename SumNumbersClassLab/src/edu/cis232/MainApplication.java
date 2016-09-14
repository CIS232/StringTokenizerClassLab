package edu.cis232;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainApplication {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Supply a series of numbers separated by :");
		String input = keyboard.nextLine();
		
		StringTokenizer strTokenizer = new StringTokenizer(input, ": ");
		
		double sum = 0;
		while(strTokenizer.hasMoreTokens()){
			String token = strTokenizer.nextToken();
			token = token.trim();
			double value = Double.parseDouble(token);
			sum += value;
		}
		
		System.out.printf("The total is %,f%n", sum);
	}

}
