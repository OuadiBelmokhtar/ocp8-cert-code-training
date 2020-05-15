package chap02.patterns.dao;

public class Client {
	public static void main(String[] args) {
		Employee emp = new Employee();
	    emp.setId(10L); 
	    emp.setName("Harry");
	    emp.setAge(39); emp.setAddress("UK");
	    EmployeeDao employeeDao=new EmployeeDaoImpl();
	    employeeDao.create(emp);
	    
	}
}
