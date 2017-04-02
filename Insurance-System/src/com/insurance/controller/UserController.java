package com.insurance.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.model.Customer;
import com.insurance.service.UserService;

public class UserController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String loginId=req.getParameter("loginID");
		String name=req.getParameter("uName");
		String dateOfBirth=req.getParameter("datBirth");
		String pass=req.getParameter("password1");
		String address=req.getParameter("address");
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		String pincode=req.getParameter("pincode");
		Customer customer=new Customer(loginId, name, dateOfBirth, address, phone, email, pass, gender,  country, state,  city, pincode );
		
		try{
			UserService userService = new UserService();
			boolean result = userService.addUser(customer);
			
			if(result){
			resp.sendRedirect("login.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
				
	
	
	}

	
}
