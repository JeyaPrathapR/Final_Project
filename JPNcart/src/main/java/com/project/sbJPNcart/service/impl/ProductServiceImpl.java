package com.project.sbJPNcart.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sbJPNcart.entity.Product;
import com.project.sbJPNcart.repository.ProductRepository;
import com.project.sbJPNcart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	//inject
	
	private ProductRepository productRespository;

	public ProductServiceImpl(ProductRepository productRespository) {
		super();
		this.productRespository = productRespository;
	}


	@Override
	public List<Product> getAllProducts() {
		
		return productRespository.findAll();
	}


	@Override
	public Product saveProduct(Product product) {
		
	return productRespository.save(product);	
	}


	@Override
	public Product getProductById(Long id) {	
		return productRespository.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {
		
		return productRespository.save(product);
	}


	@Override
	public void deleteProductById(Long id) {
	productRespository.deleteById(id);
	}
	
	
}
