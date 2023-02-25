Feature: US1001 User making the test in the Trendyol

  Scenario: TC01 User search a I phone in Trendyol

    Given User go to Trendyol homepage
    Then write the I phone in Trendyol search box and make a search
    And tests that search results include iPhone
    Then Close the page


