package jpaempproj.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import jpaempproj.model.Employees;
import jpaempproj.service.EmpDao;

@Path("/employees")
public class EmpController {
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean addEmp(Employees emp) {
		boolean flag = new EmpDao().addEmp(emp);
		return flag;
	}
	
	@GET
	@Path("/get")
	public void display() {
		System.out.println("Here");
	}
}
