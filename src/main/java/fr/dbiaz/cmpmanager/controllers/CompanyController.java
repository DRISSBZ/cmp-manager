package fr.dbiaz.cmpmanager.controllers;

import fr.dbiaz.cmpmanager.entities.CompanyEntity;
import fr.dbiaz.cmpmanager.services.CompanyService;
import fr.dbiaz.cmpmanager.services.impl.CompanyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/companies")
    public List<CompanyEntity> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("companies/{companyId}")
    public CompanyEntity getById(@PathVariable Long companyId){
        return companyService.getById(companyId);

    }

    @PostMapping("/companies")
    public CompanyEntity postCompany(@RequestBody CompanyEntity companyEntity){

       return companyService.create(companyEntity);
    }
    @DeleteMapping("/companies/{companyId}")
    public void deleteById(@PathVariable Long companyId){
         companyService.deleteById(companyId);

    }
    @PutMapping("/companies/{companyId}")
    public CompanyEntity updateCompany(@RequestBody CompanyEntity companyEntity, @PathVariable String companyId){
        return companyService.updateById(companyEntity, companyId);
    }



}
