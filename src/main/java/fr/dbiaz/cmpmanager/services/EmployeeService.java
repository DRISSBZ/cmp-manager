package fr.dbiaz.cmpmanager.services;

import fr.dbiaz.cmpmanager.resources.EmployeeResource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<EmployeeResource> getAllEmployees() {


        List<EmployeeResource> employeeResources = new ArrayList<>();

        EmployeeResource driss = new EmployeeResource("Driss", "Biaz", "24");

        employeeResources.add(driss);

        return employeeResources;

    }
}
