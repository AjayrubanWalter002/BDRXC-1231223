package com.pdfdownload.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdfdownload.Entity.Pdf;

public interface PdfRepository extends JpaRepository<Pdf, Integer>{

}
