package com.example.Myweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Myweb.dao.Bankdao;
import com.example.Myweb.entity.Bankentity;

@Service
public class Bankservice {
	@Autowired
	Bankdao bd;

	public String postall(@RequestBody List<Bankentity> b) {
		
		return bd.postall(b);
	}

	public String getall(int a) {
		
		return bd.getall(a);
	}

}
