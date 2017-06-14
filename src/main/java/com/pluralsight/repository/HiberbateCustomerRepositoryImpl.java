package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HiberbateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUserName}")
	private String dbUserName;
	
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	
	@Override
	public List<Customer> findAll() {
	
		System.out.println(dbUserName);
		List<Customer> customers = new ArrayList<Customer>();

		Customer cust = new Customer();
		cust.setFirstName("RAM");
		cust.setLastName("P");

		customers.add(cust);
		return customers;
	}
}
