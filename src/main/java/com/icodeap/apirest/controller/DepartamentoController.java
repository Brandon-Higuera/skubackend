package com.icodeap.apirest.controller;

import com.icodeap.apirest.DepartamentoService;
import com.icodeap.apirest.model.Department;
import com.icodeap.apirest.model.Skus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Department> getAllDepartamento(){
        return departamentoService.getAllDepartamento();

    }





}
