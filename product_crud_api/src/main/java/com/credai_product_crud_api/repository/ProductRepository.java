package com.credai_product_crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credai_product_crud_api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
