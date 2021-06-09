package fr.dbiaz.cmpmanager.controllers;

import fr.dbiaz.cmpmanager.entities.CompanyEntity;
import fr.dbiaz.cmpmanager.services.CompanyService;
import fr.dbiaz.cmpmanager.services.impl.CompanyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping
    public List<CompanyEntity> getAllCompanies(@RequestParam(required = false, name = "name") String companyName) {
        return companyService.getAllCompanies(companyName);
    }

    @GetMapping("/{companyId}")
    public CompanyEntity getById(@PathVariable Long companyId){
        return companyService.getById(companyId);

    }

    @PostMapping
    public CompanyEntity postCompany(@RequestBody CompanyEntity companyEntity){

       return companyService.create(companyEntity);
    }
    @DeleteMapping("/{companyId}")
    public void deleteById(@PathVariable Long companyId){
         companyService.deleteById(companyId);

    }
    @PutMapping("/{companyId}")
    public CompanyEntity updateCompany(@RequestBody CompanyEntity companyEntity, @PathVariable String companyId){
        return companyService.updateById(companyEntity, companyId);
    }



}
