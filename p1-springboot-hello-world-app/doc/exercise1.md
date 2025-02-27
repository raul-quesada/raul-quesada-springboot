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

### 3.1. Testing the Even Number Controller

### ✅ **Purpose:**
The EvenController handles requests to check whether a number is even or odd. The unit test ensures that:
- The controller correctly identifies even and odd numbers.
- The correct view (`evenResult.html`) is returned.

### 🔧 **Testing Approach:**
- Mocking the **EvenService** dependency.
- Sending test requests using `MockMvc`.
- Validating the response message and status.

### 🛠 **What is tested?**
✔ HTTP request returns the correct response.  
✔ Service logic is correctly invoked.  
✔ Even and odd number checks return expected results.

---

### 3.2 Testing the Square Number Controller

### ✅ **Purpose:**
The SquareController checks if a given number is the square of another. This unit test ensures:
- The correct computation of square values.
- Proper response messages for valid and invalid cases.

### 🔧 **Testing Approach:**
- Sending HTTP POST requests with two numbers as parameters.
- Mocking the **SquareService** to validate results.
- Checking that the response returns either **"It is a perfect square"** or **"It is not a perfect square"**.

### 🛠 **What is tested?**
✔ HTTP response status is correct.  
✔ The square verification logic works correctly.  
✔ The correct Thymeleaf template is returned.

---

### 3.3 Testing the Calculator Controller

### ✅ **Purpose:**
The CalculatorController handles basic arithmetic operations. The unit test ensures:
- Correct calculations for addition, subtraction, multiplication, and division.
- The controller correctly processes user input and returns valid results.

### 🔧 **Testing Approach:**
- Sending HTTP requests with numbers and operations.
- Verifying response values for each arithmetic operation.
- Handling edge cases like division by zero.

### 🛠 **What is tested?**
✔ Addition, subtraction, multiplication, and division return correct values.  
✔ Division by zero is handled gracefully.  
✔ The correct result is passed to the Thymeleaf template.

---

### 3.4 Testing the Palindrome Controller

### ✅ **Purpose:**
The PalindromeController verifies if a given word or phrase is a palindrome. The unit test ensures:
- The correct identification of palindromes and non-palindromes.
- The controller properly handles case sensitivity and whitespace.

### 🔧 **Testing Approach:**
- Sending HTTP requests with test words.
- Mocking the **PalindromeService**.
- Verifying that valid palindromes return **"It is a palindrome"** and invalid ones return **"It is not a palindrome"**.

### 🛠 **What is tested?**
✔ Detection of palindromes regardless of case and spaces.  
✔ Correct response for non-palindromic words.  
✔ The correct Thymeleaf template is returned.

---

### 3.5 Conclusion

These unit tests ensure that each controller in the application functions correctly and returns expected results. They help validate:
- The **correct logic implementation** in services.
- The **accuracy of responses** returned by controllers.
- The **correct rendering of views** with Thymeleaf templates.

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
