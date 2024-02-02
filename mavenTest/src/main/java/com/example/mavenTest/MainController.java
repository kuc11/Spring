package com.example.mavenTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.mavenTest.DTO.memberDTO;
import com.example.mavenTest.service.MemberService;

@Controller
public class MainController {
	private final MemberService memberService;
	
	public MainController(MemberService memberService) {
		this.memberService=memberService;
		
	}
	
	@GetMapping("/")	// 주소요청
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView( "index" );
		mv.addObject("prt","member");	// prt 라는 이름에 변수를 생성하고 member 라는 문자열을 저장
		
		return mv;
	}
	
	@GetMapping( "/signup" )	// 주소요청
	public ModelAndView signup() {
		ModelAndView mv = new ModelAndView( "signup" );
		return mv;
	}
	
	@GetMapping( "/signin" )	// 주소요청
	public ModelAndView signin() {
		ModelAndView mv = new ModelAndView( "signin" );
		return mv;
	}
	// 클래스로 한번에 받아오는 방법
	@PostMapping("/signup/Enroll")
	public ModelAndView signEnroll( @ModelAttribute memberDTO memberdto) {
		ModelAndView mv = new ModelAndView( "index" );
		System.out.println( memberdto.getEmail() );
		memberService.insert(memberdto);
		return mv;
	}
	
	
	
	
	
//	@PostMapping( "/signup/Enroll" ) 		//post 방식이기에
//	public ModelAndView signEnroll(
//			@RequestParam( "email" ) String email,	 	하나하나씩 받아오는 방법
//			@RequestParam( "pin" ) String pw,
//			@RequestParam( "name" ) String name,
//			@RequestParam( "tel" ) String tel ) {
//		
//		ModelAndView mv = new ModelAndView("index");
//		System.out.println( email );
//		
//		return mv;
//	}
}


















