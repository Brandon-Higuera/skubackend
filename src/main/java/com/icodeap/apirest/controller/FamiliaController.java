package com.icodeap.apirest.controller;

import com.icodeap.apirest.FamiliaService;
import com.icodeap.apirest.model.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/familia")
public class FamiliaController {
    @Autowired
    private FamiliaService familiaService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Family> getAllFamilia(){
        return familiaService.getAllFamilia();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/familia/{clase}")
    public List<Family> searchFamiliaByClase(@PathVariable("clase") Long clase_id){
        return familiaService.getFamiliaByClase(clase_id);
    }
}
