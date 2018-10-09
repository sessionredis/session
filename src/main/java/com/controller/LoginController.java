package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.User;
import com.session.WebSecurityConfig;
import com.test01.entity.Users;
import com.test01.service.UsersService;

@Controller
public class LoginController {

	@Autowired
	private UsersService usersService;
	 @GetMapping("/hello")
	    public String index() {
		 System.err.println("=============");
	    	return "redirect:/hello.html";
	    }
	    @GetMapping("/second")
	    public String second() {
	    	return "redirect:/second.html";
	    }
	    @GetMapping("/login")
	    public String login() {
	        return "redirect:/login.html";
	    }

	    @PostMapping("/loginPost")
	    public  String loginPost(@Valid User user,HttpServletRequest request, HttpServletResponse response) {
	    	HttpSession session = request.getSession();
	    	Users users = usersService.queryUsers(user);
	    	if(users!=null){
	    		if(users.getUsername().equals(user.getUserName())&&users.getPassword().equals(user.getUserPwd())){
		        	// 设置session
		            session.setAttribute(WebSecurityConfig.SESSION_KEY, user.getUserName());
		            return "redirect:/hello";
		        }else{
		        	return "redirect:/login";
		        }
	    	}else{
	        	return "redirect:/login";
	        }
	        
	        
	    }
	    @GetMapping("/logout")
	    public String logout(HttpServletRequest request, HttpServletResponse response) {
	    	HttpSession session = request.getSession(false);
	        // 移除session
	        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
	        return "redirect:/login";
	    }
}