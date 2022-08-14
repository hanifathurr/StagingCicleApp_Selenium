@regression @blast
Feature: Create blast

  @CB-001
  Scenario: User can create blast with auto completed mode in one day
    Given User on blast page
    When User click on create blast page
    And User fill all field with valid format
    And User set blast complete as autocomplete and date as oneday
    Then User succesfully created blast and check the blast complete in one day

  @CB-002
  Scenario: User can create blast with auto completed mode in three days
    Given User on blast page
    When User click on create blast page
    And User fill all field with valid format
    And User set blast complete as autocomplete and date as three days
    Then User succesfully created blast and check the blast complete in three days

  @CB-003
  Scenario: User can create blast with auto completed mode in seven days
    Given User on blast page
    When User click on create blast page
    And User fill all field with valid format
    And User set blast complete as autocomplete and date as seven days
    Then User succesfully created blast and check the blast complete in seven days

  @CB-005
  Scenario: User can create blast with manual complete date
    Given User on blast page
    When User click on create blast page
    And User fill all field with valid format
    And User set blast complete with manual date "2022/08/20"
    Then User succesfully created blast and check the blast complete in "Aug 20"

  @CB-007
  Scenario: User cant input manual complete date with letters
    Given User on blast page
    When User click on create blast page
    And User fill all field with valid format
    And User set blast complete with manual date "satu agustus"
    Then User failed to create blast

  @CB-008
  Scenario: User cant create blast with leaving title field empty
    Given User on blast page
    When User click on create blast page
    And User leave title field empty
    And User fill other field with valid format
    Then User can see error message

  @CB-012
  Scenario: User can cancel create blast
    Given User on blast page
    When User click on create blast page
    And User click on cancel button
    Then User successfully canceled and back to blast page