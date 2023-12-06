package com.example.eurder.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CreateCustomerDTO {
   
   @NotNull
   @NotEmpty
   private final String firstName;
   @NotNull
   @NotEmpty
   private final String lastName;
   @NotNull
   @NotEmpty
   @Email
   private final String email;
   @NotNull
   @NotEmpty
   private final String address;
   @NotNull
   @NotEmpty
   private final String phoneNumber;
   
   public CreateCustomerDTO(String firstName, String lastName, String email, String address, String phoneNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.address = address;
      this.phoneNumber = phoneNumber;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public String getEmail() {
      return email;
   }
   
   public String getAddress() {
      return address;
   }
   
   public String getPhoneNumber() {
      return phoneNumber;
   }
}
