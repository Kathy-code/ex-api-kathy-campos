Feature: Validar Status en Free To Game

#  Se debe validar el status 200 e imprimir en pantalla los valores
#  de las siguientes propiedades del body de la respuesta:
#  Id y title.
  @test1
  Scenario: Validar Status 200
    Given estoy en la página de FreeToGame
    When consulto mediante los parámetros platform <platform>, category <category>
    Then el código de respuesta debe ser <statusCode>
    And imprimo en pantalla el id y el title de los juegos

#
#  Scenario: Validar Status 400
#    When consulto platform "pc", category "ss"
#    Then el código de respuesta es 400
#    And imprimo el mensaje ""
