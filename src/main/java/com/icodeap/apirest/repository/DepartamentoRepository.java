package com.icodeap.apirest.repository;

import com.icodeap.apirest.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Department, Long> {

}
