package com.icodeap.apirest;

import com.icodeap.apirest.model.Department;
import com.icodeap.apirest.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Department> getAllDepartamento(){
        return departamentoRepository.findAll();
    }
}
