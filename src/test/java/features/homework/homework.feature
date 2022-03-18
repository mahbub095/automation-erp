Feature: Login to school.test
  As a tester
  I want to ensure Signup feature working as expected
  So that our end user can Signup into school.test without any issues

  Background:
    Given I am at school Home Page

  @login @smoke @regression
  Scenario: Verify username & password
    Given click to login button
    When I will click Homework & fillup homework
