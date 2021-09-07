package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * @Author : Srinivas Dande
 * @Company: Java Learning Center
 * */
@SpringBootApplication
public class MyBootApplication implements CommandLineRunner {
    @Autowired
    CustomerDAO custDAO;
    public static void main(String[] args) {
        SpringApplication.run(MyBootApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
// 1.Add the Customer
        Customer cust = new Customer("sri", "sri@jlc", 55555, "Blore");
        custDAO.addCustomer(cust);
        // 2.get All Customers
        List<Customer> mylist1 = custDAO.getAllCustomers();
        mylist1.forEach(mycust -> System.out.println(mycust));
        System.out.println("-----------");
// 3.Get Customers By City
        List<Customer> mylist2 = custDAO.getCustomersByCity("Blore");
        mylist2.forEach(mycust -> System.out.println(mycust));
        System.out.println("Done!!!");
    }
}