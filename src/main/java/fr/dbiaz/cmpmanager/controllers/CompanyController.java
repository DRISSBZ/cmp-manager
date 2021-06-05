package fr.dbiaz.cmpmanager.controllers;

import fr.dbiaz.cmpmanager.resources.CompanyResource;
import fr.dbiaz.cmpmanager.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/companies")
    public List<CompanyResource> getAllCompanies() {
        return companyService.getAllCompanies();
    }

}
