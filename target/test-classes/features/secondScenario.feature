Feature:Dicount

  @useCase2
  Scenario: DiscountCheck
    Given User is at the main page
    When User navigated to popular items section
    And Check number of items with discount
    Then Verify that final price after discount is correct
