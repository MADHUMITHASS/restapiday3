package com.day3.day3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day3.day3.model.EmployeeModel;
import com.day3.day3.service.Employeeservice;

@RestController
public class EmployeeController {

	
	@Autowired
	Employeeservice aser;
	
	@PostMapping("/")
	public boolean add(@RequestBody EmployeeModel ee)
	{
	    return aser.saveinfo(ee)!=null;
	}
	@GetMapping("/")
	public List<EmployeeModel> show()
	{
		return aser.showinfo();
	}
	@GetMapping("/{id}")
	public Optional<EmployeeModel> oneEmployee(@PathVariable int id) {
		return aser.getEmployeeById(id);
	}
	@GetMapping("getid")
	public Optional<EmployeeModel> oneEmp(@RequestParam int id) {
		return aser.getEmployeeById(id);
	}
	

}
