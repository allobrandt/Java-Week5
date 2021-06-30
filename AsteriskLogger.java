package com.aliciabrandt.week5;

import java.util.Scanner;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
		Scanner scan = new Scanner(System.in);
		String phrase1 = scan.nextLine();
		System.out.println("***" + phrase1 + "***");
	}
	
	@Override
	public void Error(String Error) {
		Scanner scan2 = new Scanner(System.in);
		String phrase2 = scan2.nextLine();
		System.out.println("******************" + "\n***Error: " + phrase2 + "***" + "\n******************");

	}

}
