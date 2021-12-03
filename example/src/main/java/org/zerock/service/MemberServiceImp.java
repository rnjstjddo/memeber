package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.MemberDTO;
import org.zerock.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MemberServiceImp implements MemberService{

	
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
	@Override
	public void register(MemberDTO member) {
		System.out.println("ServiceMemberImp 클래스의 register() 메소드");
		
		mapper.insert(member);
		
		log.info(member);
		
	}

	
	
	
}
