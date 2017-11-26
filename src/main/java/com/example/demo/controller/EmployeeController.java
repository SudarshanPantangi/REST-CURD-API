package com.example.demo.controller;

import java.util.ArrayList;
import javax.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeDeleteRepository;
import com.example.demo.model.EmployeeModel;
import com.example.demo.service.IEmployeeService;

@RequestMapping("/rest/employee")
@RestController
public class EmployeeController {

	private EmployeeRepository employeeRepository;

	private EmployeeDeleteRepository employeeDeleteRepository;

	List<EmployeeModel> employeeModelList = new ArrayList<EmployeeModel>();

	@Autowired
	private IEmployeeService iemployeeService;

	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	/*public EmployeeController(EmployeeDeleteRepository employeeDeleteRepository) {
		this.employeeDeleteRepository = employeeDeleteRepository;
	}*/
	
	/*public EmployeeController(EmployeeRepository employeeRepository,
			EmployeeDeleteRepository employeeDeleteRepository) {
		this.employeeRepository = employeeRepository;
		this.employeeDeleteRepository = employeeDeleteRepository;
	}*/

	@GetMapping("/findAll")
	public List<EmployeeModel> getAllNotes() {
		return employeeRepository.findAll();
	}

	@GetMapping(value = "/getByLname/{studendLname}")
	public List<EmployeeModel> getUserName(@PathVariable final String studendLname) {
		return employeeRepository.findByFname(studendLname);
	}

	@GetMapping(value = "/getBetwIds/{id1}/{id2}")
	public List<EmployeeModel> getUserName(@PathVariable final Integer id1, @PathVariable final Integer id2) {
		return employeeRepository.findBetwIds(id1, id2);
	}

	@GetMapping(value = "/getByStatusUpdate/{status}")
	public List<EmployeeModel> getByStatusUpdate(@PathVariable final String status) {
		employeeModelList = employeeRepository.findByStatus(status);
		iemployeeService.updateEmployee(status);
		return employeeModelList;
	}

	@PostMapping("/insert")
	public EmployeeModel createNote(@Valid @RequestBody EmployeeModel employeeModel) {
		return employeeRepository.save(employeeModel);
	}
	
	/*@DeleteMapping("/employeeDelete/{studendId}")
	public ResponseEntity<EmployeeModel> deleteEmployee(@PathVariable(value = "studendId") Integer studendId) {
		EmployeeModel employeeModel = employeeDeleteRepository.findOne(studendId);
		if (employeeModel == null) {
			return ResponseEntity.notFound().build();
		}
		iemployeeService.deleteEmployee(studendId);
		return ResponseEntity.ok().build();
	}*/

	@DeleteMapping("/employeeDelete/{studendId}")
	public void deleteEmployee(@PathVariable(value = "studendId") Integer studendId) {
		iemployeeService.deleteEmployee(studendId);
	}
}
