package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.dao.GstDao;
import com.gst.entity.Gst;

@Service
public class GstService {
@Autowired
GstDao gd;
	public String setGst(Gst k) {
		return gd.setGst(k);
	}
	public String setAll(List<Gst> g) {
		
		return gd.setAll(g);
	}
	public Gst getbyId(int g) {
		return gd.getbyId(g);
	}
	public List<Gst> getAll() {
		
		return gd.getAll();
	}
	public int gettaxByHsn(int hsn) {
		return gd.gettaxByHsn(hsn);
	}
	public int getdisbyHsn(int hsn) {
		return gd.getdisbyHsn(hsn);
	}
}
