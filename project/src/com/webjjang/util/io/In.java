package com.webjjang.util.io;

import java.util.Scanner;

public class In {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getString() {
		return scanner.nextLine();
	}
	
	public static String getString(String msg) {
		System.out.print(msg + " ==> ");
		return getString();
	}

}
