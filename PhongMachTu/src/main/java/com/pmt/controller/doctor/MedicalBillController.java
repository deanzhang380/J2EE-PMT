package com.pmt.controller.doctor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmt.Util.DBConnection;
import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;
import com.pmt.model.CachDung;
import com.pmt.model.ChiTietPhieuKham;
import com.pmt.model.DanhSachKham;
import com.pmt.model.DonVi;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;
import com.pmt.model.Thuoc;
import com.pmt.reports.PrescriptionBill;
import com.pmt.service.IExamineService;

@WebServlet(urlPatterns = { "/Doctor/MedicalBill" })
public class MedicalBillController extends HttpServlet {

	String patientId = null;
	String diagnosis = null;
	String date = null;

	BenhNhan patient = null;
	DanhSachKham examinesList = null;
	NguoiDung user = null;
	Benh diease = null;

	PhieuKham prescription = null;
	List<Thuoc> medicineList = null;
	List<DonVi> unitList = null;
	List<CachDung> usageList = null;
	List<ChiTietPhieuKham> prescriptionDetailList = null;

	private static final long serialVersionUID = 3113197668287393127L;
	@Inject
	private IExamineService services;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		patientId = req.getParameter("id");
		date = req.getParameter("date");
		patient = getBenhNhan(patientId);
		prescription = services.getPrescription(patient, date);
		String remove=req.getParameter("remove");
		if(remove!=null) {
			services.deleteMedicine(String.valueOf(prescription.getMaPhieuKham()), remove);
		}
		GetResource();
		req.setAttribute("patientId", patientId);
		req.setAttribute("diagnosis", prescription.getMaPhieuKham());
		req.setAttribute("date", date);
		req.setAttribute("patientName", patient.getHoten());
		req.setAttribute("medicine", medicineList);
		req.setAttribute("unit", unitList);
		req.setAttribute("usage", usageList);
		req.setAttribute("prescriptionDetailList", prescriptionDetailList);
		req.getRequestDispatcher("/views/Doctor/medicalBill.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean flagInsertPrescription = false;
		try {
//			String function = req.getParameter("functionExamines");
//			if (req.getParameter("functionExamines") != null) {
//				try {
//					
//				} catch (Exception e) {
//					flagInsertPrescription = true;
////					resp.sendRedirect(req.getContextPath() + "/Doctor/examines?id=" + patientId + "&date=" + date
////							+ "&message=error&alert=danger");
//				}
////				resp.sendRedirect(req.getContextPath() + "/Doctor/examines?id=" + patientId + "&date=" + date
////						+ "&message=success&alert=success");
//
//			}

			if (req.getParameter("functionAdd") != null) {
				resp.sendRedirect(req.getContextPath() + "/Doctor/MedicalBill?id=" + patientId + "&date=" + date);
				int idDrug = Integer.parseInt(req.getParameter("medicine"));
				int idUnit = Integer.parseInt(req.getParameter("unit"));
				int idUsage = Integer.parseInt(req.getParameter("usage"));
				int number = Integer.parseInt(req.getParameter("number"));
				services.insertPrescriptionDetail(prescription.getMaPhieuKham(), idDrug, idUnit, idUsage, number);
			}
			
			if (req.getParameter("functionComplete") != null) {
				if(prescriptionDetailList!=null) {
					int ExaminesMoney=services.getTienKham().getThamSo();
					int MedicineMoney=0;
					for (ChiTietPhieuKham chiTietPhieuKham : prescriptionDetailList) {
						MedicineMoney+=chiTietPhieuKham.getThuoc().getGiaThuoc()*chiTietPhieuKham.getSoLuong();
					}
					try {
						services.UpdateMoney(prescription.getMaPhieuKham(), MedicineMoney+ExaminesMoney);
						
					}catch(Exception e) {
						resp.sendRedirect(req.getContextPath() + "/Doctor/MedicalBill?id=" + patientId + "&date=" + date+"&updateMoney=error");
					}
					resp.sendRedirect(req.getContextPath() + "/Doctor/MedicalBill?id=" + patientId + "&date=" + date+"&updateMoney=success");
				}
				
			}
			if (req.getParameter("functionPrint") != null) {
//				String path =String.valueOf(this.getClass().getProtectionDomain().getCodeSource().getLocation());
////				String path=System.getProperty("user.dir");;
//			     System.out.println("Working Directory = " + path);
				Map<String, Object> map = new HashMap<>();
	            map.put("PKid",String.valueOf(prescription.getMaPhieuKham()) );
				String rp=new PrescriptionBill().genarateReport(String.valueOf(prescription.getMaPhieuKham()), map,DBConnection.getConnection());
				resp.sendRedirect(req.getContextPath() + "/views/report/"+rp+".pdf");
			}
			if (req.getParameter("functionCancel") != null) {
				resp.sendRedirect(req.getContextPath() + "/Doctor/patientList");
			}

		} catch (Exception e) {
//			resp.sendRedirect(req.getContextPath() + "/Doctor/examines?id=" + patientId + "&date=" + date
//					+ "&message=error&alert=danger");
//			System.out.print("Error" + e);
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
			medicineList = services.getAllListMedicine();
			unitList = services.getAllListDonVi();
			usageList = services.getAllListUsage();
			prescriptionDetailList = services.getPrescriptionDetailByPrescriptionId(prescription.getMaPhieuKham());
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
