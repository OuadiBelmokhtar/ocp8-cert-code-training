package chap2.patterns.daofactory;

public class Client {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Harry");
		emp.setAge(39);
		emp.setAddress("UK");
		// Create an Employee in Oracle DS
		DaoFactory factory = new OracleDaoFactory();
		EmployeeDao employeeDao = factory.getEmployeeDaoInstance();
		employeeDao.create(emp);

	}
}
