package com.javadevjournal.customer.service;

import java.util.List;
import java.util.Optional;

import com.javadevjournal.customer.data.CustomerModel;

public interface CustomerService {
	List<CustomerModel> findAllCustomerModel();

	Optional<CustomerModel> findId(Integer id);

	CustomerModel saveCustomerModel(CustomerModel pustomer);

	CustomerModel updateCustomerModel(CustomerModel pustomer);

	void deleteCustomerModel(Integer id);
}