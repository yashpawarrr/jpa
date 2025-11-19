🏥 Hospital Management System

A complete Hospital Management System built using Spring Boot, JPA/Hibernate, and MySQL.
This project helps manage patients, doctors, appointments, billing, and more .
🚀 Features

✔️ Add, update, delete Patients

✔️ Add and manage Doctors

✔️ Manage Insurance Records

✔️ Book and cancel Appointments

✔️ Manage Medical Records

✔️ JPA & Hibernate for ORM

✔️ MySQL database integration

🛠️ Tech Stack
Layer	Technology
Backend	Spring Boot
ORM	JPA / Hibernate
Database	MySQL
Build Tool	Maven
API Testing	Postman
📁 Project Structure
src/
 ├── main/
 │   ├── java/com/hospital/management/
 │   │     ├── controller/
 │   │     ├── service/
 │   │     ├── repository/
 │   │     ├── entity/
 │   │     └── HospitalManagementApplication.java
 │   └── resources/
 │         ├── application.properties
 │         └── data.sql 

🗄️ Database Configuration

In your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

▶️ How to Run

Clone the repository

git clone https://github.com/yashpawarrr/jpa.git

Open in IntelliJ / Eclipse

Configure MySQL

Run the Spring Boot application

Test APIs using Postman
Example:

GET /api/patients

POST /api/appointments


📚 What I Learned

JPA & Hibernate (One-to-Many, Many-to-One mappings)

Proper layered architecture

Writing clean REST APIs

Using MySQL with Spring Boot

Exception handling & validations

🤝 Contributing

Pull requests are welcome!

📜 License

This project is open-source and free to use.
