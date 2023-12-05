package com.example.eurder.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(path = "api/customers")
public class CustomerController {
   
   public CustomerController() {
   
   }
   
   
}
