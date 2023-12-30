package com.icodeap.apirest.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "SKUS")
public class Skus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int sku;
    private String article;
    private String stl_marca;
    private String model;
    private int stock;
    private int amount;
    private Long departamento_id;
    private Long clase_id;
    private Long familia_id;
    private boolean discontinued;
    @Column(name = "create_date", nullable = false, updatable = false)
    @CreationTimestamp

    private Date create_date;

    private Date finish_date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getStl_marca() {
        return stl_marca;
    }

    public void setStl_marca(String stl_marca) {
        this.stl_marca = stl_marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Long getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Long departamento_id) {
        this.departamento_id = departamento_id;
    }

    public Long getClase_id() {
        return clase_id;
    }

    public void setClase_id(Long clase_id) {
        this.clase_id = clase_id;
    }

    public Long getFamilia_id() {
        return familia_id;
    }

    public void setFamilia_id(Long familia_id) {
        this.familia_id = familia_id;
    }




    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }
}
