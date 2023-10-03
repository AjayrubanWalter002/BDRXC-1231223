package com.pdfdownload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pdfdownload.Entity.Pdf;
import com.pdfdownload.Repository.PdfRepository;

@SpringBootApplication
public class PdfDownloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfDownloadApplication.class, args);
	}
	@Autowired
	 private PdfRepository r;
	 public void run(String... args) throws Exception {
	  for (int i = 0; i < 23; i++) {
	   Pdf p = new Pdf();

	   p.setVname("Safari" + i);

	   p.setModelName("turbo245" + i);

	   p.setBrand("Tata" + i);

	   p.setNo("Tn-11-An-2345" + i);
	   
	   r.save(p);
	  }
	 }
	}
