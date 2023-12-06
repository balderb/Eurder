package com.example.eurder.domain;

import jakarta.validation.constraints.Email;

import java.util.Objects;
import java.util.UUID;

public class Customer {
   
   private final String customerId;
   private final String firstname;
   private final String lastname;
   @Email
   private final String email;
   private final String address;
   private final String phoneNumber;
   private static int customerCount = 0;
   
   public Customer(String firstname, String lastname, String email, String address, String phoneNumber) {
      this.customerId = UUID.randomUUID().toString();
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.customerCount = ++customerCount;
   }
   
   public String getCustomerId() {
      return customerId;
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
   
   public static int getCustomerCount() {
      return customerCount;
   }
   
   @Override
   public String toString() {
      return "Customer{" + "CustomerId='" + customerId + '\'' + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", email='" + email + '\'' + ", address='" + address + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
   }
   
   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      Customer customer = (Customer) o;
      return Objects.equals(customerId, customer.customerId) && Objects.equals(firstname, customer.firstname) && Objects.equals(lastname, customer.lastname) && Objects.equals(email, customer.email) && Objects.equals(address, customer.address) && Objects.equals(phoneNumber, customer.phoneNumber);
   }
   
   @Override
   public int hashCode() {
      return Objects.hash(customerId);
   }
}
