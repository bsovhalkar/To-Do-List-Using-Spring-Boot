# 📝 To-Do Application

A simple **To-Do task management web application** built using **Spring Boot, Thymeleaf, and MySQL**.
Users can add tasks, mark them as completed, and delete tasks through a clean web interface.

---

# 🚀 Features

* Add new tasks
* View all tasks
* Toggle task completion
* Delete tasks
* Responsive UI with Bootstrap
* Server-side rendering using Thymeleaf
* Persistent storage with MySQL

---

# 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Thymeleaf
* MySQL
* Bootstrap

---

# 📂 Project Structure

src/main/java
├── controller
│   └── TaskController.java
├── service
│   └── TaskService.java
├── repository
│   └── TaskRepository.java
├── model
│   └── Task.java

src/main/resources
├── templates
│   └── tasks.html
└── application.properties

---

# ⚙️ Prerequisites

Make sure the following are installed:

* Java 17+
* Maven
* MySQL Server
* Git

---

# 🗄️ Database Setup

Create a MySQL database:

```sql
CREATE DATABASE todo_app;
```

---

# 🔧 Configuration

Open:

```
src/main/resources/application.properties
```

Add **your own MySQL credentials**:

```
spring.application.name=to-do

spring.datasource.url=jdbc:mysql://127.0.0.1:3306/todo_app
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

⚠️ Replace:

```
YOUR_USERNAME
YOUR_PASSWORD
```

with your **local MySQL credentials**.

Example:

```
spring.datasource.username=root
spring.datasource.password=root
```

---

# ▶️ Running the Application

Clone the repository:

```
git clone https://github.com/your-username/todo-app.git
```

Navigate to the project:

```
cd todo-app
```

Run the application:

```
mvn spring-boot:run
```

---

# 🌐 Access the Application

Open your browser and visit:

```
http://localhost:8080
```

---

# 📸 Application Functions

Users can:

* Add a task
* Mark tasks as completed
* Delete tasks

Completed tasks are displayed with a **strikethrough style**.

---

# 📌 Future Improvements

* Edit tasks
* Task filtering (completed / pending)
* REST API version
* Authentication (Spring Security)
* Docker deployment

---

# 👨‍💻 Author

Bhavanesh

---
