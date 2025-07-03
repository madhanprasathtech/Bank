package com.example.Myweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Myweb.entity.Bankentity;

public interface Bankrepository extends JpaRepository<Bankentity,Integer> {

	@Query(value="select branch from bank_details where ifsc = ?", nativeQuery = true)
	String getall(int a);


}
