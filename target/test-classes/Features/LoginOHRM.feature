#Author: CSI
Feature: OrangeHRM Login page

  Background: 
    Given admin is on login page

  Scenario: Login With Valid Credentials
    When admin enter correct username "Admin" and correct password "admin123"
    Then admin is directed to the home page that contains "Dashboard"

  Scenario: Login With InValid Credentials
    When admin enter incorrect username "Ad" and correct password "admin123"
    Then admin is still on login page that contains message "Invalid credentials"