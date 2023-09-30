#Author: nitesh from gfg


Feature: Customer module
  I want to use this template for my feature file

  @smoke
  Scenario: verify customer creation
    Given user is on home page
    When user navigate to login page
    When user specifies the valid creadential as below
    |userid			|password			|
    |try@try.com|justcheck		|