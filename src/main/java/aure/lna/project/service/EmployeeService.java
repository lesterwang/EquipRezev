package aure.lna.project.service;

import java.util.List;

import aure.lna.project.model.Employee;

public interface EmployeeService {
    Employee findBydId(int id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

    boolean isEmployeeSsnUnique(Integer id, String ssn);
}
