#Author: CSI
Feature: Verification Menu HomePage

  Scenario Outline: Acceder à chaque menu de la page daccueil
    Given Utilisateur est connécté avec le bon username et le bon password
    When Utilisateur clique sur le "<menu>"
    Then La page menu est affiché "<menu>"

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
      | Buzz        |
