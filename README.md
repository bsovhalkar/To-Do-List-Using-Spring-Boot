# 📝 To-Do Application

A simple **To-Do task management web application** built using **Spring Boot, Thymeleaf, and MySQL**.
Users can add tasks, mark them as completed, and delete tasks through a clean web interface.

---

## 🚀 Features

* Add new tasks
* View all tasks
* Toggle task completion status (checkbox)
* Delete tasks
* Responsive UI with Bootstrap 5
* Server-side rendering using Thymeleaf
* Persistent storage with MySQL
* Automatic table creation/update via Hibernate DDL

---

## 🛠️ Tech Stack

| Layer      | Technology                        |
|------------|-----------------------------------|
| Language   | Java 21                           |
| Framework  | Spring Boot 4.0.3                 |
| ORM        | Spring Data JPA / Hibernate       |
| Templating | Thymeleaf                         |
| Database   | MySQL                             |
| Frontend   | Bootstrap 5.3.3                   |
| Utilities  | Lombok                            |
| Build Tool | Maven                             |

---

## 📂 Project Structure

```
src/
├── main/
│   ├── java/com/spring/to_do/
│   │   ├── ToDoApplication.java          # Spring Boot entry point
│   │   ├── controller/
│   │   │   └── TaskController.java       # HTTP request handlers
│   │   ├── service/
│   │   │   └── TaskService.java          # Business logic
│   │   ├── repository/
│   │   │   └── TaskRepository.java       # JPA repository (CRUD)
│   │   └── models/
│   │       └── Task.java                 # JPA entity (id, title, completed)
│   └── resources/
│       ├── templates/
│       │   └── tasks.html                # Thymeleaf UI template
│       └── application.properties        # App & DB configuration
└── test/
    └── java/com/spring/to_do/
        └── ToDoApplicationTests.java     # Spring context smoke test
```

---

## ⚙️ Prerequisites

Make sure the following are installed:

* **Java 21+**
* **Maven 3.6+**
* **MySQL Server 8+**
* **Git**

---

## 🗄️ Database Setup

Create a MySQL database:

```sql
CREATE DATABASE todo_app;
```

---

## 🔧 Configuration

Open `src/main/resources/application.properties` and update with your MySQL credentials:

```properties
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

> ⚠️ Replace `YOUR_USERNAME` and `YOUR_PASSWORD` with your local MySQL credentials.

---

## ▶️ Running the Application

1. **Clone the repository:**

```bash
git clone https://github.com/bsovhalkar/To-Do-List-Using-Spring-Boot.git
cd To-Do-List-Using-Spring-Boot
```

2. **Configure the database** (see [🔧 Configuration](#-configuration) above)

3. **Run the application:**

```bash
mvn spring-boot:run
```

---

## 🌐 Access the Application

Open your browser and visit:

```
http://localhost:8080
```

---

## 🔄 API / URL Endpoints

| Method | URL              | Description             |
|--------|------------------|-------------------------|
| GET    | `/`              | View all tasks          |
| POST   | `/`              | Add a new task          |
| GET    | `/{id}/toggle`   | Toggle task completion  |
| GET    | `/{id}/delete`   | Delete a task           |

---

## 📸 Application Functions

* **Add a task** — Type a title and click "Add"
* **Mark as completed** — Click the checkbox next to a task (completed tasks show with a strikethrough)
* **Delete a task** — Click the "Delete" button next to any task

---

## 📌 Future Improvements

* Edit tasks
* Task filtering (completed / pending)
* REST API version
* Authentication (Spring Security)
* Docker deployment

---

## 👨‍💻 Author

Bhavanesh Sovhalkar

---
