@regression @board @bo_001
Feature: Boards

  @regression @board @BO_001
  Scenario: User can create list in board
    Given User are in Boardpage
    When User click Add List button
    And User input Bug in Input list name column
    And User click Create button
    Then Creating list is success

  @regression @board @BO_002
  Scenario: User can Add Card in list selected
    Given User are in Boardpage
    When User click Add Card button
    And User input Cicle App in Card name column
    And User click Green Add Card button
    Then Creating card is success

  @regression @board @BO_003
  Scenario: User can't create name without fill card name
    Given User are in Boardpage
    When User click Add Card button
    And User click Green Add Card button
    Then Card name cannot be empty

  @regression @board @BO_004
  Scenario: User can set card to Private Card
    Given User are in Boardpage
    When User click Pencil icon button on Cicle App card
    And User click Private Card button
    Then Update card is success

  @regression @board @BO_005
  Scenario: User can filter board by card name
    Given User are in Boardpage
    When User click Filter button
    And User input text Cicle App in Search Cards column
    Then Showing name of the Cicle App card

  @regression @board @BO_006
  Scenario: User can Archive Card
    Given User are in Boardpage
    When User click Pencil icon button on Hide This card
    And User click Archive button on Hide This card
    Then Hide This card has been moved to archived

  @regression @board @BO_007
  Scenario: User can Archive List
    Given User are in Boardpage
    When User click Dot Option icon button on Archive List list
    And User click Archive This List button
    Then Archive List list has been moved to archived

  @regression @board @BO_008
  Scenario: User can restore Archive List
    Given User are in Boardpage
    When User click Archived Items button
    And User click Switch to lists button
    And User click Restore button
    Then Unarchiving list with cards is success

  @regression @board @BO_009
  Scenario: User can filter board by Label
    Given User are in Boardpage
    When User click Filter button
    And User click label button
    Then Showing card have been labeled

  @regression @board @BO_010
  Scenario: User can restore Archive Card
    Given User are in Boardpage
    When User click Archived Items button
    And User click Restore button
    Then Unarchiving card is success

  @regression @board @BO_011
  Scenario: User can Change Name Card
    Given User are in Boardpage
    When User click Pencil icon button on Bug card
    And User click Change Name button
    And User input text URGENT in Edit Card Name column
    And User click Save button
    Then Update card is success

  @regression @board @BO_012
  Scenario: User can Archive All Card in This List
    Given User are in Boardpage
    When User click Dot Option icon button on Tester1 list
    And User click Archive All Cards in This List button
    Then All cards on list Tester1 moved to archived

  @regression @board @BO_013
  Scenario: User can Edit Notes on Card
    Given User are in Boardpage
    When User click Pencil icon button on on URGENT card
    And User click Edit Notes button
    And User input text Fix This in Tell your story here column
    And User click Save notes button
    Then Update card is success

  @regression @board @BO_014
  Scenario: User can set as Complete List
    Given User are in Boardpage
    When User click Dot Option icon button on Tester1 list
    And User click Set as a Complete List
    Then Set list as Complete is success

  Scenario: User can Change Member on Card
    Given User are in Boardpage
    When User click Dot Option icon button on URGENT card
    And User click Change Member button
    And User click paketA2 cilsy button
    And User click Apply Member button
    Then Toggle members successful

  Scenario: User can filter board by Overdue
    Given User are in Boardpage
    When User click Filter button
    And User click Overdue button
    Then Showing overdue card

  Scenario: User can filter board by Due Soon
    Given User are in Boardpage
    When User click Filter button
    And User click Due Soon button
    Then Showing Due Soon card

  Scenario: User can filter board by Due Today
    Given User are in Boardpage
    When User click Filter button
    And User click Due Today button
    Then Showing Due Today card

  Scenario: User can attach file on Card
    Given User are in Boardpage
    When User click Pencil icon button on URGENT card
    And User click Attach Files button on URGENT card
    And User choose file
    And User clik Open
    Then Upload attachments is success

  Scenario: User can Quick Comment on Card
    Given User are in Boardpage
    When User click Dot Option icon button on URGENT card
    And User click Quick Comment button
    And User click Add new comment column
    And User input text FIX NOW in Tell your story here column
    And User click Post button
    Then Create comment is success

  Scenario: User can delete Quick Comment on Card
    Given User are in Boardpage
    When User click Dot Option icon button on URGENT card
    And User click Quick Comment button
    And User click Dot Option icon button on comment
    And User click Delete button
    And User click Delete button on pop up option
    Then Create comment is success

  Scenario: User can Edit Labels on Card
    Given User are in Boardpage
    When User click Dot Option icon button on URGENT card
    And User click Edit Labels button
    And User click label button
    And User click Apply Labels button
    Then toggle multiple labels card is success

  Scenario: User can Move Card on Card
    Given User are in Boardpage
    When User click Dot Option icon button on Quality card
    And User click Move Card button
    And User click List button
    And User click Urgent button
    And User click Move button
    Then Success!

  Scenario: User can Clean Filter on Filter
    Given User are in Boardpage
    When User click Filter button
    And User click label button
    And User click Due Today button
    Then User click Clean Filter button

  Scenario: User can Sort List by Nearest Created Date
    Given User are in Boardpage
    When User click Dot Option icon button on KIRI list
    Then User click Sort This List by Nearest Created Date button

  Scenario: User can see the content of the Card
    Given User are in Boardpage
    When User click URGENT Card
    Then Showing the content of the URGENT card

  Scenario: User can Give Cheers comment on Card
    Given User are in Boardpage
    When User click CHEERS Card
    And User click Cheers icon button
    And User input SEMANGAT on Giveem cheers column
    And User click Checklist button
    Then Create cheers on card comment successful

  Scenario: User can Add Member on Card
    Given User are in Boardpage
    When User click URGENT Card
    And User click Plus icon button
    And User click Ahmad Faris deden button
    And User click Apply Members button
    Then Toggle members successful

  Scenario: User can see Show All Member on Filter
    Given User are in Boardpage
    When User click Filter button
    Then User click Show all member button

  Scenario: User cant cannot empty List name
    Given User are in Boardpage
    When User click Add List button
    And User click Create button
    Then List name cannot be empty

  Scenario: User cant cannot empty Card name
    Given User are in Boardpage
    When User click Add Card button
    And User click Green Add Card button
    Then Card name cannot be empty