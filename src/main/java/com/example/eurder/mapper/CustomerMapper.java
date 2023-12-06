package com.example.eurder.mapper;

import com.example.eurder.domain.Customer;
import com.example.eurder.domain.dto.CustomerDTO;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
   public CustomerDTO mapCustomerToCustomerDTO(Customer customer) {
      return new CustomerDTO(customer.getCustomerId(), customer.getFirstname(), customer.getLastname(), customer.getEmail(), customer.getAddress(), customer.getPhoneNumber());
   }
   
   public Customer mapCustomerDTOToCustomer(CustomerDTO customerDTO) {
      return new Customer(customerDTO.getFirstname(), customerDTO.getLastname(), customerDTO.getEmail(), customerDTO.getAddress(), customerDTO.getPhoneNumber());
   }
   
}
