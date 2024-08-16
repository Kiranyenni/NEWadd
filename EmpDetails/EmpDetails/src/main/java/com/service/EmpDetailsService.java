package com.service;


import java.util.List;

import org.springframework.stereotype.Component;


import com.dto.EmpDetailsDto;

@Component
public interface EmpDetailsService {
	

	public void createEmp(EmpDetailsDto empdetailsdto);
	public void updateEmp(EmpDetailsDto empdetailsdto, int id);
	public EmpDetailsDto getId(Integer id);
	public void deleteemp ( Integer id);
	public String getEmpNameById(Integer id);
	public List<String> getEmpName();
	public List<String> getempmail();


}
