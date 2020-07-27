package com.pmt.controller.drug;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;
import com.pmt.model.CachDung;
import com.pmt.model.ChiTietPhieuKham;
import com.pmt.model.DanhSachKham;
import com.pmt.model.DonVi;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;
import com.pmt.model.Thuoc;
import com.pmt.service.IExamineService;

@WebServlet(urlPatterns = { "/Drug/MedicineBill" })
public class MedicineBillController extends HttpServlet {

	String prescriptionID = null;
	String diagnosis = null;
	String date = null;
	BenhNhan patient=null;
	PhieuKham prescription = null;

	List<ChiTietPhieuKham> prescriptionDetailList = null;

	private static final long serialVersionUID = 3113197668287393127L;
	@Inject
	private IExamineService services;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			prescriptionID = req.getParameter("Pid");
			GetResource();
			req.setAttribute("prescriptionDetailList", prescriptionDetailList);
			req.getRequestDispatcher("/views/Drug/medicineBill.jsp").forward(req, resp);
		}catch(Exception e) {
			
		}
		req.getRequestDispatcher("/views/Drug/medicineBill.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		boolean flagInsertPrescription = false;
		try {
			
			if (req.getParameter("functionComplete") != null) {
				if(prescriptionDetailList!=null) {
					try {
						services.UpdateStatus(Integer.parseInt(prescriptionID), 1);
					}catch(Exception e) {
						resp.sendRedirect(req.getContextPath() + "/Drug/MedicineBill?id=" + prescriptionID + "&updateStatus=error");
					}
					resp.sendRedirect(req.getContextPath() + "/Drug/MedicineBill?id=" + prescriptionID + "&updateStatus=success");
				}
				
			}

			if (req.getParameter("functionCancel") != null) {
				resp.sendRedirect(req.getContextPath() + "/Drug/prescriptionList");
			}

		} catch (Exception e) {
			System.out.print("Error" + e);
			return;
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

	private void GetResource() {
		try {
			prescriptionDetailList = services.getPrescriptionDetailByPrescriptionId(Integer.parseInt(prescriptionID));
			GetPrescriptionDetail(prescriptionDetailList);
		} catch (Exception e) {
			System.out.print("Error when get Resource" + e);
		}
	}
	
	private void GetPrescriptionDetail(List<ChiTietPhieuKham> prescriptionDetailList) {
		for (ChiTietPhieuKham chiTietPhieuKham : prescriptionDetailList) {
			chiTietPhieuKham.setThuoc(services.getMedicine(chiTietPhieuKham.getThuoc().getId()));
			chiTietPhieuKham.setDonVi(services.getUnit(chiTietPhieuKham.getDonVi().getMaDonVi()));
			chiTietPhieuKham.setCachDung(services.getUsage(chiTietPhieuKham.getCachDung().getMaCachDung()));
		}
	}
}