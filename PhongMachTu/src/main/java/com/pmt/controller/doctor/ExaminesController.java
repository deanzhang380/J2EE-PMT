package com.pmt.controller.doctor;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;
import com.pmt.service.IExamineService;

@WebServlet(urlPatterns = { "/Doctor/examines" })
public class ExaminesController extends HttpServlet {

	String patientId = null;
	String diagnosis = null;
	String date = null;

	BenhNhan patient = null;
	DanhSachKham examinesList = null;
	NguoiDung user = null;
	Benh diease = null;

	PhieuKham prescription = null;

	private static final long serialVersionUID = 3113197668287393127L;
	@Inject
	private IExamineService services;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String alert = req.getParameter("alert");
		String message = req.getParameter("message");

		if (alert != null) {
			String msg = null;
			if (message.equalsIgnoreCase("success")) {
				msg = "Dang ky thanh cong";
			} else {
				msg = "Dang ky that bai";
			}
			req.setAttribute("message", msg);
			req.setAttribute("alert", alert);
		}
		try {
			patientId = req.getParameter("id");
			diagnosis = req.getParameter("diagnosis");
			date = req.getParameter("date");

			req.setAttribute("patientId", patientId);
			req.setAttribute("diagnosis", diagnosis);
			req.setAttribute("date", date);

			req.setAttribute("disease", services.getAllListDisease());
			req.setAttribute("patient", services.getPatientByID(patientId));
		} catch (Exception e) {

		}

		req.getRequestDispatcher("/views/Doctor/examines.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		boolean flagInsertPrescription = false;
		try {
			String dieaseOption = req.getParameter("diease");
			String MedicalSign = req.getParameter("medicalSign");
			String Note = req.getParameter("note");
			patient = getBenhNhan(patientId);
			diease = getBenh(dieaseOption);
			examinesList = getDanhSachKham(date);
			user = getNguoiDung("3");

			prescription = new PhieuKham();
			prescription.setBenhNhan(patient);
			prescription.setBenh(diease);
			prescription.setDanhSach(examinesList);
			prescription.setNguoiDung(user);
			prescription.setTrieuChung(MedicalSign);
			prescription.setGhiChu(Note);
			prescription.setTongTien(services.getTienKham().getThamSo());

			@SuppressWarnings("unused")
			String newPrescription = services.insertDiagnosis(prescription);
		} catch (Exception e) {
			flagInsertPrescription = true;
			System.out.print("Error" + e);

		}
		if (flagInsertPrescription == false) {
			resp.sendRedirect(req.getContextPath() + "/Doctor/examines?id=" + patientId + "&date=" + date
					+ "&message=success&alert=success");
		} else {
			resp.sendRedirect(req.getContextPath() + "/Doctor/examines?id=" + patientId + "&date=" + date
					+ "&message=error&alert=danger");
		}
	}

	private DanhSachKham getDanhSachKham(String Date) {
		return services.getExaminses(Date);
	}

	private BenhNhan getBenhNhan(String ID) {
		return services.getPatientByID(ID);
	}

	private Benh getBenh(String ID) {
		return services.getDieaseByID(ID);
	}

	private NguoiDung getNguoiDung(String ID) {
		return services.getNguoiDungByID(ID);
	}
}
