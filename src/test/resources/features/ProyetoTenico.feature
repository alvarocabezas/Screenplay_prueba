# Autor: Alvaro
@stories
Feature: Technical project
  As a user, I want to enter the Utest system and register
  @scenari1
  Scenario: registration in the system
    Given that Alvaro wants to enter the user registration url
    When enter all the appropriate data for user registration on the Utest platform
    |    name      |  last_name |           email           |birth_month|birth_day|birth_year|languages|city  |code_postal|country |computer|computer_version|computer_language|password   |
    | Alvaro Israel|Cabezas Rios|aicabezas12322699@gmail.com|May        |4        |2000      |spanish  |Bogotá|111121     |Colombia|Windows |Windows 10      |Spanish          |Alvaro100@@|
    Then verify that the registration is complete


