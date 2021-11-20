Feature: Corporate Gift Automate

  @CorporateGifts
  Scenario Outline: Add Corporate Gift to Cart
    Given Open URL for corporate gifts
    Then Click on Corporate Gift section
    And Add "<FullName>" "<phone>" "<email id>" in the form
    And click on Submit Button

    Examples: 
      | FullName      | phone      | email id         |
      | Bibin Prakash | 1234567890 | xyz@mindtree.com |
