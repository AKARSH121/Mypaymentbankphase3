package com.Akarsh.mypaymentapp.repo;

import java.sql.SQLException;

import com.Akarsh.mypaymentapp.beans.Customer;

public interface WalletRepo {

public boolean save(Customer customer);
	public Customer findOne(String mobileNo);
	
	
}
