package com.pdfdownload.Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pdfdownload.Entity.Pdf;
import com.pdfdownload.Service.PdfService;

import jakarta.servlet.http.HttpServletResponse;
 import com.pdfdownload.PdfGenerator.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class PdfController {
	@Autowired
	PdfService s;
	@PostMapping("/setAlls")
     public String setAll(@RequestBody List<Pdf> a) {
    	 return s.setAll(a);
     }
	

	 @GetMapping("/pdf/vehicle")
	 public void generator(HttpServletResponse response) throws  IOException {
	  response.setContentType("application/pdf");
	  SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
	  String currentDateTime = dateFormat.format(new Date(0));
	  String headerkey = "Content-Disposition";
	  String headervalue = "attachment; filename=pdf_"+currentDateTime+".pdf";
	  response.setHeader(headerkey, headervalue);
	  List<Pdf> PdfList = PdfService.getAllUser();
	  PDFGeneratorPdf generetorUser = new PDFGeneratorPdf();
	  generetorUser.pdfList(PdfList);
	  generetorUser.generate(response);
}
}
