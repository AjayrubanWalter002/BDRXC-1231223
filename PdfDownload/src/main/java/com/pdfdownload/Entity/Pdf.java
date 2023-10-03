package com.pdfdownload.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pdf_files")
public class Pdf {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String vehicleName;
   private String modelName;
   private String brand;
   private String vehicleNo;
   
  public void setId(int id) {
	  this.id=id;
  }
  public int getId() {
	  return id;
  }
  public void setVname(String name) {
	  this.vehicleName=vehicleName;
  }
  public String getVname() {
	  return vehicleName;
  }
  public void setBrand(String brand) {
	  this.brand=brand;
  }
  public String getBrand() {
	  return brand;
  }
  public void setNo(String vehicelNo) {
	  this.vehicleNo=vehicelNo;
  }
  public String getNo() {
	  return vehicleNo;
  }
  public void setModelName(String modelName) {
	  this.modelName=modelName;
  }
  public String getModelName() {
	  return modelName;
  }
  public Pdf(int id,String vehicelName,String modelName,String brand,String vehicleNo) {
	  this.id=id;
	  this.vehicleName=vehicelName;
	  this.brand=brand;
	  this.modelName=modelName;
	  this.vehicleNo=vehicleNo;  
  }
  public Pdf() {
  }
public void pdfList(List<Pdf> pdfList) {
	
	
}
}










