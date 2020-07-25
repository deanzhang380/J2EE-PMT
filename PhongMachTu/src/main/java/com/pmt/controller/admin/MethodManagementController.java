package com.pmt.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.CachDung;
import com.pmt.model.Thuoc;
import com.pmt.service.IUsageService;
import com.pmt.service.impl.UsageService;

@WebServlet(urlPatterns = { "/Admin/methodManagement" })
public class MethodManagementController extends HttpServlet{
	private static final long serialVersionUID = 3113197668287393127L;

	@Inject
	private IUsageService usageService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<CachDung> usageList = usageService.getAll();
		
		req.setAttribute("UsageList", usageList);
		
		if (req.getParameter("id")!=null) {
			int Id = Integer.parseInt(req.getParameter("id"));
			CachDung cachDung = usageService.findById(Id);
			req.setAttribute("Usage", cachDung);
		}
		
		req.getRequestDispatcher("/views/Admin/methodManagement.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
