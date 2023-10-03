package com.pdfdownload.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.pdfdownload.Entity.Pdf;
import com.pdfdownload.Repository.PdfRepository;

@Repository
public class PdfDao {
 @Autowired
 PdfRepository r;
 public String setAll(List<Pdf> a) {
	  r.saveAll(a);
	  return "Saved Successfully";
 }
}
