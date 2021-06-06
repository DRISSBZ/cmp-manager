package fr.dbiaz.cmpmanager.repository;

import fr.dbiaz.cmpmanager.entities.EmployeeEntitY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntitY,Long> {


}
