package com.example.GST;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstRepo;
	public int getPerc(int hsn){
		return gstRepo.getPerc(hsn);
	}


}
