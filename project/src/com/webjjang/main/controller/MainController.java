package com.webjjang.main.controller;

import com.webjjang.board.controller.BoardController;
import com.webjjang.util.io.In;
import com.webjjang.util.io.Out;

public class MainController {

	//시작부분 -프로젝트에서 한개만 만든다.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// 드라이버 확인
		Class.forName("com.webjjang.util.db.DBInfo");
		
		//무한 반복의 시작
		while(true) {
			Out.title("메인 메뉴");
			Out.menu("1. 게시판  0. 종료");
			String menu = In.getString("메뉴 입력");
			
			switch(menu) {
			case "1":
				System.out.println("게시판 처리");
				//생성하고 호출한다.
				new BoardController().execute();
				break;
				
			case "0":
				System.out.println("프로그램 종료");
				System.exit(0);
			
			default :
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				
			}
		}
		//무한 반복의 끝
	}

}
