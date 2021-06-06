package fr.dbiaz.cmpmanager.services;

import fr.dbiaz.cmpmanager.daos.repositories.CompanyRepository;
import fr.dbiaz.cmpmanager.entities.CompanyEntity;
import fr.dbiaz.cmpmanager.resources.CompanyResource;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {


    private final CompanyRepository companyRepository;


    public List<CompanyEntity> getAllCompanies() {
       /* List<CompanyResource> companies = new ArrayList<>();
        CompanyResource sogetiCompany = new CompanyResource("Sogeti", "0545424324", "148 avenue tztz", "Paris", "75000", "logo", "France");
        CompanyResource atosCompany = new CompanyResource("Atos", "4543543", "123 AVENUE MTMT", "Marseille", "12334", "Logo1", "Morocco");
        companies.add(sogetiCompany);
        companies.add(atosCompany);
        return companies;*/

        return companyRepository.findAll();

        //return null;
    }

}
