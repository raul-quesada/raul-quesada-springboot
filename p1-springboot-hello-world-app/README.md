# URL Repositorios GitHub y DockerHub

- [Github - https://github.com/raul-quesada/raul-quesada-springboot.git](https://github.com/raul-quesada/raul-quesada-springboot.git)
- [DockerHub - https://hub.docker.com/r/raulquesada/spring-boot-demoapp
  ](https://hub.docker.com/r/raulquesada/spring-boot-demoapp
  )

# Aplicación inicial Spring Boot

Aplicación básica usando Spring Boot y plantillas Thymeleaf.

## Requisitos

Necesitas tener instalado en tu sistema:

- Java 8

## Ejecución

Puedes ejecutar la aplicación usando el _goal_ `run` del _plugin_ Maven 
de Spring Boot:

```
$ mvn spring-boot:run 
```

Una vez lanzada la aplicación puedes abrir un navegador y probar los distintos _controllers_:

- [http://localhost:8080](http://localhost:8080)
- [http://localhost:8080/saludo/Pepito](http://localhost:8080/saludo/Pepito)
- [http://localhost:8080/saludoplantilla/Pepito](http://localhost:8080/saludoplantilla/Pepito)
- [http://localhost:8080/saludoform](http://localhost:8080/saludoform)

Controllers Añadidos en la amplicacion

- [http://localhost:8080/even](http://localhost:8080/even)
- [http://localhost:8080/palindrome](http://localhost:8080/palindrome)
- [http://localhost:8080/square](http://localhost:8080/square)
- [http://localhost:8080/saludoform](http://localhost:8080/calculator)