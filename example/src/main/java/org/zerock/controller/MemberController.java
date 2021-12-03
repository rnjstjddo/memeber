package org.zerock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.zerock.domain.MemberDTO;

import org.zerock.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j

public class MemberController {

	
	@Setter(onMethod_ = @Autowired)
	private MemberDTO member;
	
	@Setter(onMethod_ = @Autowired)
	private MemberService service;
	
	
	@GetMapping("/member")
	public void memberGet() {
		
		log.info("memberGet 메소드 실행");
	}

	
	
	@PostMapping("/member")
	public String memberPost() {
		service.register(member);
		log.info("memberPost 메소드 실행");
		return "redirect:/";
	}
}
