package com.example.eurder.domain;

import java.util.Objects;

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
   
   @Override
   public String toString() {
      return "Customer{" + "CustomerId=" + CustomerId + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", email='" + email + '\'' + ", address='" + address + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
   }
   
   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      Customer customer = (Customer) o;
      return CustomerId == customer.CustomerId && Objects.equals(firstname, customer.firstname) && Objects.equals(lastname, customer.lastname) && Objects.equals(email, customer.email) && Objects.equals(address, customer.address) && Objects.equals(phoneNumber, customer.phoneNumber);
   }
   
   @Override
   public int hashCode() {
      return Objects.hash(CustomerId);
   }
}
