Feature: Login to http://saas.spondan.com/
  As a tester
  I want to ensure Signup feature working as expected
  So that our end user can Signup into http://saas.spondan.com/ without any issues

  Background:
    Given I am at school Home Page

  @academic @smoke @regression
  Scenario: Goto admin
    Given Click academic button
    When  I will click on sections then input section and press save section
    Then  I will click on Class then input class ,select select and press save section
    Then  I will click on subject and fillup subject
    Then  I will click on assign subject and fillup subject
#    Then  I will add a student and fillup all data
