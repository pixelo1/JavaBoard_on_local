package com.webjjang.board.controller;

import com.webjjang.board.service.BoardListService;
import com.webjjang.util.io.BoardPrint;
import com.webjjang.util.io.In;
import com.webjjang.util.io.Out;

public class BoardController {

	//시작부분 -프로젝트에서 한개만 만든다.
	public void execute() {
		// TODO Auto-generated method stub

		//무한 반복의 시작
		while(true) {
				try {
				Out.title("게시판 메뉴");
				Out.menu("1. 리스트  2. 글보기 3. 글쓰기", "4. 글수정  5. 글삭제  0. 이전메뉴");
				String menu = In.getString("메뉴 입력");
				
				switch(menu) {
				case "1":
					System.out.println("게시판 리스트");
					BoardPrint.list(new BoardListService().service());
					break;
				case "2":
					System.out.println("게시판 글보기");
					break;
				case "3":
					System.out.println("게시판 글쓰기");
					break;
				case "4":
					System.out.println("게시판 글수정");
					break;
				case "5":
					System.out.println("게시판 글삭제");
					break;
					
				case "0":
					return;
					
				default :
					System.out.println("잘못된 메뉴를 선택하셨습니다.");
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				Out.menu(e.getMessage());
			}
		}
		//무한 반복의 끝
	}

}
