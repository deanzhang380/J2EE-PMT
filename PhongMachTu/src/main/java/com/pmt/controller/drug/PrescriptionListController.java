package com.pmt.controller.drug;

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
import com.pmt.model.PhieuKham;
import com.pmt.service.IPatientListService;
import com.pmt.service.IPrescriptionListService;

@WebServlet(urlPatterns = { "/Drug/prescriptionList" })
public class PrescriptionListController extends HttpServlet {
	@Inject
	private IPrescriptionListService services;

	List<PhieuKham> diagnosisList=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String date = req.getParameter("date");
		String flag= req.getParameter("getall");
		req.setAttribute("date", date);
		if (date != null) {
			String Date = FormatDate(date);
//			System.out.print("Date:" + Date);
			try {	
				if(flag.equalsIgnoreCase("true")){
					diagnosisList=services.getAllListPrescriptionByDate(Date, 1);
					SetPatientForList(diagnosisList);
					req.setAttribute("prescriptionList", diagnosisList);
				}else {
					diagnosisList=services.getAllListPrescriptionByDate(Date, 0);
					SetPatientForList(diagnosisList);
					req.setAttribute("prescriptionList", diagnosisList);
				}
				
//				req.setAttribute("diagnosis", services.getIdPatientListByDate(Date).getMaDanhSachKham());
//				req.setAttribute("Date", Date);
			} catch (Exception e) {
				System.out.print("Error:" + e);
			}
		}

		req.getRequestDispatcher("/views/Drug/diagnosisList.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Date = req.getParameter("searchDate");
		String flag= req.getParameter("getAll");
		if (Date != null) {
			resp.sendRedirect(req.getContextPath() + "/Drug/prescriptionList?date=" + Date+"&getall="+flag);
		} else {
			resp.sendRedirect(req.getContextPath() + "/Drug/prescriptionList?date=null");
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
	
	private void SetPatientForList(List<PhieuKham> list) {
		for (PhieuKham phieuKham : list) {
			phieuKham.setBenhNhan(services.getPatientByID(phieuKham.getBenhNhan().getMaBenhNhan()));
		}
	}
}