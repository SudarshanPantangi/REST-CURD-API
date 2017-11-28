package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class EmployeeDAO implements IEmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void updateEmployee(String status,String studendGander,Integer studendAge) {
		Query query = entityManager
				.createNativeQuery("UPDATE employee_table1 SET status = 'inactive' WHERE status= '"+status+"' and studen_Gander = '"+studendGander+"' and studen_Age = '"+studendAge+"'");
		query.executeUpdate();
	}
	
	@Override
	public void deleteEmployee(Integer studendId) {
		Query query = entityManager
				.createNativeQuery("DELETE FROM employee_table1 WHERE studen_Id= '"+studendId+"'");
		query.executeUpdate();
	}
}