package chap02.patterns.dao;

import java.util.Collection;

public class EmployeeDaoImpl implements EmployeeDao{
	

	@Override
	public int create(Employee e) {
		 /* connect to datastore, insert data for employee e */
		return 0;
	}

	@Override
	public Employee get(Long id) {
		/* connect to datastore, retrieve and return data for employee-id id */
		return null;
	}

	@Override
	public boolean delete(Employee e) {
		 /* connect to datastore and delete data for employee-id e.id */
		return false;
	}

	@Override
	public boolean update(Employee e) {
		/* connect to datastore and update employee data */
		return false;
	}

	@Override
	public Collection<Employee> getAll() {
		/* connect to datastore, retrieve emp data, return as Collection */
		return null;
	}

}
