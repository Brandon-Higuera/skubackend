package com.icodeap.apirest;

import com.icodeap.apirest.model.Classe;
import com.icodeap.apirest.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class ClaseService {
    @Autowired
    private ClaseRepository claseRepository;

    public List<Classe> getAllClase(){
        return claseRepository.findAll();
    }


    public List<Classe> getClaseByDepartamento(Long departamento_id){
        return claseRepository.findByDepartamento(departamento_id);
    }

}
