package com.pdfdownload.PdfGenerator;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import com.pdfdownload.Entity.Pdf;

import jakarta.servlet.http.HttpServletResponse;
import lombok.Setter;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPCell;
@Setter
public class PDFGeneratorPdf {
	public void generate(HttpServletResponse response) throws  IOException {

		 List<Pdf> PdfList=null;
		  // Create the Object of Document
		  Document document = new Document(PageSize.A4);
		  // get the document and write the response to output stream
		  PdfWriter.getInstance(document, response.getOutputStream());
		  document.open();
		  // Add Font
		  Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		  fontTiltle.setSize(20);
		                // Create Object of Paragraph
		  Paragraph paragraph = new Paragraph("Pdf List", fontTiltle);
		  paragraph.setAlignment(Paragraph.ALIGN_CENTER);
		  // Add to the document
		  document.add(paragraph);
		  PdfPTable table = new PdfPTable(5);
		  table.setWidthPercentage(100f);
		  table.setWidths(new int[] { 1, 1, 3, 2, 4 });
		  table.setSpacingBefore(5);
		  // Create Table Header
		  PdfPCell cell = new PdfPCell();
		  cell.setBackgroundColor(Color.MAGENTA);
		  cell.setPadding(5);
		  // Add Font
		  Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		  font.setColor(Color.WHITE);
		  cell.setPhrase(new Phrase("ID", font));
		  table.addCell(cell);
		  cell.setPhrase(new Phrase("Vehicle Name", font));
		  table.addCell(cell);
		  cell.setPhrase(new Phrase("Model Name", font));
		  table.addCell(cell);
		  cell.setPhrase(new Phrase("Brand", font));
		  table.addCell(cell);
		  cell.setPhrase(new Phrase("Vehicle Number", font));
		  table.addCell(cell);
		  for (Pdf pdf : PdfList) {
		   table.addCell(String.valueOf(pdf.getId()));
		   table.addCell(pdf.getBrand());
		   table.addCell(pdf.getModelName());
		   table.addCell(pdf.getVname());
		   table.addCell(pdf.getNo());
		  }
		  // Add table to document
		  document.add(table);
		  document.close();
		 }
}
