package com.pmt.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.NguoiDung;
import com.pmt.service.IUserService;
import com.pmt.service.impl.UserService;

@WebServlet(urlPatterns = {"/Admin/accountManagement"})
public class AccountManagementController extends HttpServlet {

	private static final long serialVersionUID = 3113197668287393127L;
	
	@Inject
	private IUserService userService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<NguoiDung> users = userService.getAll();
		
		req.setAttribute("UserList", users);
		
		req.getRequestDispatcher("/views/Admin/accountManagement.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
	}

}
