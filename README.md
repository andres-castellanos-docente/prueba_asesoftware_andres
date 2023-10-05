# prueba_asesoftware_andres


Ejecutar script en la Base de Datos/backup.sql

Validar dentro del script la creación del usuario y asignación de permisos

create user "C##TEST" identified by "oracle";

grant sysdba to "C##TEST";


Validar configuración de la base de datos, server, puerto usuario y clave en el proyecto back en el archivo application.properties.

OracleDB connection settings
spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/free
spring.datasource.username=C##TEST
spring.datasource.password=oracle




Ejecutar back: mvn clean install spring-boot:run


Instalar dependencias del front: npm install

Ejecutar front: ng serve


