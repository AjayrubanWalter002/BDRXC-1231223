package com.jdbctemplate.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jdbctemplate.DaoImplements.DetailsDaoImple;
import com.jdbctemplate.Entity.Details;
@RestController
public class DetailsController {
   @Autowired
   DetailsDaoImple ddi;
   
   @PostMapping("/set")
   public String save(@RequestBody Details d) {
	   return ddi.save(d)+"Updated Successfully";
   }
   @GetMapping("/getAlls")
   public List<Details> findAll(){
	   List<Details> d = ddi.findAll();
	   XSSFWorkbook wb = new XSSFWorkbook();
	   XSSFSheet sheet = wb.createSheet("Student Result");
	   Row header = sheet.createRow(0);

//	   here we create the cells by the attributes we need
//	   here also we mentioned 1 so it creates in the 1st position
//	   if we started/give 0 it will create attributes from the 0th column/row
	   
		header.createCell(1).setCellValue("ID");
		header.createCell(2).setCellValue("Name");
		header.createCell(3).setCellValue("Age");
		header.createCell(4).setCellValue("Gender");
//		header.createCell(4).setCellValue("Result");

//		here we use the temporary varibale to iteration
		int i=1;
		
		
		for (Details s : d) {
			
			Details asd = s;   //Either we can use "s" directly, but this is the alternative way 
//			here we increment the row by iteration for each iteration until the condition got false it will terminates the rows increment
			Row row = sheet.createRow(i++); 
			
			row.createCell(1).setCellValue(asd.getId());  //here we mentioned the attributes from 1 if we set 0 it will generated in the 0th row
			row.createCell(2).setCellValue(asd.getUserName());
			row.createCell(3).setCellValue(asd.getAge());
			row.createCell(4).setCellValue(asd.getGender());
			
			
		}
		try {
			// write the workbook in file system.
//			here we use the FileInputStream to Write the file on your/our System 
//			in the file we mentioned the .xlsx format this is why? because here we need a Excel file format so we have to mentioned the Excel extension format
//			well we see this FileInput and OutputStream in the transient keyword on that scenario we mentioned the text format extension .txt
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\91824\\Desktop\\New6.xlsx"));
			wb.write(out);
			out.close();
			System.out.println("Written Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	   return ddi.findAll();
   }
   @GetMapping("/findById/{id}")
   public Details findById(@PathVariable int id) {
	   return ddi.findById(id);
   }
   @PutMapping("/update/{id}")
   public String update(@RequestBody Details f, @PathVariable int id) {
	   return ddi.update(id, f)+"updated the given details successfully";
   }
}
