package com.pmt.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.BenhNhan;
import com.pmt.service.IPatientService;



@WebServlet(urlPatterns = {"/reception"})
public class PatientRegistrationController extends HttpServlet{

	private static final long serialVersionUID = 5192859042635202289L;

	@Inject
	private IPatientService patientService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/Reception/index.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String patientID = req.getParameter("id");
		String patientName = req.getParameter("name");
		String patientSex = req.getParameter("sex");
		String patientAddress = req.getParameter("address");
		
		String newPatient = patientService.insertPatient(patientID, patientName, patientSex, patientAddress);
		
	}
}
