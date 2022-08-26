package ru.job4j.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.job4j.rest.exception.InvalidEmployeeException;
import ru.job4j.rest.model.Employee;
import ru.job4j.rest.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public void checkId(int id) throws InvalidEmployeeException {
        if (!employeeRepository.existsById(id)) {
            throw new InvalidEmployeeException("Invalid employee id");
        }
    }
}
