package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.entity.Gst;
import com.gst.repository.GstRepository;

@Repository
public class GstDao {
@Autowired
GstRepository gr;
	public String setGst(Gst t) {
		 gr.save(t);
		 return "Saved Successfully";
	}
	public String setAll(List<Gst> g) {
		gr.saveAll(g);
		return "Saved All Successfully";
	}
	public Gst getbyId(int g) {
		
		return gr.findById(g).get();
	}
	public List<Gst> getAll() {
		
		return gr.findAll();
	}
	public int gettaxByHsn(int hsn) {
		return gr.gettaxByHsn(hsn);
	}
	public int getdisbyHsn(int hsn) {
		
		return gr.getdisbyHsn(hsn);
	}
}
