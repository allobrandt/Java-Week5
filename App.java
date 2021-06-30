package com.aliciabrandt.week5;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		asterisk.Log(null);
		asterisk.Error(null);

		Logger spaced = new SpacedLogger();
		spaced.Log(null);
		spaced.Error(null);
	}

}