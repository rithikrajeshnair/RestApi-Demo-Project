package com.credai_product_crud_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credai_product_crud_api.entity.Product;
import com.credai_product_crud_api.service.ProductService;


@RestController
@RequestMapping ("/api/product")
public class ProductController {

		@Autowired
		private ProductService productService;
		
		@PostMapping
		public ResponseEntity<Product> createProduct(@RequestBody Product product){
			Product pdt = productService.createProduct(product);
			return new ResponseEntity<>(pdt, HttpStatus.OK);
		}
		
		@GetMapping
		public ResponseEntity<List<Product>> findAllProducts(){
			List <Product> productList = productService.findAllProducts();
			return new ResponseEntity<>(productList, HttpStatus.OK);
		}
		
		@GetMapping ("/{productId}")
		public ResponseEntity<Product> findProductById(@PathVariable(value = "productId") long productId){
			Product pdt = productService.findByProductId(productId);
			return new ResponseEntity<>(pdt, HttpStatus.OK);
		}
		
		@PutMapping ("/{productId}")
		public ResponseEntity<Product> updateProduct(@PathVariable(value = "productId") long productId, @RequestBody Product product){
			Product pdt = productService.updateProduct(productId, product);
			return new ResponseEntity<>(pdt, HttpStatus.OK);
		}
		
		@DeleteMapping ("/{productId}")
		public ResponseEntity<String> deleteProduct(@PathVariable(value = "productId") long productId){
			boolean productDeleted = productService.deleteProduct(productId);
			if (productDeleted) {
				return new ResponseEntity<>("Product with "+productId+" is sucessfully deleted!!!", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Failed!!! Product with "+productId+" not found!!!", HttpStatus.NO_CONTENT);
			}
		}
}
