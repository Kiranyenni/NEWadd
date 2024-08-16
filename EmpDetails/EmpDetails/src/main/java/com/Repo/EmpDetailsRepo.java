package com.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dto.EmpDetailsDto;

public interface EmpDetailsRepo extends JpaRepository<EmpDetailsDto, Integer>{

	@Query("select empname from EmpDetailsDto where id =:id")
	public String getEmpNameById(@Param("id")Integer id);
	
	@Query("select empname from EmpDetailsDto")
	public List<String> getEmpName();
	
	@Query("select mail from EmpDetailsDto")
	public List<String> getempmail();

	
}
