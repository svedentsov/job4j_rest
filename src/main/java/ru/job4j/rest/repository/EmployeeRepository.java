package ru.job4j.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.rest.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
