package com.techm;

	public class Employee {

		int eid;
		String empname;
		String emp_project;
		String pid;
	
		int esalary;
		Employee(){}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getEmp_project() {
			return emp_project;
		}
		public void setEmp_project(String emp_project) {
			this.emp_project = emp_project;
		}
		
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		public int getEsalary() {
			return esalary;
		}
		public void setEsalary(int esalary) {
			this.esalary = esalary;
		}
		public Employee(int eid, String empname, String emp_project,String pid, int esalary) {
			super();
			this.eid = eid;
			this.empname = empname;
			this.emp_project = emp_project;
			this.pid = pid;
			this.esalary = esalary;
		}
		
	}



