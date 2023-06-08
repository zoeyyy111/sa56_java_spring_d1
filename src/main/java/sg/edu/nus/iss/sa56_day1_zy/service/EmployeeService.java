package sg.edu.nus.iss.sa56_day1_zy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
//this line autogenerated with @Services

import sg.edu.nus.iss.sa56_day1_zy.model.Employee;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("1", "Darryl", "ss"));
        employees.add(new Employee("2", "Zoey", "Yo"));
    }


    public List<Employee> getAllEmployees() {
        return this.employees;
    }

    public List<Employee> getEmployeesByLastName(String lastName) {
        List<Employee> filterEmployees= employees.stream().filter(emp->emp.getLastName().equals(lastName)).toList();

        return filterEmployees;
        
    }
    
}
