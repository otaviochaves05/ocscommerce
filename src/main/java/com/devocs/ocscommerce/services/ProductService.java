package com.devocs.ocscommerce.services;

import com.devocs.ocscommerce.dto.ProductDTO;
import com.devocs.ocscommerce.entities.Product;
import com.devocs.ocscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> response = repository.findById(id);
        Product product = response.get();
        return new ProductDTO(product);
    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> response = repository.findAll(pageable);
        return response.map(ProductDTO::new);
    }



}
