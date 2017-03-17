package com.techm;

import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techm.Employee;
import com.techm.EmployeeController;

@Controller
public class IdController {
	EmployeeController ec = new EmployeeController();

@RequestMapping(value="/getAllEmployees/{empid}",method = RequestMethod.GET) 
public @ResponseBody String empdetail(@PathVariable int empid) throws Exception{
System.out.print(empid);
String json="id not available";
ObjectMapper map= new ObjectMapper();
ArrayList<Employee> elist = ec.getmethod();
	for(Employee employee  : elist) {
		if( empid == employee.getEid())
			{	System.out.println("checked and same");
			json= map.writeValueAsString(employee);
			}

		}		
	return json;
	}
}
