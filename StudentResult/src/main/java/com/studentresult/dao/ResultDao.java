package com.studentresult.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.studentresult.entity.Results;
import com.studentresult.repository.ResultsRepository;

@Repository
public class ResultDao {
@Autowired
ResultsRepository rr;
//public String setAllMarks(List<Results> ser1, List<Results> ser2) {
  //rr.saveAll(ser1,ser2);
	//return "Saved Successfully";
//}
public String setAllMarks(List<Results> ser1) {
	rr.saveAll(ser1);
	return "saved";
}
public String setAllMarks1(List<Results> ser2) {
	rr.saveAll(ser2);
	return "saved";
}
public String setResult(List<Results> f) {
	rr.saveAll(f);
	return "Saved your details successfully";
}
public List<Results> getallResult() {
	 return rr.findAll();
}
public Results getTopper() {
	
	return rr.getTopper();
}
public List<Results> gettopThree() {
	return rr.gettopThree();
}
public List<Results> orderDesc() {
	return rr.orderDesc();
}

}
