package com.icodeap.apirest.controller;


import com.icodeap.apirest.ClaseService;
import com.icodeap.apirest.model.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clas")
public class ClaseController {

    @Autowired
    private ClaseService claseService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Classe> getAllClase(){
        return claseService.getAllClase();

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/clase/{departamento}")
    public List<Classe> searchClaseByDepartamento(@PathVariable("departamento") Long departamento_id){
        return claseService.getClaseByDepartamento(departamento_id);
    }

}
