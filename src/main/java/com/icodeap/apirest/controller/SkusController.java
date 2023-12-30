package com.icodeap.apirest.controller;

import com.icodeap.apirest.SkusService;
import com.icodeap.apirest.model.Skus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/skus")
public class SkusController {

    @Autowired
    private SkusService skusService;

    @PostMapping
    public Skus createSkus(@RequestBody Skus skus){
      return skusService.createskus(skus);
    }

    @GetMapping
    public List<Skus> getAllSkus(){
        return skusService.getAllSkus();

    }

    @GetMapping("{id}")
    public Skus searchSkusById(@PathVariable("id") Long id){
        return skusService.getSkusById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("{id}")
    public void deleteSkusById(@PathVariable("id") Long id){
        skusService.deleteSkus(id);
    }
    @GetMapping("/sku/{sku}")
    public Skus searchSkusBySku(@PathVariable("sku") int sku){
        return skusService.getSkusBySku(sku);

    }
    @PutMapping("{id}")
    public void  updateSkus(@PathVariable("id") Long id,@RequestBody Skus skus){
        skusService.updateSkuById(id, skus);
    }
}
