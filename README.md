# Movie Management REST API

This project is a **Java Spring Boot backend application** that provides REST APIs to manage movies (Netflix-style example).

The application uses **in-memory storage (ArrayList)** and does not use any database.

---

## Tech Stack
- Java
- Spring Boot
- Spring Web
- Maven

---

## Functionality
- Add a movie
- Get a movie by ID
- Input validation for required fields

---

## API Endpoints

### Add Movie (POST)


Clone the repository

Open the project in an IDE

Run the Spring Boot application

Server starts at:

http://localhost:7070

 POST http://localhost:7070/api/movies in POSTMAN

{
  "name": "Inception",
  "description": "Sci-fi movie",
  "genre": "Sci-Fi"
}

GET http://localhost:7070/api/movies/1( if  id change  to 2 another movie appears)
