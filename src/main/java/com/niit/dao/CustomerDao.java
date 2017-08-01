package com.niit.dao;

import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.User;


public interface CustomerDao {

	public void registerCustomer(Customer customer);
	public User validateUser(String username);
	public Customer validateCustomer(String email);
	
	public Customer getCustomerByUsername(String username);
	
	public Customer getCustomerByAnswer(String answer);
	
    public void updateUser(String password ,String username);
    
	
	 
}
