package com.spring.mybatis;

import java.util.List;

public class MainClient {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();

		List<MemberVO> lists = dao.getMemberList(vo);

		for (MemberVO v : lists) {
			System.out.println(v.toString());
		}


	}
}
