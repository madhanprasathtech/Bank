package com.example.Myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Myweb.entity.Bankentity;
import com.example.Myweb.service.Bankservice;

@RestController
@RequestMapping(value="/api")
public class Bankcontroller {
	@Autowired
	Bankservice bs;
	
	@PostMapping("/postall")
	public String posta(@RequestBody List<Bankentity> b) {
		return bs.postall(b);
	}
	
	@GetMapping("/getall/{a}")
	public String get(@PathVariable int a){
		return bs.getall(a);
	}
}
