package com.example.eurder.domain.repository;

import com.example.eurder.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
   
   private final List<Customer> customers;
   
   public CustomerRepository() {
      customers = new ArrayList<>();
      customers.add(new Customer("John", "Doe", "john.Doe@gmail.com", "DreamSquare 5, 1711 Dreamville", "052113355"));
   }
   
   public void addNewCustomer(Customer customer) {
      customers.add(customer);
   }
}
