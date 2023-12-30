package com.icodeap.apirest;

import com.icodeap.apirest.model.Family;
import com.icodeap.apirest.repository.FamiliaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FamiliaService {
    @Autowired
    private FamiliaRepository familiaRepository;

    public List<Family> getAllFamilia(){
        return familiaRepository.findAll();
    }
    public List<Family> getFamiliaByClase(Long clase_id){
        return familiaRepository.findByClase(clase_id);
    }


}
