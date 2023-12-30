package com.icodeap.apirest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "clase")
public class Classe {
    @Id
    private Long id;
    private Long num;
    private String name;
    private Long departamento_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Long departamento_id) {
        this.departamento_id = departamento_id;
    }
}
