package com.pet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1.url맵핑을 확장자 패턴으로 변경
//@WebServlet("/PetController")
@WebServlet("*.example") //앞에 뭐가오던 .example으로 끝나면 요청을 한다
public class PetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PetController() {
        super();
        
    }

	//2.get, post요청을 action으로 하나로 묶음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				
	
		//3.요청을 분기
		request.setCharacterEncoding("utf-8"); // 한글 처리 끝!
		
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = uri.substring(contextPath.length());
		
		//System.out.println(uri);
		//System.out.println(contextPath);
		System.out.println(command);
		
		if(command.equals("/controller/join.example")) {
			System.out.println("회원 정보 수정");
		}
		
	}

}
