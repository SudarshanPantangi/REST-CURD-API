package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, String> {

	@Query("select c from EmployeeModel c where c.studendLname = :studendLname")
	List<EmployeeModel> findByFname(@Param("studendLname") String studendLname);
	
	@Query("select c from EmployeeModel c where (c.status = :status and c.studendGander= :studendGander and c.studendAge= :studendAge)")
	List<EmployeeModel> findByStatus(@Param("status") String status,@Param("studendGander") String studendGander,@Param("studendAge") Integer studendAge);
	
	@Query("select c from EmployeeModel c where c.id BETWEEN :id1 AND :id2")
	List<EmployeeModel> findBetwIds(@Param("id1") Integer id1,@Param("id2") Integer id2);
}
