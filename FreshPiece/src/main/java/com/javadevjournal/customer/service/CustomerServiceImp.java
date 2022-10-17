package com.javadevjournal.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javadevjournal.customer.data.CustomerModel;
import com.javadevjournal.customer.repo.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

	public CustomerServiceImp(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	private CustomerRepository customerRepository;

	@Override
	public List<CustomerModel> findAllCustomerModel() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Optional<CustomerModel> findId(Integer id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	@Override
	public CustomerModel saveCustomerModel(CustomerModel customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public CustomerModel updateCustomerModel(CustomerModel customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerModel(Integer id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);

	}

}