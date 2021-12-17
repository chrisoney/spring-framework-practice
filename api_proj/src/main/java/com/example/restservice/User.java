package com.example.restservice;

public class User {
  private final long id;
  private final String firstName;
  private final String lastName;

  public User(long id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public long getId() {
    return id;
  }

  public String getFullName() {
    return this.firstname + " " + this.lastName;
  }
}