package fr.dbiaz.cmpmanager.controllers;

import fr.dbiaz.cmpmanager.resources.CompanyResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CompanyController {
    @GetMapping("/companies")
    public List<CompanyResource> getAllCompanies() {

        List<CompanyResource> companies = new ArrayList<>();

        CompanyResource sogetiCompany= new CompanyResource("Sogeti","0545424324","148 avenue tztz","Paris","75000","logo","France");
        CompanyResource atosCompany= new CompanyResource("Atos","4543543","123 AVENUE MTMT","Marseille","12334","Logo1","Morocco");
        companies.add(sogetiCompany);
        companies.add(atosCompany);


        return companies;

    }

}
