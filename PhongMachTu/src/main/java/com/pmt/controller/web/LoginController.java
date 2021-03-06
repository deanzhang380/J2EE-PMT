package com.pmt.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.AndOperator;

import com.pmt.Util.SessionUtil;
import com.pmt.model.NguoiDung;
import com.pmt.service.IUserService;

@WebServlet(urlPatterns = {"/home", "/login"})
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = -4201206888409251556L;

	@Inject
	private IUserService userService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		NguoiDung user = userService.checkUser(username, password);
		
//		if (user != null && user.getVaiTro().getTenVaiTro().equalsIgnoreCase("admin") ) {
//			resp.sendRedirect(req.getContextPath()+"/admin-home");
//		} else if (user != null && user.getVaiTro().getId()==2 ) {
//			resp.sendRedirect(req.getContextPath()+"/reception");
//		} else if (user != null && user.getVaiTro().getId()==3 ) {
//			resp.sendRedirect(req.getContextPath()+"/Doctor");
//		} else if (user != null && user.getVaiTro().getId()==4 ) {
//			resp.sendRedirect(req.getContextPath()+"/Pharmacies");
//		} else {
//			resp.sendRedirect(req.getContextPath()+"/login");
//		}
		
		if (user != null) {
			SessionUtil.getInstance().putValue(req, "USERLOGIN", user);
			
			switch (user.getVaiTro().getId()) {
			case 1:
				resp.sendRedirect(req.getContextPath()+"/admin-home");
				break;
			case 2:
				resp.sendRedirect(req.getContextPath()+"/reception");
				break;
			case 3:
				resp.sendRedirect(req.getContextPath()+"/Doctor");
				break;
			case 4:
				resp.sendRedirect(req.getContextPath()+"/Pharmacies");
				break;
			default:
				resp.sendRedirect(req.getContextPath()+"/login");
				break;
			}
		} else {
			resp.sendRedirect(req.getContextPath()+"/login");
		}
		
	}
}
