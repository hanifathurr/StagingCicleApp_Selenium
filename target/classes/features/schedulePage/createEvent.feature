#Feature: Create Event
#
#  Scenario Outline: I want to create event schedule
#    Given I at schedule page
#    And I choose date
#    When I create <event> schedule
#    Then I can see my event in calender
#
#    Examples:
#      | event          |
#      | Dont repeat    |
#      | Every day      |
#      | Every week     |
#      | Every quarter  |
#      | Every year     |
#      | Every weekdays |
#      | Every month    |
#
#  Scenario: I want to tag my event with selected teams only
#    Given I at schedule page
#    When I tag my teams
#    Then Tagged teams can show event
#
#  Scenario: I want to cancel creating event
#    Given I at schedule page
#    When I cancel creating event
#    Then My event not added to calendar
#
#  Scenario: I cant create event without filling event title
#    Given I at schedule page
#    When I not filling event title
#    Then I cant create event
#
#  Scenario: I cant create event if i enter end datetime < than start datetime
#    Given I at schedule page
#    When I enter end datetime < start datetime
#    Then I cant create event
#
#  Scenario : I want to set my event for private only
#    Given I at schedule page
#    When I set my event to private
#    Then My event should be private
#
#  Scenario: I want to add member to my event
#    Given I at schedule page
#    When I added member to event
#    Then I successfully added member to event
#
#  Scenario: I want to remove member from my event
#    Given I at schedule page
#    When I remove member from event
#    Then Removed member not on my event anymore
#
#  Scenario: I want to search member for my event
#    Given I at schedule page
#    When I search valid member
#    Then I should see member that i searched
#
#  Scenario: I want to select all member
#    Given I at schedule page
#    When I select all member
#    Then I check all member on my event
#
#  Scenario: I want to deselect all member
#    Given I at schedule page
#    When I deselect all member
#    Then I uncheck all member on my event
