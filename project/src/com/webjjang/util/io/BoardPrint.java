package com.webjjang.util.io;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

public class BoardPrint {
	
	public static void list(List<BoardVO> list) {
		Out.title("게시판 리스트");
		
		Out.line(60);
		System.out.println(" 글번호  | 제목  | 작성자  | 작성일  | 조회수");
		Out.line(60);
		if(list == null || list.size() == 0)
			System.out.println("데이터가 존재하지 않습니다.");
		
		for(BoardVO vo : list) {
			System.out.println(
					vo.getNo() + " : " +
					vo.getTitle() + " : " +
					vo.getWriter() + " : " +
					vo.getWriteDate() + " : " +
					vo.getHit()
			);
		}
		
	}

}
