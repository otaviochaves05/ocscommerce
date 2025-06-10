package com.devocs.ocscommerce.controllers;

import com.devocs.ocscommerce.dto.ProductDTO;
import com.devocs.ocscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public Page<ProductDTO> findAll (Pageable pageable){
        return service.findAll(pageable);
    }

    @GetMapping(value = "/{id}")
    public ProductDTO findById (@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public ProductDTO insert(@RequestBody ProductDTO dto){
        return service.insert(dto);
    }


}
