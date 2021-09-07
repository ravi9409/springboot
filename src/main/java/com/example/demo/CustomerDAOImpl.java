package com.example.demo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/*
 * @Author : Srinivas Dande
 * @Company: Java Learning Center
 * */
@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void addCustomer(Customer cust) {
        entityManager.persist(cust);
    }
    @Override
    public List<Customer> getAllCustomers() {
        String jpaQL= "from Customer cust";
        List<Customer> mylist =
                entityManager.createQuery(jpaQL,Customer.class)
                        .getResultList();
        return mylist;
    }
    @Override
    public List<Customer> getCustomersByCity(String city) {
        String jpaQL= "from Customer cust where cust.city=?1";
        List<Customer> mylist =
                entityManager.createQuery(jpaQL,Customer.class)
                        .setParameter(1, city)
                        .getResultList();
        return mylist;
    }
}