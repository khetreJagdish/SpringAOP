package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/EmployeeController")
public class EmployeeRestController {

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public String getEmployeeByID(@PathVariable("id") int id) {
		return "From getEmployeeByID " + id;
	}

}
