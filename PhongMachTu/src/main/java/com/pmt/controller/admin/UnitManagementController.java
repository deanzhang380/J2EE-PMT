package com.pmt.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.dao.IUnitDao;
import com.pmt.model.DonVi;
import com.pmt.service.IUnitService;

@WebServlet(urlPatterns = { "/Admin/unitManagement" })
public class UnitManagementController extends HttpServlet {
	private static final long serialVersionUID = 3113197668287393127L;

	@Inject
	private IUnitService unitService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<DonVi> donVi = unitService.getAll();
		
		req.setAttribute("UnitList", donVi);
		
		req.getRequestDispatcher("/views/Admin/unitManagement.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String unit = req.getParameter("name");
		
		unitService.insert(unit);
		
		resp.sendRedirect(req.getContextPath() + "/Admin/unitManagement");
	}
}
