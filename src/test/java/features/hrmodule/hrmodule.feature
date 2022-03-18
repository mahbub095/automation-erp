Feature: Login to school.test
  As a tester
  I want to ensure Signup feature working as expected
  So that our end user can Signup into wpecom.test without any issues

  Background:
    Given I am at school Home Page

  @login @smoke @regression
  Scenario: Verify username & password
    Given goto login button
    When I will click human resource & fillup designation
    When I will click fillup department
    When I will fillup staff


