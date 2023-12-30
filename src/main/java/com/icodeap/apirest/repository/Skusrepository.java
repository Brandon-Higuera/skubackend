package com.icodeap.apirest.repository;

import com.icodeap.apirest.model.Skus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Skusrepository extends JpaRepository<Skus,Long>{
    @Query(value="select * from SKUS where sku = ?",nativeQuery = true)
    public Skus findBysku(int sku);


}


