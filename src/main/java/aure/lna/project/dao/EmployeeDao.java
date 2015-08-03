package aure.lna.project.dao;

import java.util.List;

import aure.lna.project.model.Employee;

public interface EmployeeDao {
    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);
}
