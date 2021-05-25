@smoke @search
Feature: Search Function


  Scenario: verify that search function works properly
    Given the user on the OBI webpage
    Given user logs in with credentials
    When user search "rasenmäher" on the search box
    When click on the "Akku-Rasenmäher"
    Then user should be able to see "rasenmäher" related products


