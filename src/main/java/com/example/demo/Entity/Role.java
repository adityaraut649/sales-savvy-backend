package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Role {
  ADMIN,
  CUSTOMER;
  

  @JsonCreator
  public static Role from(String value) {
      return Role.valueOf(value.toUpperCase());
  }
}
