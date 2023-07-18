package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public String sayHello() {
		return "Welcome To Pune ";
	}

	@GetMapping("/sevices")
	public String saySevices() {
		return "Software Developement";
	}

	@GetMapping("/address")
	public String sayAddress() {
		return "Pcmc Pune";
	}

	@GetMapping("/listalldata")
	public List<Employee> getAllData() {
		return Stream.of(new Employee(101, "Ram"), new Employee(102, "Shiv")).collect(Collectors.toList());
	}
}
