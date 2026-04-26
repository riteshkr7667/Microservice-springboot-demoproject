STUDENT & COURSE MICROSERVICES PROJECT

This project is a Spring Boot Microservices-based application that manages Student and Course data using REST APIs. It demonstrates service-to-service communication, layered architecture, and clean coding practices.

--------------------------------------------------

TECH STACK

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- REST APIs
- Maven
- Git & GitHub

--------------------------------------------------

MICROSERVICES OVERVIEW

1) STUDENT SERVICE

Handles all operations related to students.

Features:
- Create Student
- Get All Students
- Get Student by ID
- Update Student
- Delete Student
- Fetch student along with enrolled course details (via Course Service)

Base URL:
http://localhost:8081/students

--------------------------------------------------

2) COURSE SERVICE

Manages course-related data.

Features:
- Create Course
- Get All Courses
- Get Course by ID
- Update Course
- Delete Course

Base URL:
http://localhost:8082/courses

--------------------------------------------------

INTER-SERVICE COMMUNICATION

- Student Service communicates with Course Service using RestTemplate
- Fetches course details based on courseId
- Demonstrates basic microservice communication

--------------------------------------------------

PROJECT STRUCTURE

student-service/
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── config

course-service/
 ├── controller
 ├── service
 ├── repository
 ├── model

--------------------------------------------------

SETUP & RUN

1) Clone the Repository
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

2) Configure Database
Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3) Run Services

cd student-service
mvn spring-boot:run

cd course-service
mvn spring-boot:run

--------------------------------------------------

API TESTING

Use tools like Postman or cURL

Examples:

Create Student
POST /students

Get All Courses
GET /courses

--------------------------------------------------

FUTURE ENHANCEMENTS

- Add Spring Cloud (Eureka Server) for service discovery
- Implement API Gateway
- Use Feign Client instead of RestTemplate
- Add JWT Authentication & Security
- Dockerize services

--------------------------------------------------

AUTHOR

Ritesh Kumar
Java Developer | Spring Boot

--------------------------------------------------

CONTRIBUTION

Feel free to fork and contribute to this project.
