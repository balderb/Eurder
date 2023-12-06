package com.example.eurder.api;

import com.example.eurder.domain.dto.CreateCustomerDTO;
import com.example.eurder.domain.dto.CustomerDTO;
import com.example.eurder.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping(path = "api/customers")
public class CustomerController {
   
   private final CustomerService customerService;
   
   public CustomerController(CustomerService customerService) {
      this.customerService = customerService;
      
   }
   
   @PostMapping(consumes = "application/json", produces = "application/json")
   @ResponseStatus(HttpStatus.CREATED)
   public CustomerDTO registerNewCustomer(@Valid @RequestBody CreateCustomerDTO createCustomerDTO) {
      return customerService.createNewCustomer(createCustomerDTO);
   }
   
}
