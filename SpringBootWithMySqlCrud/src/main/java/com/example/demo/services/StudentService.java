package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo studentRepo;

}
