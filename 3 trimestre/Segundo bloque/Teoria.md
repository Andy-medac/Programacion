# 📂 Flujos y Ficheros en Java

En el desarrollo de aplicaciones reales, rara vez trabajamos solo con datos introducidos por el usuario durante la ejecución. Muchas veces es necesario guardar información para usarla más adelante (como resultados, configuraciones, listas de usuarios o registros), o bien leer datos almacenados previamente para procesarlos. Para ello, los programas deben poder acceder a ficheros del sistema, leer y escribir información en ellos, e incluso comunicarse con otros dispositivos mediante flujos de datos. Dominar estas operaciones es fundamental para crear programas útiles, persistentes y conectados con el entorno.

### 1. La clase File para gestionar ficheros

Antes de leer o escribir datos en ficheros, es importante conocer la clase `File` de Java. Esta clase no permite acceder directamente al contenido del archivo, pero sí proporciona **métodos para trabajar con el archivo como objeto del sistema de ficheros**.

Con `File` podemos:
- Comprobar si un archivo existe y obtener información del archivo (nombre, ruta, tamaño, etc., pero no su contenido).
```java
File fichero = new File("datos.txt");
if (fichero.exists()) {
    System.out.println("El archivo existe.");
    System.out.println("Nombre: " + fichero.getName());
    System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
    System.out.println("Tamaño: " + fichero.length() + " bytes");
} else {
    System.out.println("El archivo no existe.");
}
```
- Crear nuevos archivos.
```java
File fichero = new File("datos.txt");
try {
    if (fichero.createNewFile()) {
        System.out.println("Archivo creado correctamente.");
    } else {
        System.out.println("No se pudo crear (ya existe).");
    }
} catch (IOException e) {
    System.out.println("Error al crear el archivo: " + e.getMessage());
}
```
- Crear una carpeta:
```java
File carpeta = new File("documentos");
if (!carpeta.exists()) {
    carpeta.mkdir();
}
//Cuidado: mkdir() intentará crear la carpeta, y devuelve true o false en función de si la ha conseguido crear o no, por lo que podríamos ejecutarlo en un if para tener constancia. Si no consigue crearla, no lanza excepción.
```
- Listar archivos de una carpeta:
```java
File carpeta = new File("documentos");
if (carpeta.exists() && carpeta.isDirectory()) {
    File[] archivos = carpeta.listFiles();
    System.out.println("Contenido de la carpeta:");
    for (File archivo : archivos) {
        System.out.println("- " + archivo.getName());
    }
}
```

La clase File es especialmente útil para verificar que un archivo existe antes de abrirlo, o para crear archivos y carpetas en tiempo de ejecución. La usaremos para este tipo de operaciones, pero para leer o guardar el contenido de los archivos deberemos crear flujos de datos, como vamos a ver a continuación.

### 2. Lectura y escritura de datos

Un **flujo** es un canal de comunicación por el que circulan datos desde una fuente hacia un destino. Java clasifica los flujos en dos tipos principales:

- **Flujos de entrada (Input)**: para leer datos desde una fuente (como un fichero).
- **Flujos de salida (Output)**: para escribir datos hacia un destino (como un fichero).

Los flujos de entrada y salida pueden manejar los datos en distintos formatos, lo cual implica que tengamos flujos de bytes y flujos de caracteres:

#### Flujos de bytes
- Manejan **datos binarios crudos** (imágenes, vídeos, ficheros comprimidos...).
- Cada byte se procesa tal cual.
- Clases más usadas:
  - `FileInputStream`: para leer bytes de un fichero.
  - `FileOutputStream`: para escribir bytes en un fichero.

#### Flujos de caracteres
- Manejan **datos de texto** (caracteres Unicode).
- Convertidos automáticamente desde bytes.
- Clases más usadas:
  - `FileReader`: para leer caracteres de un fichero.
  - `FileWriter`: para escribir caracteres en un fichero.

#### ¿Cuándo usar cada uno?
- Usa **flujos de bytes** si estás trabajando con **datos binarios**. Ejemplos:
  - Guardar una imagen (`.jpg`, `.png`) que el usuario sube en una aplicación.
  - Leer un archivo de audio (`.mp3`) para reproducirlo.
  - Copiar cualquier tipo de archivo sin alterar su contenido.
- Usa **flujos de caracteres** si estás trabajando con **texto plano**. Ejemplos:
  - Leer un fichero `.txt` con instrucciones o datos.
  - Guardar las notas de un alumno en un archivo `.csv`.
  - Escribir un informe de errores en un archivo `.log`.

#### Mejorar del rendimiento con `Buffered`

Los `Buffered` consiguen almacenar datos en memoria temporal, reduciendo el número de accesos físicos al disco. Esto permite reducir el número de accesos físicos al disco y, por tanto, mejorar notablemente el rendimiento en las operaciones de lectura y escritura. En la práctica, usaremos Buffered en la mayoría de ocasiones.

Java cuenta con las clases `BufferedReader`, `BufferedWriter`, `BufferedInputStream` y `BufferedOutputStream` que sustituyen a las vistas anteriormente cuando queremos trabajar con búfers:

| Clase básica          | Clase con buffer              | Tipo de datos     | Mejoras                                                |
|-----------------------|-------------------------------|-------------------|--------------------------------------------------------|
| `FileReader`          | `BufferedReader`              | Texto (lectura)   | Lee por bloques o líneas en vez de caracter a caracter.|
| `FileWriter`          | `BufferedWriter`              | Texto (escritura) | Escribe por bloques en vez de caracter a caracter.     |
| `FileInputStream`     | `BufferedInputStream`         | Binario (lectura) | Útil para copiar o leer archivos grandes en binario.   |
| `FileOutputStream`    | `BufferedOutputStream`        | Binario (escritura)| Útil para escribir cantidades grandes en binario.     |

En resumen, aunque podemos usar ambos tipos, usaremos las clases `Buffered` cuando se espera leer o escribir más de unos pocos bytes o caracteres, dejando las clases básicas solo para tareas muy simples (lectura o escritura de un solo caracter, por ejemplo).

#### Excepciones típicas

Al leer y escribir en ficheros a través de flujos, hay una serie de excepciones que pueden darse. Las más habituales son:

- `FileNotFoundException`: el fichero no existe o no se puede acceder.
- `IOException`: error de lectura o escritura general.


#### Ejemplos de código

Ejemplo 1: Leer un archivo de texto línea por línea con BufferedReader:

```java
try {
    BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
    String linea;
    while ((linea = br.readLine()) != null) {
        System.out.println(linea);
    }
    br.close();
} catch (IOException e) {
    System.out.println("Error al leer el archivo: " + e.getMessage());
}
```

Ejemplo 2: Escribir varias líneas en un archivo de texto con BufferedWriter:

```java
try {
    BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));
    bw.write("Primera línea");
    bw.newLine();
    bw.write("Segunda línea");
    bw.close();
} catch (IOException e) {
    System.out.println("Error al escribir en el archivo: " + e.getMessage());
}

```

---

### 3. Escritura y lectura de objetos (Serialización)

A veces lo que queremos guardar en un fichero no es un simple dato, como una palabra o un número, si no que pueden ser objetos completos con todos sus atributos, estructuras de datos completas, etc. Es el proceso de **convertir un objeto en una secuencia de bytes** para poder almacenarlo en un fichero o transmitirlo se llama **serialización**.

#### Clases de Java necesarias

La serialización en Java es un proceso que ya viene implementado internamente en las clases `ObjectOutputStream` y `ObjectInputStream`:

**Clase `ObjectOutputStream`:**
- Convierte un objeto en una secuencia de bytes.
- Escribe esa secuencia en un flujo (por ejemplo, un fichero).

**Clase `ObjectInputStream`:**
- Lee una secuencia de bytes que representa un objeto.
- Reconstruye el objeto original en memoria.

Al trabajar con objetos serializados es importante tener en cuenta que la clase del objeto debe implementar la interfaz `Serializable`. Tenemos entonces dos opciones:
- Clases propias de Java (como ArrayList o HashMap): ya implementan Serializable, por lo que podemos usarlas sin problema.
- Clases creadas por mi (como una clase Persona): debemos indicar que sea serializable para poder guardar objetos en ficheros y añadir una versión de serialización (que permitirá comprobar si se puede cargar un objeto serializado en una clase porque se use la misma versión, o si la clase ha cambiado desde que se guardó el objeto).

#### Ejemplos de código:

Ejemplo 1: guardar un ArrayList en un txt

```java
ArrayList<String> lista = new ArrayList<>();
lista.add("Hola");
lista.add("Mundo");

try {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lista.txt"));
    oos.writeObject(lista);
    System.out.println("ArrayList guardado correctamente.");
} catch (IOException e) {
    System.out.println("Error al guardar: " + e.getMessage());
}
```
Ejemplo 2: leer un ArrayList guardado en un txt
```java
try {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lista.txt"));
    ArrayList<String> listaLeida = (ArrayList<String>) ois.readObject();
    System.out.println("ArrayList leído desde el archivo:");
    for (String elemento : listaLeida) {
        System.out.println("- " + elemento);
    }
} catch (IOException e) {
    System.out.println("Error al leer: " + e.getMessage());
}
```

Ejemplo 3: clase creada por mi que permira serialización

```java
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L; //Identificador de versión 
    //Atributos
    //Constructor
    //Metodos
}
```

---

### 4. Otros formatos para guardar datos: XML y JSON

Hasta ahora hemos trabajado con archivos de texto plano (`.txt`), pero **no siempre tenemos que guardar los datos en ese formato**. En muchas aplicaciones reales, se utilizan **formatos estructurados** como `XML` o `JSON`, que permiten representar la información de forma jerárquica. Estos formatos son ideales para almacenar configuraciones, intercambiar datos entre sistemas o representar estructuras complejas de forma clara y legible.

Java permite leer y procesar archivos XML mediante el modelo **DOM (Document Object Model)**, que carga todo el documento en memoria como un árbol de nodos.

**Librerías necesarias**:
Para trabajar con XML en Java con DOM, usamos clases del paquete `javax.xml.parsers` y `org.w3c.dom`, que ya vienen incluidas en el JDK.

Ejemplo de archivo XML: `alumnos.xml`

```xml
<alumnos>
    <alumno>
        <nombre>Ana</nombre>
        <nota>8.5</nota>
    </alumno>
    <alumno>
        <nombre>Carlos</nombre>
        <nota>6.2</nota>
    </alumno>
</alumnos>
```

Desde Java, lo ideal sería tener una clase Alumno que contara con unos atributos que se relacionen directamente con las etiquetas del XML.

```java
public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
```

De esta forma, podríamos fácilmente leer archivos del XML y guardarlos en objetos Alumno:

```java
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;
import java.util.ArrayList;

public class LeerXML {
    public static void main(String[] args) {
        //Lista de alumnos donde se cargarán todos los que se lean del XML
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        try {
            //Cargamos el fichero
            File archivo = new File("alumnos.xml");

            //Creamos los objetos necesarios de Java para cargar XML y leerlos
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc = builder.parse(archivo);
            doc.getDocumentElement().normalize();

            //Creamos una lista de tipo NodeList donde se cargarán los datos y podremos recorrer
            NodeList lista = doc.getElementsByTagName("alumno");

            //Recorremos cada nodo de la lista (cada alumno, en este caso)
            for (int i = 0; i < lista.getLength(); i++) {
                Node nodo = lista.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;

                    String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent(); //Cargamos el nombre
                    double nota = Double.parseDouble(elemento.getElementsByTagName("nota").item(0).getTextContent()); //Cargamos la nota

                    // Crear objeto Alumno y añadirlo a la lista
                    Alumno alumno = new Alumno(nombre, nota);
                    listaAlumnos.add(alumno);
                }
            }

        } catch (Exception e) {
            System.out.println("Error al leer XML: " + e.getMessage());
        }

        // Podríamos ahora mostrar los alumnos recorriendo la lista
    }
}

```




