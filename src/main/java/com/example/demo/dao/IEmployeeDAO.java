package com.example.demo.dao;

public interface IEmployeeDAO {

	public void updateEmployee(String status,String studendGander,Integer studendAge);
	
	public void deleteEmployee(Integer studendId);
}