## Bloque 3: Conexiones a Bases de Datos

Cuando desarrollamos aplicaciones en Java, en muchos casos necesitamos almacenar, consultar o modificar información de manera persistente. Si el volumen de información es elevado, necesita estar estructurado o relacionado, o no va a guardarse en local (si no en un servidor externo), será habitual conectar nuestros programas a bases de datos (como ya sabes, para datos más sencillos podemos simplemente guardarlos en ficheros txt, xml, json, etc.).

La forma tradicional de establecer esta comunicación es usando JDBC (Java Database Connectivity), una API<sup>1</sup> que permite ejecutar consultas SQL desde Java. Más adelante, para simplificar y automatizar parte de esta tarea, surgieron frameworks<sup>2</sup> como Hibernate, que permiten trabajar directamente con objetos Java sin necesidad de escribir consultas SQL de forma manual.

En la actualidad, conocer ambos enfoques es fundamental:
- JDBC para entender la base de la comunicación.
- Hibernate para programar de manera moderna, segura y eficiente.

---
### 0. Dónde guardo los datos en cada caso?

Es habitual tener dudas al principio con respecto a qué tipos de datos guardamos en memoria (variables, objetos, estructuras de datos), cuáles en ficheros y cuáles en bases de datos. Veamos una serie de ejemplos para intentar aclararlo:

| # | Ejemplo | ¿Dónde guardar? | Dato temporal en memoria | Dato persistente en disco | Justificación |
|-- |---------|------------------|---------------------------|------------------|---------------|
| 1 | Contador de intentos de login | Variable (`int`) | ✅ | ❌ | Solo se necesita mientras se ejecuta el programa. |
| 2 | Almacenar temporalmente el nombre y edad de un alumno introducidos por el usuario | Objeto (`Alumno`) | ✅ | ❌ | Datos relacionados, pero temporales. |
| 3 | Almacenar en memoria una lista de alumnos recién introducidos por consola | `ArrayList<Alumno>` | ✅ | ❌ | Conjunto de objetos gestionados en tiempo de ejecución. |
| 4 | Guardar en memoria pares DNI → nombre para validación rápida durante el programa | `HashMap<String, String>` | ✅ | ❌ | Ideal para búsquedas rápidas en memoria. |
| 5 | Configuración del programa (tema, idioma) | Fichero TXT | ❌ | ✅ | Pequeños datos que se guardan entre ejecuciones. |
| 6 | Lista de tareas con estado hecho/pendiente en una aplicación en local y sin usuarios | Fichero XML | ❌ | ✅ | Datos estructurados pero no complejos, sin necesidad de relaciones. |
| 7 | Historial que guarda en local la fecha y hora de cada acceso al programa | Fichero TXT | ❌ | ✅ | Un dato por línea, persistente pero básico. |
| 8 | Usuarios con contraseña, relacionado con más datos sobre el usuario | Base de datos | ❌ | ✅ | Requiere persistencia, control de duplicados, relaciones, consultas complejas... |
| 9 | Productos de una tienda | Base de datos | ❌ | ✅ | Relación entre productos, precios, stock, consultas complejas... |
|10 | Plataforma educativa con alumnos, cursos, profesores | Base de datos | ❌ | ✅ | Persistencia, muchos datos relacionados, consultas complejas... |

No obstante, es importante destacar que en la mayoría de ocasiones se necesitarán datos persistentes y en memoria.

> Ejemplo: en el caso 10, plataforma educativa, los datos de alumnos, profesores y cursos deberán estar guardados en una base de datos. Sin embargo, si hay una pantalla donde el profesor pueda ver su lista de alumnos, lo más probable es que se consulte a la base de datos los alumnos relacionados con ese profesor y se carguen los resultados en una estructura de datos, como un ArrayList o similar, previamente a mostrarse en la página.


---

### 1. Conexión a bases de datos con JDBC

JDBC es una API<sup>1</sup> de Java que proporciona las herramientas necesarias para:
- Conectarse a bases de datos.
- Ejecutar consultas SQL (INSERT, SELECT, UPDATE, DELETE).
- Procesar los resultados.

**Pasos para conectarse e interactuar con una bbdd en JDBC:**
1. Cargar el driver JDBC (en versiones modernas se detecta automáticamente). En función del gestor de bases de datos al que nos vayamos a conectar (MySQL, SQL Server, PostgreSQL, Oracle, etc.), deberemos instalar el driver correspondiente. Algunos están preinstalados en el IDE y solo tenemos que añadirlos, pero otros puede que tengamos que descargarlos de la página oficial.
2. Crear una conexión (`Connection`).
3. Crear y ejecutar una consulta (`Statement` o `PreparedStatement`).
4. Procesar los resultados (`ResultSet`).
5. Gestionar las excepciones.
6. Cerrar la conexión y recursos.

**Principales elementos de una conexión con bbdd:**
- `Connection`: clase que nos permite realizar la conexión con la bbdd.
- `Statement`: Permite ejecutar consultas SQL simples (más básica).
- `PreparedStatement`: Permite consultas que internamente son más seguras y eficientes.
- `ResultSet`: funciona como un cursor o puntero que va apuntando fila a fila de los resultados devueltos para poder leerlos. Su método `next()` avanza a la siguiente fila y devuelve `true` si hay más datos o `false` si no. Después, los métodos `getInt("edad")` o `getString("nombre")` leen los campos de dicha fila especificándole la columna.
- `SQLException`: excepción que indica un error relacionado con la bbdd (error en la sintaxis de la consulta, pérdida de la conexión con la bbdd, etc.).

Ejemplo:
```java
import java.sql.*;

public class MainJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/escuela";
        String user = "root";
        String password = "password";
        String sql = "SELECT id, nombre FROM alumno";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println(id + ": " + nombre);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs.close();
            stmt.close();
            conn.close();
        }
    }
}
```

---

### 2. Sistemas objeto-relacional (Hibernate)

Como ya sabes, en programación lo ideal es trabajar con Programación Orientada a Objetos. Sin embargo, las bases de datos trabajan con tablas (filas y columnas). Para conectar estos dos mundos se utilizan sistemas de mapeo objeto-relacional (ORM), que permiten asociar clases y atributos de Java con tablas y columnas de una base de datos.

Existen varios sistemas de este tipo, uno de los más conocidos es Hibernate.

Hibernate es un framework<sup>2</sup> que permite:
- Mapear (convertir) la información entre bases de datos relacionales y objetos de Java.
- Gestionar conexiones, inserciones, consultas y actualizaciones de manera automática, sin necesidad de escribir sentencias SQL manualmente.
- Reduce errores al automatizar la conversión entre objetos y registros.
- Permite trabajar con múltiples gestores de bases de datos sin cambiar el código.
- Mejora el mantenimiento y escalabilidad del código.

Conceptos clave en Hibernate:
- `@Entity`: Clase Java que representa una tabla (entidad) de la base de datos. Sus atributos se corresponden con las columnas.
- `@Id`: Identifica la clave primaria de la entidad.
- `Session`: Objeto que gestiona la conexión entre Java y la base de datos.
- `SessionFactory`: Se encarga de crear sesiones (conexiones).
- `Transaction`: Permite gestionar las transacciones (confirmar o deshacer, por ejemplo).
- Operaciones **CRUD** (crear, leer, actualizar, borrar):
    - `save()`: Inserta un nuevo objeto en la base de datos.
    - `get()`: Recupera un objeto desde la base de datos utilizando su clave primaria.
    - `update()`: Actualiza los valores de un objeto ya existente en la base de datos.
    - `delete()`: Elimina un objeto de la base de datos.

Ejemplo básico: crear una clase y definirla como entidad
```java
@Entity // Indica que esta clase se corresponde con una tabla
@Table(name = "alumno") // Nombre de la tabla en la base de datos
public class Alumno {

    @Id //Indica que este atributo será la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que será una clave primaria autoincremental
    private int id;

    private String nombre;
    private String email;

    //Getters y Setteres
}
```

Ejemplo básico: establecer conexión
```java
SessionFactory factory = new Configuration()
    .configure("hibernate.cfg.xml")  // Carga la configuración desde el archivo XML (ahí estará la dirección, usuario, contraseña, etc.).
    .addAnnotatedClass(Alumno.class) // Registra la clase mapeada
    .buildSessionFactory();

Session session = factory.getCurrentSession(); // Abre una sesión (conexión)
```

Ejemplo básico: guardar un objeto en una tabla:
```java
session.beginTransaction();
session.save(alumno); // INSERT automático en la tabla alumno
session.getTransaction().commit();
```

Ejemplo básico: leer un objeto de la tabla y crear un objeto:
```java
Alumno alumno = session.get(Alumno.class, 1); // SELECT automático donde id = 1
```

Ejemplo básico: actualizar un objeto:
```java
alumno.setEmail("nuevo@email.com");
session.beginTransaction();
session.update(alumno); // UPDATE automático de los cambios
session.getTransaction().commit();
```

Ejemplo básico: borrar un objeto:
```java
session.beginTransaction();
session.delete(alumno); // DELETE automático de la tabla
session.getTransaction().commit();
```

---

<sup>1</sup> **API**
Una API (Application Programming Interface) es un conjunto de métodos o reglas que permiten que un programa se comunique con otro módulo, componente o sistema (en este caso, con el servidor de la base de datos).

<sup>2</sup> **Framework**
Un framework es un conjunto de herramientas que proporciona una estructura base sobre la que se construyen aplicaciones. Incluye librerías (clases y métodos ya creados) y exige seguir una forma concreta de organizar el código.
