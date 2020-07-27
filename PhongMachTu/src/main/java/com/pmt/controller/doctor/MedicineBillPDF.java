package com.pmt.controller.doctor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/Doctor/MedicalBillPDF" })
public class MedicineBillPDF extends HttpServlet {
	public String filename=null;
	public String Report_Path = "views/report/";
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		filename=request.getParameter("id");
		PrintWriter out = response.getWriter();
		response.setContentType("application/pdf");
		String filepath = Report_Path+filename+".pdf";
		response.setHeader("Content-Disposition", "inline; filename='"+filename+".pdf'");
		FileOutputStream fileout = new FileOutputStream(filepath);
		fileout.close();
		out.close();

	}

}
