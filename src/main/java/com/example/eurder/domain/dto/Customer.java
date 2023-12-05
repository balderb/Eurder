package com.example.eurder.domain.dto;


public class Customer {
   
   private final int CustomerId;
   private final String firstname;
   private final String lastname;
   private final String email;
   private final String address;
   private final String phoneNumber;
   
   public Customer(int customerId, String firstname, String lastname, String email, String address, String phoneNumber) {
      CustomerId = customerId;
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
      this.address = address;
      this.phoneNumber = phoneNumber;
   }
   
   public int getCustomerId() {
      return CustomerId;
   }
   
   public String getFirstname() {
      return firstname;
   }
   
   public String getLastname() {
      return lastname;
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
