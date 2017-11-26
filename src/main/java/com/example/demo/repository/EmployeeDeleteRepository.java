package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.EmployeeModel;

public interface EmployeeDeleteRepository extends JpaRepository<EmployeeModel, Integer> {

}
