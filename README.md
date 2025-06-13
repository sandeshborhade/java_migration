# Spring Boot Demo - Migrated to Spring Boot 3.4

This project has been migrated from Spring Boot 2.1.5 to Spring Boot 3.4.0.

## Key Migration Changes

1. Updated Spring Boot version from 2.1.5 to 3.4.0
2. Updated Java version from 8 to 17
3. Replaced javax.* imports with jakarta.* imports
4. Updated H2 database version to 2.2.224
5. Updated application properties (jdbcUrl → url)
6. Migrated from java.util.Date to java.time.LocalDateTime
7. Added JUnit Vintage Engine for backward compatibility with JUnit 4 tests

## Running the Application

```bash
mvn clean install
mvn spring-boot:run
```

## Testing

```bash
mvn test
```

## H2 Console

The H2 console is available at: http://localhost:8080/h2-console

Connection details:
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: sa