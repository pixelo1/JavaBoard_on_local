package com.webjjang.util.io;

public class Out {
	
	public static void line(int x) {
		//줄바꿈 없이 라인 만들기
		for(int i = 1; i <=x; i++) {
			System.out.print("-");
		}
		//줄바꿈 
		System.out.println();
	}
	
	public static void title(String title) {
		line(20);
		System.out.println("  " + title);
		line(20);
	}
	
	public static void menu(String ... menus ) {
		line(40);
		for(String menu : menus)
			System.out.println("  " + menu);
		line(40);
	}


}
