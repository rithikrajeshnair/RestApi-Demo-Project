package com.credai_product_crud_api.service;

import java.util.List;

import com.credai_product_crud_api.entity.Product;

public interface ProductService {
	public Product createProduct(Product product);
	public List<Product> findAllProducts();
	public Product findByProductId(long productId);
	public Product updateProduct(long productId, Product product);
	public boolean deleteProduct(long productId);

}
