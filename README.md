# Fitness Tracker Application

A backend application developed using Java and Spring Boot to support fitness tracking through RESTful APIs.

## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Database:** PostgreSQL (Neon)
- **ORM:** Hibernate / Spring Data JPA
- **Security:** JWT Authentication
- **API Documentation:** Swagger UI
- **API Testing:** Postman
- **Containerization:** Docker
- **Deployment:** Render

## Key Highlights

- Developed RESTful APIs using Spring Boot.
- Integrated PostgreSQL for persistent data storage.
- Implemented JWT-based authentication.
- Used Hibernate and JPA for database operations.
- Documented APIs using Swagger UI.
- Tested API endpoints using Postman.
- Containerized the application using Docker.
- Deployed the application on Render.

## Live Application

[Fitness Tracker – Live Deployment](https://fitness-mono-latest-llah.onrender.com)

## API Documentation

Swagger UI:

`/swagger-ui/index.html`

## Environment Variables

The application uses environment variables for sensitive configuration:

- `DB_URL` – Database connection URL
- `DB_USER` – Database username
- `DB_PWD` – Database password
- `JWT_SECRET` – JWT signing secret

**Note:** Actual credentials and secrets should never be committed to the repository.

## Running Locally

1. Clone the repository:

   ```bash
   git clone https://github.com/SIPRA-SHUBHALAXMI-PATTNAYAK/fitness-tracker-app.git
   ```

2. Navigate to the project directory.

3. Configure the required environment variables.

4. Build the application:

   ```bash
   mvn clean package
   ```

5. Run the generated JAR file:

   ```bash
   java -jar target/your-application.jar
   ```

## Author

**Sipra Shubhalaxmi Pattnayak**

[GitHub](https://github.com/SIPRA-SHUBHALAXMI-PATTNAYAK)
