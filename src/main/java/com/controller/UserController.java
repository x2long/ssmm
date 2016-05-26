package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	@Autowired
	private UserServiceI userServiceI;
	
	@RequestMapping("/showUser")
	public String showUser(String id,HttpServletRequest request){
		User user=userServiceI.getUserById(id);
		request.setAttribute("user",user);
		return "showUser";
	}

}
