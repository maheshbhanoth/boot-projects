# HotelManagement

The Hotel Management System is a Spring Boot application that provides management functionalities for rooms.

## Features

- Add a new room
- Retrieve a room by ID
- Retrieve all rooms
- Update a room
- Delete a room

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- h2-db (or any other supported relational database)
- RESTful APIs

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- h2-database or another supported relational database
- Your preferred IDE (e.g., IntelliJ, Eclipse)

### Installation

1. Clone the repository:

git clone url


2. Import the project into your IDE.

3. Configure the database connection in the `application.properties` file:

spring.datasource.url=jdbc:mysql://localhost:3306/Hotel_db
spring.datasource.username=db_username
spring.datasource.password=db_password


4. Run the application:

mvn spring-boot:run



5. The application will start running on `http://localhost:8080`.

## API Endpoints

### Hotel API

- `POST /api/v1/Hotel-app/add-room`: Add a new room.
- `GET /api/v1/Hotel-app/find-room/id/{id}`: Retrieve a room by ID.
- `GET /api/v1/Hotel-app/find-all`: Retrieve all Rooms.
- `PUT /api/v1/Hotel-app/update-Room/id/{id}`: Update a Room by ID.
- `DELETE /api/v1/Hotel-app/delete-Room/id/{id}`: Delete a Room by ID.

## Contribution

Contributions to the Hotel Management System project are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.
