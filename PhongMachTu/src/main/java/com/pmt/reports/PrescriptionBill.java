package com.pmt.reports;

import java.io.File;
import java.sql.Connection;
import java.util.Map;

import com.lowagie.text.pdf.codec.Base64.InputStream;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.export.SimpleDocxReportConfiguration;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

public class PrescriptionBill {
	public String Project_Path = "D:/J2EE/J2EE-PMT/PhongMachTu/src/main/webapp/Report/";
	public String Report_Path = "D:/J2EE/J2EE-PMT/PhongMachTu/src/main/webapp/views/report/";
	public String genarateReport(String reportPath, Map<String, Object> map, Connection con) {
		try {
//			InputStream input = new FileInputStream(new File("F:/jrxml/employeesList.jrxml"));
//			JasperDesign jasperDesign = JRXmlLoader.load(input);
//			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			JasperReport jr = JasperCompileManager.compileReport(Project_Path + "Prescription.jrxml");
			JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
			String rp_path= Report_Path + "MedicineBill"+reportPath+".pdf";
			JasperExportManager.exportReportToPdfFile(jp, rp_path);
			return "MedicineBill"+reportPath;
		} catch (JRException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
