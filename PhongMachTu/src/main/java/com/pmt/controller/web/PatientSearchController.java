package com.pmt.controller.web;

import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.Util.SessionUtil;
import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.service.IPatientListService;

@WebServlet(urlPatterns = { "/reception/search" })
public class PatientSearchController extends HttpServlet {

	SessionUtil session= new SessionUtil();
	@Inject
	private IPatientListService services;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String date = req.getParameter("date");
		if (date != null) {
			String Date = FormatDate(date);
			System.out.print("Date:" + Date);
			try {
				List<BenhNhan> ds= services.getPatientListByDate(Date);
				System.out.print("Danh sach Benh Nhan:" + ds);
				req.setAttribute("patientList", ds);
			} catch (Exception e) {
				System.out.print("Error:" + e);
			}
		}

		req.getRequestDispatcher("/views/Reception/patientSearch.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Date = req.getParameter("searchDate");
//		System.out.print("Date:"+Date);
		if (Date != null) {
			resp.sendRedirect(req.getContextPath() + "/reception/search?date=" + Date);
		} else {
			resp.sendRedirect(req.getContextPath() + "/reception/search?date=null");
		}

	}

	private String FormatDate(String Date) {
		String ds1 = Date;
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		String ds2 = null;
		try {
			ds2 = sdf2.format(sdf1.parse(ds1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.print("Ds2:"+ds2);
		return ds2;
	}
}
