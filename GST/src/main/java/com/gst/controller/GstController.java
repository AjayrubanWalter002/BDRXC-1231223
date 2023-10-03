package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
public class GstController {
	@Autowired
	GstService gs;
	@PostMapping("/setGst")
public String setGst(Gst g) {
	return gs.setGst(g);
}
	@PostMapping("/setAll")
	public String setAll(@RequestBody List<Gst> g) {
		return gs.setAll(g);
	}
	@GetMapping("/getbyId/{id}")
	public Gst getbyId(@PathVariable int id) {
		return gs.getbyId(id);
	}
	@GetMapping("/getAll")
		public List<Gst> getAll(){
			return gs.getAll();
		}
	@GetMapping("/getTaxByHsn/{hsn}")
	public int gettaxByHsn(@PathVariable int
			hsn) {
		return gs.gettaxByHsn(hsn);
	}
    @GetMapping("getDiscountbyHsn/{hsn}")
	public int getdisbyHsn(@PathVariable int hsn) {
	return gs.getdisbyHsn(hsn);
	}
	}

