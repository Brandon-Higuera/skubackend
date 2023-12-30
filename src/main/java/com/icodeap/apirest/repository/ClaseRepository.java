package com.icodeap.apirest.repository;

import com.icodeap.apirest.model.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaseRepository extends JpaRepository<Classe, Long> {
    @Query(value ="select * from clase where departamento_id = ?",nativeQuery = true)
    public List<Classe> findByDepartamento(Long departamento_id);

}
