# Author: Cristian López


  Feature: Cristian will perform the automation challenge proposed by bancolombia.

    Background:
    Given Cristian enters in the link of evarlart

    Scenario Outline: Automate the proposed scenario for technical testing
      Given Cristian enter´s his "<user>" and "<password>".
      When Performs the complete flow with the 13 proposed cycles.
      Then Display the Congratulations message "<message>"

      Examples:
      |user | password | message |
      | 779568 | 10df2f32286b7120My0zLTg2NTk3Nw==30e0c83e6c29f1c3 |Felicidades, has terminado la prueba exitosamente |