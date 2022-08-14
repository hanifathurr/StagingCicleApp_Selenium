@regression @blast
Feature: Blast Activities

  @BA-001
  Scenario: User can archive blast
    Given User on blast page
    When User click on archive icon on blast
    Then User successfully archived blast

  @BA-004
  Scenario: User can send comment to blast
    Given User on blast page
    When User select blast in blast list
    And User send comment in comment field
    Then User can see created comment in blast post

  @BA-011
  Scenario: User can reply comment in blast
    Given User on blast page
    When User select blast in blast list
    And User reply created comment
    Then User can see replied comment

  @BA-006
  Scenario: User can delete comment in blast
    Given User on blast page
    When User select blast in blast list
    And User delete created comment
    Then User successfully deleted comment in blast post