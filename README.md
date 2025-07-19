# Blog API - Spring Boot Assignment

A REST API for managing blog posts with CRUD operations.

## Features
- Create, read, update, and delete blogs.
- Uses H2 in-memory database.

## Technologies
- Java 17
- Spring Boot 3.x
- H2 Database
- Postman (for testing)

## How to Run
1. **Clone the repo**:
   ```bash
   git clone https://github.com/Aayusha-s/Blog-API.git
   ```
2. **Open in IntelliJ**:
   - Import as a Maven project.
3. **Run the application**:
   - Open `BlogApplication.java` → Click the green "Run" button.
4. **Test APIs**:
   - Use the included Postman collection: `/postman/BlogAPI_Postman_Collection.json`.

## API Endpoints
| Method | Endpoint       | Description          |
|--------|----------------|----------------------|
| POST   | `/blogs`       | Create a blog        |
| GET    | `/blogs`       | Get all blogs        |
| GET    | `/blogs/{id}`  | Get a blog by ID     |
| PUT    | `/blogs/{id}`  | Update a blog        |

## H2 Database Console
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:blogdb`
- Username: `sa`
- Password: (leave empty)
