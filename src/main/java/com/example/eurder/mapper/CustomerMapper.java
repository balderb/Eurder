package com.example.eurder.mapper;

import com.example.eurder.domain.Customer;
import com.example.eurder.domain.dto.CreateCustomerDTO;
import com.example.eurder.domain.dto.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
   public CustomerDTO mapCustomerToCustomerDTO(Customer customer) {
      return new CustomerDTO(customer.getCustomerId(), customer.getFirstname(), customer.getLastname(), customer.getEmail(), customer.getAddress(), customer.getPhoneNumber());
   }
   
   public Customer mapCustomerDTOToCustomer(CreateCustomerDTO createCustomerDTO) {
      return new Customer(createCustomerDTO.getFirstName(), createCustomerDTO.getLastName(), createCustomerDTO.getEmail(), createCustomerDTO.getAddress(), createCustomerDTO.getPhoneNumber());
   }
   
}
