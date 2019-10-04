package chap2.patterns.daofactory;

public class OracleDaoFactory extends DaoFactory{

	@Override
	public EmployeeDao createEmployeeDao() {
		
		return new EmployeeDaoOracleImpl();
	}

	@Override
	public DepartmentDao createDepartmentDao() {
		
		return new DepartmentDaoOracleImpl();
	}

}
 