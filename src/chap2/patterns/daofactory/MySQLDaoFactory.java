package chap2.patterns.daofactory;

public class MySQLDaoFactory extends DaoFactory {

	@Override
	public EmployeeDao createEmployeeDao() {
		return new EmployeeDaoMySQLImpl();
	}

	@Override
	public DepartmentDao createDepartmentDao() {
		return new DepartmentDaoMySQLImpl();
	}

	

}
