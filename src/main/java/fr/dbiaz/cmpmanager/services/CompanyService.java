package fr.dbiaz.cmpmanager.services;

import fr.dbiaz.cmpmanager.entities.CompanyEntity;

import java.util.List;

public interface CompanyService {
;
    List<CompanyEntity> getAllCompanies();
    CompanyEntity create(CompanyEntity companyEntity);
    CompanyEntity getById(Long companyId);
    void deleteById(Long companyId);

    CompanyEntity updateById(CompanyEntity companyEntity, String companyId);

}
