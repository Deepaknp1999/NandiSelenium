@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
Background:
Given Validate the browser
When Browser is opened
Then Check the browser is started

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    When I complete action
    Then I validate the outcomes

@login1
Scenario: User is not able to login with the invalid credentials
Given User launched the login page
When User logged into tghe application with username"deepak" and password"dp28"
Then Home page is not displayed


@login2
Scenario: User is not able to login with the invalid credentials
Given User launched the login page
When User logged into tghe application with username"deepaknp" and password"M416"
Then Home page is not displayed
And Home page component displayed
And Home page components are displayed

@Login3  @MobileTest
  Scenario: User is  not able login with the invalid credentials
    Given User launched the login page
    When User logged into the application with different credentials
     | deepak  | dp28 | India  |
     | shivu  | sleeping | Bangalore  |
    Then Home page is not displayed 
    
    @Login4
  Scenario Outline: User is  not able login with the invalid credentials
    Given User launched the login page
    When User logged into the application with username <username> and password <password>
    Then Home page is not displayed
    And Home page is displayed "false"
    
     Examples: 
      | username  | password |
      | Deepak |   Male |
      | Hanmanth |    Male |
      | Shivu |    Male |
      | Akshata |    Female |
      | Divya |    Female | 
      
   