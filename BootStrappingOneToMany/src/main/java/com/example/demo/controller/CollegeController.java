package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.College;
import com.example.demo.repository.CollegeRepository;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.SubjectRepository;


@RestController
public class CollegeController 
{
	@Autowired
	private CollegeRepository collegeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@PostMapping("/saveDetails")
	public College saveCollegeDetails(@RequestBody College college)
	{
		return collegeRepository.save(college);
	}
	
	@GetMapping("/fetchDetails")
	public List<College> findAllCollegeDetails()
	{
		return collegeRepository.findAll();
	}
	@DeleteMapping("/delete/{id}")
	public List<College> deleteDepartmentDeatils(@PathVariable int id)
	{
		collegeRepository.deleteById(id);
		return collegeRepository.findAll();
	}
	
	@PutMapping("/update")
	public College updateProductName(@RequestBody College college)
	{
		return collegeRepository.save(college);
	}
	
	
	
}
