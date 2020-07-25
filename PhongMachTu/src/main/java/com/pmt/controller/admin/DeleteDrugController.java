package com.pmt.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.mail.SendFailedException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.Thuoc;
import com.pmt.service.IDrugService;

@WebServlet(urlPatterns = {"/Admin/drug/delete"})
public class DeleteDrugController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4925817401821143809L;

	
	@Inject
	private IDrugService drugService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int Id = Integer.parseInt(req.getParameter("id"));

		drugService.delete(Id);
		
		resp.sendRedirect(req.getContextPath() + "/Admin/drugManagement");
	}
}
