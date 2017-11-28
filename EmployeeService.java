package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IEmployeeDAO;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDAO iemployeeDAO;

	@Override
	public void updateEmployee(String status,String studendGander,Integer studendAge) {
		iemployeeDAO.updateEmployee(status,studendGander,studendAge);
	}
	
	@Override
	public void deleteEmployee(Integer studendId) {
		iemployeeDAO.deleteEmployee(studendId);
	}
}