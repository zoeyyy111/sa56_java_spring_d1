package sg.edu.nus.iss.sa56_day1_zy.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.sa56_day1_zy.model.Employee;
import sg.edu.nus.iss.sa56_day1_zy.service.EmployeeService;

//RequestMapping
//GetMapping(Retrive list/single objects)
//PostMapping(Creat new object)
//PutMapping(Update an existing object)
//DeleteMapping(Delete a object from a list/db)

@Controller
@RequestMapping(path="/employees")

public class EmployeeController {
    
    @Autowired
    EmployeeService empSvc;
 
    // public EmployeeController(){
    //     empSvc=new EmployeeService();
    // }
    //@GetMapping
    @GetMapping(value="/list")
    public @ResponseBody List<Employee> getEmployees(){
        return empSvc.getAllEmployees();
    }

    @GetMapping(value="/filteredlist")
    public @ResponseBody List<Employee> getEmployeesByLastName(){
        return empSvc.getEmployeesByLastName("TAN");
        //HARD-CODED as we have no input yet
    }
   
}
