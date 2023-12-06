package com.example.eurder.domain.repository;

import com.example.eurder.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepository {
   
   private final Map<String, Customer> customers;
   
   public CustomerRepository() {
      this.customers = new HashMap<>();
      Customer seadCustomer = new Customer("John", "Doe", "john.Doe@gmail.com", "DreamSquare 5, 1711 Dreamville", "052113355");
   }
   
   public void addNewCustomer(Customer customer) {
      customers.put(customer.getCustomerId(), customer);
   }
   
   public Customer getCustomerById(String customerId) {
      return customers.get(customerId);
   }
   
   public Collection<Customer> getAllCustomers() {
      return customers.values();
   }
}
