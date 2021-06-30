package com.aliciabrandt.week5;

import java.util.Scanner;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String Log) {
		Scanner scan = new Scanner(System.in);
		String phrase3 = scan.nextLine();
		System.out.println(phrase3.replace("", " ").trim());
		
	}

	@Override
	public void Error(String Error) {
		Scanner scan = new Scanner(System.in);
		String phrase4 = scan.nextLine();
		System.out.println("ERROR: " + phrase4.replace("", " ").trim());
		
	}

}
