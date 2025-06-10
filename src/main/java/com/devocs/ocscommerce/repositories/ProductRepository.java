package com.devocs.ocscommerce.repositories;

import com.devocs.ocscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}