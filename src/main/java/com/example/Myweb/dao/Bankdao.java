package com.example.Myweb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Myweb.entity.Bankentity;
import com.example.Myweb.repository.Bankrepository;

@Repository

public class Bankdao {
	@Autowired
	Bankrepository br;

	public String postall(@RequestBody List<Bankentity> b) {
		br.saveAll(b);
		return "Added successfully";
	}

	public String getall(int a) {
		return br.getall(a);
	}

}
