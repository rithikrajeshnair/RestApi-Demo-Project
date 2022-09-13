package com.credai_product_crud_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credai_product_crud_api.entity.Product;
import com.credai_product_crud_api.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		// TODO To add new Product
		Product pdt = productRepository.save(product);
		return pdt;
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO TO retrieve all product details
		List<Product> productList = new ArrayList<Product>(); 
		productList = productRepository.findAll();
		return productList;
	}

	@Override
	public Product findByProductId(long productId) {
		// TODO To retrieve product details using product Id
		Product pdt = (productRepository.findById(productId)).get();
		return pdt;
	}

	@Override
	public Product updateProduct(long productId, Product product) {
		// TODO To update product details using product Id
		Optional<Product> pdtDB = productRepository.findById(productId);
		if(pdtDB.isPresent()) {
			Product pdt = pdtDB.get();
			pdt.setName(product.getName());
			pdt.setCost(product.getCost());
			pdt.setSupplier(product.getSupplier());
			return productRepository.save(pdt);	
		}
		return null;
	}

	@Override
	public boolean deleteProduct(long productId) {
		// TODO To delete product using product ID\
		Optional<Product> pdtDb = productRepository.findById(productId);
		if (pdtDb.isPresent()) {
			productRepository.deleteById(productId);
			return true;
		}
		return false;
	}

}
