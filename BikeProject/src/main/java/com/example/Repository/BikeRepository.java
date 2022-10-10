package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.BikeModel;

public interface BikeRepository extends JpaRepository<BikeModel, Long> {

}
