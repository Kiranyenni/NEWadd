package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repo.EmpDetailsRepo;
import com.dto.EmpDetailsDto;
@Service
public class EmpDetailServiceImp implements EmpDetailsService {
	
	@Autowired
	EmpDetailsRepo repo;
	public void createEmp(EmpDetailsDto empdetailsdto) {
		
		repo.save(empdetailsdto);
		
	}
	
	public void updateEmp(EmpDetailsDto empdetailinput, int id) {
		
			Optional<EmpDetailsDto>	obj =repo.findById(id);
			EmpDetailsDto input = obj.get();
			input.setEmpname(empdetailinput.getEmpname());
			repo.save(input);
		
	}

	public EmpDetailsDto getId(Integer id) {
		
		EmpDetailsDto empdetailsdto = new EmpDetailsDto();
		Optional<EmpDetailsDto>	obj = repo.findById(id);
		
		if (obj.isPresent()) {
			empdetailsdto = obj.get();
		}

		return empdetailsdto;
	
		
	}
	public void deleteemp ( Integer id) {
		
		repo.deleteById(id);
		
	}

	
	public String getEmpNameById(Integer id) {
		return repo.getEmpNameById(id);
		
	}

	
	public List<String> getEmpName() {
		// TODO Auto-generated method stub
		
		return repo.getEmpName();
	}
	
	public List<String> getempmail(){
		return repo.getempmail();
		
	}
	

}
