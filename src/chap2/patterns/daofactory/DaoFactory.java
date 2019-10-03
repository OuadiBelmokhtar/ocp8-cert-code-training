package chap2.patterns.daofactory;

public abstract class DaoFactory {

	public abstract EmployeeDao createEmployeeDao();

	public abstract DepartmentDao createDepartmentDao();

	public EmployeeDao getEmployeeDaoInstance() {
		return createEmployeeDao();
	}

	public DepartmentDao getDepartmentDaoInstance() {
		return createDepartmentDao();
	}

}
