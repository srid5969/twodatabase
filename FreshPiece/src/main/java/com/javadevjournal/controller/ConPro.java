package com.javadevjournal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javadevjournal.customer.data.CustomerModel;
import com.javadevjournal.customer.service.CustomerService;
import com.javadevjournal.product.data.ProductModel;
import com.javadevjournal.product.service.ProductService;

@RestController
public class ConPro {
	@Autowired
	private CustomerService customerService;

	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public List<ProductModel> findAllProductModel() {
		return productService.findAllProductModel();
	}

	@GetMapping("/customer")
	public List<CustomerModel> findAllCustomer() {
		return customerService.findAllCustomerModel();
	}

	@GetMapping("/product/{id}")
	public Optional<ProductModel> getbyPtoduct_id(@PathVariable("id") int id) {
		return productService.findId(id);
	}

	@GetMapping("/customer/{id}")
	public Optional<CustomerModel> getbyCustemer_id(@PathVariable("id") int id) {
		return customerService.findId(id);
	}

	@PostMapping("/product/post")
	public ProductModel posst(@RequestBody ProductModel product) {
		return productService.saveProductModel(product);
	}

	@PostMapping("/customer/post")
	public CustomerModel postcustomer(@RequestBody CustomerModel customer) {
		return customerService.saveCustomerModel(customer);
	}

	@DeleteMapping("/product/delete/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		productService.deleteProductModel(id);

	}

	@DeleteMapping("/customer/delete/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomerModel(id);
	}

	@PutMapping("/product/update")
	public ProductModel updateProduct(@RequestBody ProductModel product) {
		return productService.updateProductModel(product);
	}

	@PutMapping("/customer/update")
	public CustomerModel updateCustomer(@RequestBody CustomerModel customer) {
		return customerService.updateCustomerModel(customer);
	}

}
