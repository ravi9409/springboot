package com.example.demo;

import java.util.List;
/*
 * @Author : Srinivas Dande
 * @Company: Java Learning Center
 * */
public interface CustomerDAO {
    public void addCustomer(Customer cust);
    public List<Customer> getAllCustomers();
    public List<Customer> getCustomersByCity(String city);
}