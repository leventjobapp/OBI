@login @smoke
Feature: Login Functionality

    Background:
      Given the user on the OBI webpage

    Scenario:Verify that user should be able to login with valid credential
      When user logs in with credentials
      Then Url ends with "customer-account"

    Scenario:Verify that user shouldn't be able to login with invalid credential
      When user logs in with invalid credentials
      Then Url ends with "login?failed=true"