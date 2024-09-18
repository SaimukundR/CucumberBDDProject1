Feature: Searching New Cars
  
  In order to search new cars
  As a User
  I have to navigate to carwale.com

#@Toyota
  #Scenario: Finding new Cars
    #Given user navigates to the website
    #When user navigates through NewCars and FindNewCars
    #And user clicks on Toyota in NewCars section
    #Then validates the title as Toyota

  Scenario Outline: Finding new cars
    Given user navigates to carwale website
    When user mouseover to newcars
    Then user clicks on Findnewcars
    And user clicks on "<carBrand>" car
    And user validates carTitle as "<carTitle>"

    Examples: 
      | carBrand | carTitle    |
      | Toyota   | Toyota Cars |
      | Kia      | Kia Cars    |
    