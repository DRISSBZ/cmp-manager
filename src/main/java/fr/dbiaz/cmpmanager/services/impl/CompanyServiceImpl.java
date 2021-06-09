package fr.dbiaz.cmpmanager.services.impl;

import fr.dbiaz.cmpmanager.daos.repositories.CompanyRepository;
import fr.dbiaz.cmpmanager.entities.CompanyEntity;
import fr.dbiaz.cmpmanager.resources.CompanyResource;
import fr.dbiaz.cmpmanager.services.CompanyService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {


    private final CompanyRepository companyRepository;


    public List<CompanyEntity> getAllCompanies(String companyName) {
        return companyRepository.findAll();
    }



    public CompanyEntity create(CompanyEntity companyEntity) {
        return companyRepository.save(companyEntity);
    }

    public CompanyEntity getById(Long companyId) {
        Optional<CompanyEntity> optionalCompanyEntity= companyRepository.findById(companyId);
        if (optionalCompanyEntity.isPresent()) {
            return optionalCompanyEntity.get();
        }else{
            throw  new RuntimeException("9awdiiiiiiii");
        }
    }

    public void deleteById(Long companyId) {
         companyRepository.deleteById(companyId);
    }

    @Override
    public CompanyEntity updateById(CompanyEntity companyEntity, String companyId) {
        Optional<CompanyEntity> optionalCompanyEntity = companyRepository.findById(companyEntity.getId());

        if(companyEntity.getId().equals(Long.parseLong(companyId))){
            if(optionalCompanyEntity.isPresent()){
                return companyRepository.save(companyEntity);
            }else{
                throw new RuntimeException("Sir t9ewed");
            }
        }else{
            throw new RuntimeException("Sir tfela 3la Mek");
        }


    }
}
