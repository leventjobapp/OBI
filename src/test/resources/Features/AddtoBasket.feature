@basket
Feature: Add to Basket



   @smoke
  Scenario: Verify that user should be able to add a product into the basket
     Given the user on the OBI webpage
     Then user logs in with credentials
     Then user search "rasenmäher" on the search box
     And click on the "Akku-Rasenmäher"
     Then click on the product
     When click on the In den Warenkorb
     Then The selected product should be added to Basket