package com.pmt.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.service.IUserService;

@WebServlet(urlPatterns = {"/Admin/account/delete"})
public class DeleteAccountController extends HttpServlet{

	private static final long serialVersionUID = -767569668094647303L;
	
	@Inject
	private IUserService userService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int userId = Integer.parseInt(req.getParameter("id"));
		
		userService.deleteUser(userId);
		
		resp.sendRedirect(req.getContextPath()+"/Admin/accountManagement");
	}

}
