package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmpDetailsDto;
import com.service.EmpDetailsService;

@RestController

public class EmpDetailsController {
	
	@Autowired
	EmpDetailsService empdetailsservice;
	@PostMapping("/createemp")
	public void createEmp(@RequestBody EmpDetailsDto empdetailsdto) {
		empdetailsservice.createEmp(empdetailsdto);
	}
	
	@PutMapping("updateemp/{id}")
	public void updateEmp(@RequestBody EmpDetailsDto empdetailsdto, @PathVariable("id") int id) {
		empdetailsservice.updateEmp(empdetailsdto, id);
	}
	
	@GetMapping("/getempbyid")
	public EmpDetailsDto readEmp(@RequestParam Integer id) {
		
		return empdetailsservice.getId(id);
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public void deleteemp (@PathVariable("id")Integer id) {
		
		empdetailsservice.deleteemp(id);
		
	}
	@GetMapping("/getempnamebyid/{id}")
	public String getEmpNameById(@PathVariable("id") Integer id) {
				return empdetailsservice.getEmpNameById(id);
	}

	@GetMapping("/getempname")
	public List<String> getEmpName() {
		return empdetailsservice.getEmpName();
	}
	@GetMapping("/getempmail")
	public List<String> getempmail() {
		return empdetailsservice.getempmail();
	}
}
