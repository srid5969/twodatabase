package com.javadevjournal.product.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javadevjournal.product.data.ProductModel;
import com.javadevjournal.product.repo.ProductRepository;
@Service
public class ProductServiceImp implements ProductService{
	private ProductRepository productRepository;
	

	public ProductServiceImp(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<ProductModel> findAllProductModel() {
		return productRepository.findAll();
	}

	@Override
	public Optional<ProductModel> findId(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public ProductModel saveProductModel(ProductModel product) {
		return productRepository.save(product);
	}

	@Override
	public ProductModel updateProductModel(ProductModel product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProductModel(Integer id) {
		productRepository.deleteById(id);
		
	}

}
