Feature: Login to http://spn4.spondan.com/
  As a tester
  I want to ensure Signup feature working as expected
  So that our end user can Signup into http://spn4.spondan.com/ without any issues

  Background:
    Given I am at school Home Page

  @academic @smoke @regression
  Scenario: Goto admin
    Given  Setup admin & create referenc source purpose
    When  I fillup addmission query form
    When  I fillup Complaint query form
    When  I fillup Postal Receive form
    When  I fillup Postal Dispatch form

