Feature: Agregar al carrito una compra en la aplicacion web de Mercado Libre

  Scenario: Añadir una compra al carrito e intentar iniciar sesion exitosamente
    Given El cliente esta ubicado en el home de la aplicacion
    And Selecciona cualquier categoria exitosamente
    And Filtra seccion por su nombre
    When El cliente esta ubicado en el producto
    And Selecciona color cantidad y agrega al carrito
    Then Se dirige a la pagina de logueo
