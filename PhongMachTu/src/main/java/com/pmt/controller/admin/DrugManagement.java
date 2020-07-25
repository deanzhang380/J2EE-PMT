package com.pmt.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.Thuoc;
import com.pmt.service.IDrugService;

@WebServlet(urlPatterns = {"/Admin/drugManagement"})
public class DrugManagement extends HttpServlet {
private static final long serialVersionUID = 3113197668287393127L;
	
	@Inject
	private IDrugService drugService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Thuoc> drugList = drugService.getAll();
		
		req.setAttribute("DrugList", drugList);
		
		if (req.getParameter("id")!=null) {
			int Id = Integer.parseInt(req.getParameter("id"));
			Thuoc thuoc = drugService.getById(Id);
			req.setAttribute("Drug", thuoc);
		}
		
		req.getRequestDispatcher("/views/Admin/drugManagement.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		String drugName = req.getParameter("drugName");
		int drugPrice = Integer.parseInt(req.getParameter("price"));
		
		if (req.getParameter("id")!=null) {
			drugService.insert(drugName, drugPrice);
		}
		else {
			//Can lam them
		}
		
		resp.sendRedirect(req.getContextPath()+"/Admin/drugManagement");
	}
}
