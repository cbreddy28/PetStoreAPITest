Feature: Find all pet by status

  As an aspiring pet owner
  I want to find some pet from this app
  So I can buy one of them

@FindPetByStatus
  Scenario: Find a pet by Status - Available
    Given I have access to pet service
    When I find pet by availability
    Then the pet is available