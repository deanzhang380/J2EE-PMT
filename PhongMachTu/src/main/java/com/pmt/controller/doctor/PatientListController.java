package com.pmt.controller.doctor;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.BenhNhan;
import com.pmt.service.IPatientListService;

@WebServlet(urlPatterns = { "/Doctor/patientList" })
public class PatientListController extends HttpServlet {
	@Inject
	private IPatientListService services;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String date = req.getParameter("date");
		req.setAttribute("date", date);
		if (date != null) {
			String Date = FormatDate(date);
			System.out.print("Date:" + Date);
			try {
				List<BenhNhan> ds= services.getPatientListByDate(Date);
				List<BenhNhan> list= new ArrayList<BenhNhan>();
				for (BenhNhan benhNhan : ds) {
					if(services.CheckPatientInList(benhNhan, Date)==0) {
						list.add(benhNhan);
					}
				}
				System.out.print("Danh sach Benh Nhan:" + list);
				req.setAttribute("patientList", list);
				req.setAttribute("diagnosis", services.getIdPatientListByDate(Date).getMaDanhSachKham());
				req.setAttribute("Date", Date);
			} catch (Exception e) {
				System.out.print("Error:" + e);
			}
		}

		req.getRequestDispatcher("/views/Doctor/patientSearch.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Date = req.getParameter("searchDate");
		if (Date != null) {
			resp.sendRedirect(req.getContextPath() + "/Doctor/patientList?date=" + Date);
		} else {
			resp.sendRedirect(req.getContextPath() + "/Doctor/patientList?date=null");
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
