
Feature:AddProduct

  @useCase1
  Scenario: Adding_Lowest_Price_Product
    Given User is at the main page
    When User navigated to popular items section
    And Add lowest price product
    Then Navigated to cart page
    And Screenshot has been taken 
    Then Verify that product has been added successfully


