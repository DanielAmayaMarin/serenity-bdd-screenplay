#language:es

@historias

Característica: Funcionalidad completa de pedidos web
  Se realizará la completa validación de la plataforma pedidos web

  @escenario1

  Esquema del escenario: Inicio de sesion
    Dado que la AI ingresa a la plataforma para digitar su pedido
    Cuando aparece el login, ingresa su usuario y contrasena
      | cedulaai | contrasena  |
      | <cedulaai> | <contrasena>  |
    Entonces se valida si el ingreso fue exitoso, Existe el modal de bienvenida
      | titulomodal |
      | <titulomodal> |

    Ejemplos:
      | cedulaai | contrasena  | titulomodal |
      | 00000000000 | 000000| Datos usuario |

  @escenario2

  Esquema del escenario: Digitar Pedido
    Dado que la AI se encuentra en el modulo de Pedido a Credito
      | cedulaai | contrasena  |
      | <cedulaai> | <contrasena>  |
    Cuando ingrese los sku que desea solicitar
      | sku | cantidad |
      | <sku> | <cantidad> |
    Entonces se valida si la solicitud fue exitosa

      | titulo |
      | <titulo> |

    Ejemplos:
      |  cedulaai | contrasena | sku | cantidad | titulo |
      | 00000000000 | 000000| 3765 | 6 | Resumen del Pedido |






