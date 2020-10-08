Feature: Registation

  Background:
    Given I am on the Login page
  @test2
 #vpronina+test451@cybrary.com
  Scenario: SignIn as a Manager (free user)
    When I SignIn as a manager
    Then I am on the Home Page

  @test
  Scenario: SignIn as a Student/Intern (Insider Pro user)
    When I SignIn as a student
    Then I am on the Home Page