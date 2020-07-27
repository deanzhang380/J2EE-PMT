package com.pmt.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.service.IUserService;

@WebServlet(urlPatterns = {"/Admin/account/create"})
public class CreateAccountController extends HttpServlet{

	private static final long serialVersionUID = -6870519664248372537L;

	@Inject
	private IUserService userService;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
		String fullName = req.getParameter("FullName");
		String user = req.getParameter("account");
		String pass = req.getParameter("password");
		String roleName = req.getParameter("role");
		int role = 1;
		
		if (roleName.equalsIgnoreCase("Admin")) {
			role = 1;
		} else if (roleName.equalsIgnoreCase("Reception")) {
			role = 2;
		} else if (roleName.equalsIgnoreCase("Doctor")) {
			role = 3;
		} else if (roleName.equalsIgnoreCase("Pharmacies")) {
			role = 4;
		}
		
		userService.insertUser(fullName, user, pass, role);
		
		resp.sendRedirect(req.getContextPath()+"/Admin/accountManagement");
	}
	
}