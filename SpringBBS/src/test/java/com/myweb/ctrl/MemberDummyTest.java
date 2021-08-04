package com.myweb.ctrl;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myweb.domain.MemberVO;
import com.myweb.persistence.member.MemberDAORule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberDummyTest {
	private static Logger logger = LoggerFactory.getLogger(MemberDummyTest.class);

	@Inject
	private MemberDAORule mdao;

	@Test
	public void selectMemberTest() throws Exception {
		List<MemberVO> list = mdao.selectMemberList();
		for (MemberVO mvo : list) {
			logger.info(mvo.getEmail() + "," + mvo.getNickname() + "," + mvo.getPwd());
		}
	}

//	@Test
//	public void insertTest() throws Exception {
//		MemberVO mvo = new MemberVO();
//		mvo.setEmail("admin@admin.com");
//		mvo.setPwd("1111");
//		mvo.setNickname("ADMIN");
//		mvo.setBirthday("2000-12-09");
//		mdao.insert(mvo);
//	}
}
