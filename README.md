# Course Enrollment System

A **Spring Boot** application for managing students and courses, featuring both a **REST API** and a **web interface (Thymeleaf)**.  
This project demonstrates a full-stack backend solution with database persistence, relational mapping, and UI templates.


## Features

### Courses
- Create a course with name and duration (hours).
- List all available courses.
- View a course by ID.
- Update course details.
- Delete a course.
- View enrolled students per course.

### Students
- Register a new student.
- Assign a student to an existing course.
- List all students.
- View a student by ID.
- Update student information.
- Delete a student.

### Web UI (Thymeleaf)
- **Student list page**: view all students in a styled table with course association.
- **Course list page**: view all courses and count of enrolled students.
- Action buttons for **view details, edit, and delete**.
- Ready for extension (create/edit forms, details pages).

---

## Tech Stack

- **Language**: Java 17+
- **Framework**: Spring Boot (Web, Data JPA, Thymeleaf)
- **Database**: MySQL (default), H2 (optional for testing)
- **ORM**: Hibernate (JPA)
- **UI Templates**: Thymeleaf + HTML5 + CSS3
- **Utilities**: Lombok
- **Build Tool**: Maven
