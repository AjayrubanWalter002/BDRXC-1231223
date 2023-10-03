package com.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer>{
@Query(value="select tax from gst where hsn = ?",nativeQuery=true)
	public int gettaxByHsn(int hsn);
@Query(value="select discount from gst where hsn = ?",nativeQuery=true)
public int getdisbyHsn(int y);

}
