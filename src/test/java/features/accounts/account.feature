Feature: Login to http://saas.spondan.com/
  As a tester
  I want to ensure Accounts feature working as expected
  So that our end user can Signup into http://saas.spondan.com/ without any issues

  Background:
    Given I am at school Home Page

  @academic @smoke @regression
  Scenario: Goto admin
    Given Click Accouts Chart Of Account Button
    When  I will check income & expense crud
