package com.sbs.java.blog;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/home/dan")
@WebServlet("/HomeDanServlet")
public class HomeDanServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int dan = 9;
//		
//		RequestDispatcher rd = request.getRequestDispatcher("/jsp/home/dan.jsp");
//		request.setAttribute("name", "하승범");
//		request.setAttribute("dan", dan);
//		
//		for ( int i = 1; i <= dan; i++ ) {
//			request.setAttribute("i", i);
//			request.setAttribute("result", dan*i);
//			rd.forward(request, response);
//		}
		
//		RequestDispatcher rd = request.getRequestDispatcher("/jsp/home/dan.jsp");
//		int dan = Integer.parseInt(request.getParameter("dan"));
//
//		request.setAttribute("name", dan+"단");
//		request.setAttribute("dan", dan);
//		rd.forward(req,resp);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/home/dan.jsp");
		request.setAttribute("name", "하승범");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/home/main.jsp");
		RequestDispatcher nullRd = request.getRequestDispatcher("/jsp/home/null.jsp");
		int dan;
		String nullDan;
		
		try{
			dan = Integer.parseInt(request.getParameter("dan"));
		} catch(NumberFormatException e) {
			nullDan = request.getParameter("dan");
			request.setAttribute("nullDan", nullDan);
			request.setAttribute("mesege", "숫자를 입력해 주세요.");
			nullRd.forward(request, response);
			return;
		}
		
		request.setAttribute("dan", dan);
		
		String result ="";
        for (int i=1; i<10; i++){
            result += dan + "*" + i + "=" + (dan*i)+ "<br/>";
        }
        request.setAttribute("result", result); //result 변수를 request의 저장소에 담는다.
        

        rd.forward(request, response); //두개를 보내준다. 
		

//		doGet(request, response);
	}

}
