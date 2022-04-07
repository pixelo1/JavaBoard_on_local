package com.webjjang.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.board.vo.BoardVO;
import com.webjjang.util.db.DBInfo;

public class BoardDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<BoardVO> list() throws Exception{
		System.out.println("BoardDAO.list()");
		List<BoardVO> list = null;
		//데이터베이스 정보
		
		try {
			//1. 드라이버 확인 2. 연결
			con = DBInfo.getConnection();
			//3. sql
			String sql = "select no, title, writer, writeDate, hit from board order by no desc";
			//4. 실행객체 & 데이터 셋팅
			pstmt = con.prepareStatement(sql);
			//5. 실행
			rs = pstmt.executeQuery();
			//6. 데이터 표시 또는 담기
			if(rs != null) {
				while(rs.next()) {
					if(list == null) list = new ArrayList<BoardVO>();
					BoardVO vo = new BoardVO();
					vo.setNo(rs.getLong("no"));
					vo.setTitle(rs.getString("title"));
					vo.setWriter(rs.getString("writer"));
					vo.setWriteDate(rs.getString("writeDate"));
					vo.setHit(rs.getLong("hit"));

					list.add(vo);
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("게시판 리스트 불러오는 중 DB 오류");
		}finally {
			//7. 사용한 객체 닫기
			DBInfo.close(con, pstmt, rs);
			
		}
		
		return list;
	}
}
