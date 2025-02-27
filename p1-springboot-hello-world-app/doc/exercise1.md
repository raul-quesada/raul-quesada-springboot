# URL Repositorios GitHub & DockerHub

- [Github - https://github.com/raul-quesada/raul-quesada-springboot.git](https://github.com/raul-quesada/raul-quesada-springboot.git)
- [DockerHub - https://hub.docker.com/r/raulquesada/spring-boot-demoapp
  ](https://hub.docker.com/r/raulquesada/spring-boot-demoapp
  )

# Spring Boot Application - Technical Overview

## 1. Introduction to Spring Boot
Spring Boot is a Java-based framework that simplifies the development of **standalone, production-ready Spring applications**. It provides:
- **Embedded servers** (Tomcat, Jetty, etc.), eliminating the need for external configurations.
- **Spring Boot Starters** to easily include dependencies.
- **Auto-configuration**, reducing boilerplate code.
- **Spring MVC** for building RESTful web applications.
- **Spring Dependency Injection (DI)** to manage components efficiently.

### **Project Structure**
The project follows a **layered architecture**:
1. **Controller Layer** – Handles HTTP requests (annotated with `@Controller` or `@RestController`).
2. **Service Layer** – Business logic (annotated with `@Service`).
3. **Repository Layer** – Handles database operations (annotated with `@Repository`, using Spring Data JPA).
4. **View Layer** – Uses **Thymeleaf** templates for rendering dynamic web pages.

---

## 2. Implemented Features
The application consists of various functionalities, each following the **Spring MVC pattern** with a **controller-service-template approach**.

### **2.1 Basic Greeting Functionality**
- The `@Controller` handles GET requests to return a greeting message.
- A service class processes the request.
- Thymeleaf renders the message dynamically in an HTML template.

### **2.2 Square Number Validation**
- A form allows users to input two numbers.
- The **controller** (`@Controller`) processes the request and calls a **service** (`@Service`) that verifies if the second number is the square of the first.
- Thymeleaf displays the result dynamically.

### **2.3 Even Number Check**
- The user enters a number through a form.
- The request is processed in the controller, and the service determines if the number is even or odd.
- The response is rendered using Thymeleaf.

### **2.4 Calculator Functionality**
- Supports basic arithmetic operations (`sum`, `subtract`, `multiply`, `divide`).
- Uses a form to collect input.
- The service processes the calculations and returns the result.

---

## 3. Testing
- **JUnit** is used for unit testing.
- Each service method has corresponding test cases.
- Controllers are tested using **MockMvc** to simulate HTTP requests.

---

## 4. Deployment & Dockerization
### **4.1 Packaging the Application**
- The project is built using **Maven** (`mvn package`).
- Generates a **JAR file** that includes dependencies.

### **4.2 Dockerization**
- A `Dockerfile` is created to build a containerized application.
- **Base image:** `openjdk:8-jdk-alpine`.
- The JAR file is copied into the container and executed with `java -jar`.
- The image is pushed to **DockerHub** for deployment.

### **4.3 Running the Application with Docker**
The container can be pulled and executed using:
```sh
docker pull raulquesada/spring-boot-demoapp
docker run -p 8080:8080 raulquesada/spring-boot-demoapp
