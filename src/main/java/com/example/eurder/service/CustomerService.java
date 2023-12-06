package com.example.eurder.service;

import com.example.eurder.domain.Customer;
import com.example.eurder.domain.dto.CreateCustomerDTO;
import com.example.eurder.domain.dto.CustomerDTO;
import com.example.eurder.domain.repository.CustomerRepository;
import com.example.eurder.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
   private final CustomerRepository customerRepository;
   private final CustomerMapper customerMapper;
   
   public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
      this.customerRepository = customerRepository;
      this.customerMapper = customerMapper;
   }
   
   public CustomerDTO createNewCustomer (CreateCustomerDTO createCustomerDTO) {
     Customer customer = customerMapper.mapCustomerDTOToCustomer(createCustomerDTO);
     customerRepository.addNewCustomer(customer);
     return customerMapper.mapCustomerToCustomerDTO(customer);
   }
   
   public List<CustomerDTO> getAllCustomers() {
      return customerRepository.getAllCustomers().stream()
              .map(customerMapper::mapCustomerToCustomerDTO)
              .collect(Collectors.toList());
   }
   
}
