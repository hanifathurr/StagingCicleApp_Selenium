@regression @blast
Feature: Edit Blast

  @EB-001
  Scenario: User can edit blast title
    Given User on blast page
    When User click on edit icon on blast
    And User change blast title
    Then User successfully edit blast

  @EB-006
  Scenario: User can edit blast with valid manual complete date using datepicker
    Given User on blast page
    When User click on edit icon on blast
    And User set manual date to "20/08/2022"
    Then User succesfully edited blast and check the blast complete in "Aug 20"

  @EB-010
  Scenario: User can edit remove my people to notified my blast
    Given User on blast page
    When User click on edit icon on blast
    And User remove people to notified
    Then User successfully edited blast and removed member icon not appeared

  @EB-009
  Scenario: User can edit add my people to notified my blast
    Given User on blast page
    When User click on edit icon on blast
    And User add people to notified
    Then User successfully edited blast and added member icon appeared

  @EB-011
  Scenario: User can edit blast to private
    Given User on blast page
    When User click on edit icon on blast
    And User switch on private blast
    Then User successfully edited blast and lock icon appeared

  @EB-012
  Scenario: User can cancel edit blast
    Given User on blast page
    When User click on edit icon on blast
    And User click on cancel edit button
    Then User successfully canceled and back to blast information page
