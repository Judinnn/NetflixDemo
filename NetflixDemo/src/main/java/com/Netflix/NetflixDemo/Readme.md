1. Movie Management REST APi

A Spring Boot REST API for managing movies (Netflix-style example).  
The application uses , in-memory storage (ArrayList)  and does not use any database.

2.Technologies
- Java
- Spring Boot
- Spring Web
- Maven

3.Features
- Add a new movie
- Get movie details by ID
- Basic input validation

4.API Endpoints
- **POST** `/api/movies` – Add a movie
- **GET** `/api/movies/{id}` – Retrieve a movie by ID

5.How to Run
1. Import the project into an IDE
2. Run `NetflixDemoApplication.java`
3. Application runs at `http://localhost:7070`

6.Notes
- Data is stored in memory and resets on restart
- Repository layer is not used as per task requirements
