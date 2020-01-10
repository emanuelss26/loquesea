# General
## Iniciar
Sobre la carpeta del proyecto (recuerden tener instalado maven)
```
mvn spring-boot:run
```
## Enlaces
Para swagger:
```
http://localhost:9090/swagger-ui.html
````
Para la consola H2 (Es una base de datos volatil)
```
http://localhost:9090/h2-console
```

## Application.properties

Recuerden que este archivo contiene toda la configuración de su proyecto. Aqui deben cambiar la base volatil por MySQL

```
server.port=9090
spring.jpa.hibernate.ddl-auto=create
# LAS TRES DE ABAJO SON PARA MYSQL
#spring.datasource.url=jdbc:mysql://localhost:3306/empleados
#spring.datasource.username=root
#spring.datasource.password=root
#LAS CINCO DE ABAJO SON PARA H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

```
