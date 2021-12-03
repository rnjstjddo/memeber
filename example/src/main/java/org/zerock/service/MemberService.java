package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.domain.MemberDTO;



@Service
public interface MemberService {
	
	public void register(MemberDTO member);
	

}
