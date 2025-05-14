## Proyecto final

Desarrolla una aplicación Java que lea información sobre productos desde un fichero de texto (`productos.txt`) y cree objetos de una clase llamada `Producto`.

Cada línea del fichero contendrá la información de un producto en el siguiente formato `nombreProducto,categoria,precio,stock`. Por ejemplo:

```txt
Ratón,Informática,15.99,100
Teclado,Informática,29.95,80
Camiseta,Ropa,12.50,200
```

El programa debe ser capaz de leer todas las filas del `.txt` y crear un objeto por cada fila.

Para comprobar que la lectura de datos se ha realizado correctamente, al finalizar se imprimirán todos los objetos (mediante el método `toString()`). Por consola debería verse algo así:

```txt
Productos cargados:
Producto: Ratón | Categoría: Informática | Precio: 15.99€ | Stock: 100
Producto: Teclado | Categoría: Informática | Precio: 29.95€ | Stock: 80
...
```

Requisitos técnicos:
- Leer el fichero línea a línea mediante un `Buffered`.
- Interpretar la información leída, entendiendo que los datos están separados por `,`.
- Guardar la información en objetos, cuyos atributos se correspondan con la información leída.
- Imprimir todos los objetos creados.
- Manejar las excepciones pertinentes.
