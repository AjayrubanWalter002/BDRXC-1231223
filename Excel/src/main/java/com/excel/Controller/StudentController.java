package com.excel.Controller;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.excel.Entity.*;
//import com.excel.ExcelGenerator.ExcelGenerator;
import com.excel.Service.StudentService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;

	@PostMapping("/setAllStudents")
	public String setAll(@RequestBody List<Student> s) {
		return ss.setAll(s);
	}

	@GetMapping("/getAll")
	public List<Student> getAll() {
		return ss.getAll();
	}

//@GetMapping("/export-to-excel")
//public void exportIntoExcelFile(HttpServletResponse response) throws IOException {
//    response.setContentType("application/octet-stream");
//    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
//    String currentDateTime = dateFormatter.format(new Date());
//
//    String headerKey = "Content-Disposition";
//    String headerValue = "attachment; filename=student" + currentDateTime + ".xlsx";
//    response.setHeader(headerKey, headerValue);
//
//    List <Student> listOfStudents = ss.getTheListStudent();
//    ExcelGenerator generator = new ExcelGenerator(listOfStudents);
//    generator.generateExcelFile(response);
//}
	@GetMapping("/getExcel")
	public List<Student> getExcel() {
		List<Student> p = new ArrayList();
		p = ss.getAll();
		// create a blank sheet
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student Result");
		CellStyle cs = workbook.createCellStyle();
		// setcolors
		cs.setBottomBorderColor(IndexedColors.MAROON.getIndex());
		cs.setFillBackgroundColor(IndexedColors.YELLOW.getIndex());
		cs.setFillBackgroundColor(IndexedColors.RED.getIndex());
		// create heading for the excel
		Row header = sheet.createRow(0);

		header.createCell(0).setCellValue("ID");
		header.createCell(1).setCellValue("RollNo");
		header.createCell(2).setCellValue("StudentName");
		header.createCell(3).setCellValue("TotalMarks");
		header.createCell(4).setCellValue("Result");

		int rownum = 1;
		for (Student s : p) {
			Student objArr = s;
			Row row = sheet.createRow(rownum++);
			row.createCell(0).setCellValue(objArr.getId());
			row.createCell(1).setCellValue(objArr.getRollNo());
			row.createCell(2).setCellValue(objArr.getName());
			row.createCell(3).setCellValue(objArr.getTotalMarks());
			row.createCell(4).setCellValue(objArr.getResult());
		}
//	 return ss.getExcel();
		try {
			// write the workbook in file system.
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\91824\\Desktop\\New folder (3).txt"));
			workbook.write(out);
			out.close();
			System.out.println("Written Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
