package fr.dbiaz.cmpmanager.controllers;

import fr.dbiaz.cmpmanager.entities.CompanyEntity;
import fr.dbiaz.cmpmanager.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/companies")
    public List<CompanyEntity> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping("/companies")
    public CompanyEntity postCompany(@RequestBody CompanyEntity companyEntity){

       return companyService.create(companyEntity);
    }



}
