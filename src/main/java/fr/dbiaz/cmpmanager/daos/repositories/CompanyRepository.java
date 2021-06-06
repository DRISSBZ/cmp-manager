package fr.dbiaz.cmpmanager.daos.repositories;

import fr.dbiaz.cmpmanager.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
