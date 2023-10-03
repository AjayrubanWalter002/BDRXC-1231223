package com.pdfdownload.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdfdownload.Dao.PdfDao;
import com.pdfdownload.Entity.Pdf;
import com.pdfdownload.Repository.PdfRepository;


@Service
public class PdfService {
 @Autowired
   PdfDao d;
 @Autowired
 PdfRepository r;
	public String setAll(List<Pdf> a) {
		return d.setAll(a);
	}
	public static List<Pdf> getAllUser()throws IOException{
		   return getAllUser();
		 }

}
