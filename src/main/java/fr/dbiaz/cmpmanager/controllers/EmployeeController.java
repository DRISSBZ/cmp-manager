package fr.dbiaz.cmpmanager.controllers;

import fr.dbiaz.cmpmanager.resources.EmployeeResource;
import fr.dbiaz.cmpmanager.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    @GetMapping("/employees")

    public List<EmployeeResource> getAllEmployees(){

        return employeeService.getAllEmployees();


    }

}
