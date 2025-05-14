# APUNTES

### BufferedWriter
- No es necesario hacer un new file cuando usamos el bufferedWriter ya que incluye el new FileWriter, por lo que ya lo crea automáticamente.
- Sobre escribe el contenido del archivo si ya hay algo escrito (de manera general), pero si queremos que se escriba a continuación, añadimos true, que indica que el contenido se incorporará al final del archivo.
- Obligatorio cerrarlo ya que no escribe en el archivo, además de por rendimiento.