package com.pmt.controller.reception;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.service.IPatientService;

@WebServlet(urlPatterns = {"/reception/register"})
public class ServicesRegisteredController extends HttpServlet {
	
	@Inject
	private IPatientService patientService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String alert = req.getParameter("alert");
		String message = req.getParameter("message");
		
		if (alert!=null) {
			req.setAttribute("message", message);
			req.setAttribute("alert", alert);
		}
		req.getRequestDispatcher("/views/Reception/servicesRegister.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String patientName = req.getParameter("patientName");
		String patientSex = req.getParameter("patientGender");
		String patientAddress = req.getParameter("patientAddress");
		String newPatient = patientService.insertPatient(patientName, patientSex, patientAddress);
		System.out.print("Ket Qua:"+ newPatient);
		resp.sendRedirect(req.getContextPath()+"/reception/register?alert=success&message=successed");
	}
}
