# Spring Boot PEP (Personal Engagement Project)

A robust and scalable Spring Boot application designed to provide a comprehensive REST API for CRUD operations. This project follows clean architecture principles and is built for high performance and extensibility.

## 🚀 Features

- **RESTful API**: Fully functional endpoints for managing resources.
- **Database Integration**: Seamless connection with PostgreSQL (Supabase).
- **Security First**: Sensitive credentials are managed via environment variables and externalized configuration.
- **Clean Code**: Adheres to modern Java and Spring Boot best practices.
- **Auto-Documentation**: Integrated with Swagger/OpenAPI (if applicable).

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

## 🚦 Getting Started

### Prerequisites

- JDK 17 or higher
- Maven 3.6+
- A PostgreSQL database (e.g., Supabase)

### Configuration

1. Locate the `src/main/resources/application-secret.properties.example` file.
2. Create a new file named `src/main/resources/application-secret.properties` in the same directory.
3. Fill in your database credentials:

```properties
DB_URL=jdbc:postgresql://your-db-host:5432/your-db-name
DB_USERNAME=your-username
DB_PASSWORD=your-password
```

### Running the Application

```bash
mvn spring-boot:run
```

The server will start at `http://localhost:8081`.

## 📂 Project Structure

- `src/main/java`: Source code including controllers, services, and repositories.
- `src/main/resources`: Configuration files and static assets.
- `pom.xml`: Project dependencies and build configuration.

## 🛡️ License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.
