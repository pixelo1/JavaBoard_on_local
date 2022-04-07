package com.webjjang.board.service;

import java.util.List;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.vo.BoardVO;

public class BoardListService {
	
	public List<BoardVO> service() throws Exception{
		System.out.println("BoardListService.service()");
		List<BoardVO> list = null;
		
		list = new BoardDAO().list();
		return list;
	}

}
