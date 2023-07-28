package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//핸들러 어댑터에 연결이 되려면 특정 클래스를 상속44
public class HomeController extends MultiActionController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String uri = request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());
		System.out.println(path);
		
		if(path.equals("/test/aaa")) {
			System.out.println("aaa메서드~~");
			
			ModelAndView mv = new ModelAndView();
			//mv.setViewName("/WEB-INF/views/aaa.jsp"); //뷰리졸버 생성 전
			mv.setViewName("aaa"); //뷰리졸버 생성 후
			mv.addObject("data", "hello world");
			
			return mv; // controller에서는 뷰에 대한 정보와 데이터에 대한 정보를 반환
		} else if(path.equals("/test/bbb")) {
			System.out.println("bbb메서드");
		}

		return null;
	}
	

}
