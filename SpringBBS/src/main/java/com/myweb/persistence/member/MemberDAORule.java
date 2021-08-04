package com.myweb.persistence.member;

import java.util.List;

import com.myweb.domain.MemberVO;

public interface MemberDAORule {
	public int insert(MemberVO mvo); // 회원가입
	public int selectEmail(String email); // 이메일 중복 체크
	public List<MemberVO> selectMemberList(); // 회원 목록
	public MemberVO selectOne(MemberVO mvo); // 로그인
	public MemberVO selectOne(int mnum); // 회원 상세 정보
	public int update(MemberVO mvo); // 회원 정보 수정
	public int delete(int mnum); // 회원 삭제
}
