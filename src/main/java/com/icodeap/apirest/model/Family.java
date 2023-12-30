package com.icodeap.apirest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "familia")

public class Family {
    @Id
    private Long id;
    private Long num;
    private String name;
    private Long  clase_id;

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

    public Long getClase_id() {
        return clase_id;
    }

    public void setClase_id(Long clase_id) {
        this.clase_id = clase_id;
    }
}
