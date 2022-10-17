package com.javadevjournal.product.service;

import java.util.List;
import java.util.Optional;

import com.javadevjournal.product.data.ProductModel;

public interface ProductService {
	List<ProductModel> findAllProductModel();

	Optional<ProductModel> findId(Integer id);

	ProductModel saveProductModel(ProductModel product);

	ProductModel updateProductModel(ProductModel product);

	void deleteProductModel(Integer id);
}
