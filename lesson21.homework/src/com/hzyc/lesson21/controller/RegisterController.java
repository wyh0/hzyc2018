package com.hzyc.lesson21.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzyc.lesson21.bean.Register;
import com.hzyc.lesson21.service.RegisterService;


@Controller
public class RegisterController { 
	
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/add_user.do")  
	public String registerUser(Register g){
		
			//调用业务层的代码,将数据存储到数据库中
   boolean result=	registerService.insertUser(g);
    if(result){		
		return "ok.jsp";}else{ 
			
			return null;}

	}


	
	@RequestMapping("/queryUser.do")
	public String queryUser(HttpServletRequest request,HttpSession session,String username,String password,Register g){
		
			
			   String user = request.getParameter("username"); 
		 	   String pass = request.getParameter("password");

			
			try {
				List<Register> sList = registerService.queryUser(username,password);
				
				System.out.println("-----------------------------------");
		 		System.out.println(sList.get(0).getUsername());
		 		
		        

		 	   if(sList.get(0).getUsername().equals(user) &&sList.get(0).getPassword().equals(pass)){
		 		  session.setAttribute("username", g.getUsername());
		 			return "next_1.jsp";
		 	
		 	   }else{  
		 		
		 		  return "demo.jsp";
		 		
		 	   }
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "demo.jsp";
		
	 		
	}
	@RequestMapping("/logout.do")
		public String logout(HttpSession session){
			//将session清空。
			session.invalidate();
			return "demo.jsp";
		}


}
