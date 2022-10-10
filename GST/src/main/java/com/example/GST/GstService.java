package com.example.GST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GstService {
	@Autowired
	GstDao gstDao;
	public int getPerc(int hsn){
		return gstDao.getPerc(hsn);
	}


}
