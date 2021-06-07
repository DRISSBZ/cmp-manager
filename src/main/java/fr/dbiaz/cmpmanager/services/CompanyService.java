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
        return companyRepository.findAll();
    }

}
