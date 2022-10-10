package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<BikeEntity,Integer> {
	

}
