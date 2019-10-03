package chap2.patterns.daofactory;

import java.sql.Connection;
import java.util.Collection;

public interface EmployeeDao {
	int create(Employee e);

	Employee get(Long id);

	boolean delete(Employee e);

	boolean update(Employee e);

	Collection<Employee> getAll();
}
