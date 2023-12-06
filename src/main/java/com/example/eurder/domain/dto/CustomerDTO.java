package com.example.eurder.domain.dto;

import java.util.Objects;

public class CustomerDTO {
   private final String CustomerId;
   private final String firstname;
   private final String lastname;
   private final String email;
   private final String address;
   private final String phoneNumber;
   
   public CustomerDTO(String customerId, String firstname, String lastname, String email, String address, String phoneNumber) {
      CustomerId = customerId;
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
      this.address = address;
      this.phoneNumber = phoneNumber;
   }
   
   public String getCustomerId() {
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
      return "CustomerDTO{" + "CustomerId='" + CustomerId + '\'' + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", email='" + email + '\'' + ", address='" + address + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
   }
   
   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      CustomerDTO that = (CustomerDTO) o;
      return Objects.equals(CustomerId, that.CustomerId) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(phoneNumber, that.phoneNumber);
   }
   
   @Override
   public int hashCode() {
      return Objects.hash(CustomerId);
   }
   
}
