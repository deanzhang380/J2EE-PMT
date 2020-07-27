package com.pmt.controller.reception;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.service.IPatientService;

@WebServlet(urlPatterns = { "/reception/register" })
public class ServicesRegisteredController extends HttpServlet {

	@Inject
	private IPatientService patientService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String alert = req.getParameter("alert");
		String message = req.getParameter("message");

		if (alert != null) {
			String msg = null;
			if (message.equalsIgnoreCase("successed")) {
				msg = "Dang ky thanh cong";
			} else {
				msg = "Dang ky that bai";
			}
			req.setAttribute("message", msg);
			req.setAttribute("alert", alert);
		}
		req.getRequestDispatcher("/views/Reception/servicesRegister.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newPatient = null;
		String Id_Date = null;
		boolean flag_error= false;
		String Date = req.getParameter("Date");
//		System.out.print("Date:"+Date);
//		int haveDate=patientService.findDateInExaminesList(Date);
		if (checkDate(Date) == 1) {
			System.out.print("Have a date in database.");
			Id_Date = String.valueOf(patientService.getIdDate(Date).getMaDanhSachKham());
			System.out.print("Id_Date:"+ Id_Date);
		} else if (checkDate(Date) == 0) {
			Id_Date =patientService.insertExaminesList(Date);
		} else {
			flag_error=true;
			System.out.print("Register Error");
			return;
		}
		try {
			String patientName = req.getParameter("patientName");
			String patientSex = req.getParameter("patientGender");
			String patientAddress = req.getParameter("patientAddress");
			newPatient = patientService.insertPatient(patientName, patientSex, patientAddress);
			if (Id_Date != null && newPatient != null) {
				patientService.insertExaminseListDetail(Id_Date, newPatient);
			} else {
				flag_error=true;
				System.out.print("Register Error");
			}
		} catch (Exception e) {
			flag_error=true;
		}

		if (newPatient.equalsIgnoreCase("Insert error") || newPatient.equalsIgnoreCase(null)||flag_error==true) {
			resp.sendRedirect(req.getContextPath() + "/reception/register?alert=danger&message=error");
		} else {
			resp.sendRedirect(req.getContextPath() + "/reception/register?alert=success&message=successed");
		}

	}

	private int checkDate(String Date) {
		int haveDate = -1;
		try {
			haveDate = patientService.findDateInExaminesList(Date);
			return haveDate;
		} catch (Exception e) {
			return -1;
		}
	}

}
