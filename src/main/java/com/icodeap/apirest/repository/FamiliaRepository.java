package com.icodeap.apirest.repository;

import com.icodeap.apirest.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamiliaRepository extends JpaRepository<Family, Long> {
    @Query(value = "select * from familia where clase_id = ?",nativeQuery = true)
    public List<Family> findByClase(Long clase_id);
}
