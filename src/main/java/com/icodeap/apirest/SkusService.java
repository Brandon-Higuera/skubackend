package com.icodeap.apirest;

import com.icodeap.apirest.model.Skus;
import com.icodeap.apirest.repository.Skusrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;
import java.util.Optional;



@Component

public class SkusService {
    @Autowired
    private Skusrepository skusRepository;

    public Skus createskus(Skus skus){
        return skusRepository.save(skus);
    }

    public Skus getSkusById(Long id){
        Optional<Skus> optionalSkus = skusRepository.findById(id);
        return optionalSkus.get();
    }

    public List<Skus> getAllSkus(){
        return skusRepository.findAll();
    }

    public void deleteSkus(Long id){
        skusRepository.deleteById(id);
    }
    public Skus getSkusBySku(int sku){
         return skusRepository.findBysku(sku);
    }

    public void updateSkuById(Long id ,Skus sku){
        Skus skus = skusRepository.findById(id).get();
        skus.setArticle(sku. getArticle());
        skus.setModel(sku.getModel());
        skus.setStl_marca(sku.getStl_marca());
        skus.setDepartamento_id(sku.getDepartamento_id());
        skus.setAmount(sku.getAmount());
        skus.setStock(sku.getStock());
        skus.setClase_id(sku.getClase_id());
        skus.setFamilia_id(sku.getFamilia_id());
        if (sku.getDiscontinued()){
            java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
            skus.setFinish_date(date);
        }
        else{
            java.sql.Date date = new java.sql.Date(19000101);
            skus.setFinish_date(date);
        }
        skus.setDiscontinued(sku.getDiscontinued());

        skusRepository.save(skus);


    }

}
