### Ejercicio 3. Sistema bancario básico con clases y excepciones

Eres el encargado de desarrollar un pequeño sistema de gestión de alumnos para la secrearía de Medac.

Deberás diseñar un programa en Java que conecte con una base de datos y permita gestionar alumnos y sus notas. El sistema debe realizar operaciones básicas (CRUD) sobre los alumnos y sobre las notas de cada uno.

**Estructura de la base de datos:**

`Tabla alumnos:`
- id (INT, PRIMARY KEY, AUTO_INCREMENT)
- nombre (VARCHAR)
- apellido (VARCHAR)

`Tabla notas:`
- id (INT, PRIMARY KEY, AUTO_INCREMENT)
- id_alumno (INT, FOREIGN KEY hacia alumnos)
- asignatura (VARCHAR)
- nota (DECIMAL)

**Funcionalidades requeridas en el programa Java (se muestran en un menú):**
- Insertar nuevos alumnos.
- Listar todos los alumnos existentes.
- Insertar una nota para un alumno concreto.
- Mostrar todas las notas de un alumno dado (por su ID).
- Calcular y mostrar la media de notas de un alumno.

**Requisitos de la programación en Java:**
- Crea una clase Alumno con atributos: id, nombre, apellido.
- Crea una clase Nota con atributos: id, idAlumno, asignatura, nota.
- Usa un ArrayList<Nota> para cargar y manejar en memoria las notas de un alumno al consultarlas.
- Usa JDBC para realizar todas las consultas a la base de datos (no Hibernate).
