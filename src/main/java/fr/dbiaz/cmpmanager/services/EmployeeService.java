package fr.dbiaz.cmpmanager.services;

import fr.dbiaz.cmpmanager.entities.EmployeeEntitY;
import fr.dbiaz.cmpmanager.repository.EmployeeRepository;
import fr.dbiaz.cmpmanager.resources.EmployeeResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<EmployeeEntitY> getAllEmployees() {


       return employeeRepository.findAll();

    }
}
