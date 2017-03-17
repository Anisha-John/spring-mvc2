package com.techm;

import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller

public class EmployeeController {
	
	public ArrayList<Employee> getmethod(){
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee emp1= new Employee(1001,"Joseph","Portal","P12",40000);
		Employee emp2= new Employee(1002,"Ancy","Portal","P12",40000);
		Employee emp3= new Employee(1003,"Shreya","SDP","P10",30000);
		Employee emp4= new Employee(1004,"Akhil","EAI","P23",40000);
		Employee emp5= new Employee(1005,"Steve","Portal","P12",40000);



		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		return list;

	}
	
	@RequestMapping(value="/getAllEmployees",method = RequestMethod.GET)
	public @ResponseBody String listAllEmployees() throws Exception {
		String json="Null";
	
		ArrayList<Employee> list = getmethod();
		for(Employee e:list){
			System.out.println(e.getEid());
		}
		ObjectMapper map= new ObjectMapper();
		json=map.writeValueAsString(list);

		return json;
		

			}

}
