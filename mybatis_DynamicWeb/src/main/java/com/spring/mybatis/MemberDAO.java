package com.spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {
	SqlSession mybatis;
	public MemberDAO() {
		this.mybatis = new SqlSessionFactoryBean().getSession();
	}
	
	public void insertMember(MemberVO vo) {
		mybatis.insert("memberDAO.insertMember",vo);
		mybatis.commit();
	}
	
	public void updateMember(MemberVO vo) {
		mybatis.update("memberDAO.updateMember",vo);
		mybatis.commit();
	}
	
	public void deletMember(MemberVO vo) {
		mybatis.insert("memberDAO.deleteMember",vo);
		mybatis.commit();
	}
	
	public MemberVO getMember(MemberVO vo) {
		return mybatis.selectOne("memberDAO.getMember",vo);
	}
	
	public List<MemberVO> getMemberList(MemberVO vo) {
		return mybatis.selectList("memberDAO.getMemberList",vo);
	}
}
