package com.myweb.persistence.member;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.myweb.domain.MemberVO;

@Repository
public class MemberDAO implements MemberDAORule {
	private static Logger logger = LoggerFactory.getLogger(MemberDAO.class);
	private final String NAMESPACE = "MemberMapper.";
	
	@Inject
	private SqlSession SQL;

	@Override
	public int insert(MemberVO mvo) {
		return SQL.insert(NAMESPACE + "join", mvo);
	}

	@Override
	public int selectEmail(String email) {
		return SQL.selectOne(NAMESPACE + "checkEmail", email);
	}

	@Override
	public List<MemberVO> selectMemberList() {
		return SQL.selectList(NAMESPACE + "list");
	}

	@Override
	public MemberVO selectOne(MemberVO mvo) {
		return SQL.selectOne(NAMESPACE + "login", mvo);
	}

	@Override
	public MemberVO selectOne(int mnum) {
		return SQL.selectOne(NAMESPACE + "detail", mnum);
	}

	@Override
	public int update(MemberVO mvo) {
		return SQL.selectOne(NAMESPACE + "modify", mvo);
	}

	@Override
	public int delete(int mnum) {
		return SQL.selectOne(NAMESPACE + "delete", mnum);
	}

}
