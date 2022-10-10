package com.example.GST;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GstRepository extends JpaRepository<Gst, Integer> {

	@Query (value="select percentage from gst_details where hsn=?",nativeQuery=true)
	public int getPerc(int hsn);
}
