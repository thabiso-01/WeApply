# API Endpoints Documentation

## User Authentication
- **POST /api/auth/login**  
  - Description: Logs a user into the system.
  - Request Body:
    - `email`: User's email address
    - `password`: User's password

## User Management
- **GET /api/users**  
  - Description: Retrieves a list of users.

- **GET /api/users/{id}**  
  - Description: Retrieves details of a specific user.

- **POST /api/users**  
  - Description: Creates a new user.
  - Request Body:
    - `name`: User's full name
    - `email`: User's email address
    - `password`: User's password

## Application Management
- **GET /api/applications**  
  - Description: Retrieves a list of applications.

- **GET /api/applications/{id}**  
  - Description: Retrieves details of a specific application.

- **POST /api/applications**  
  - Description: Submits a new application.
  - Request Body:
    - `userId`: ID of the user applying
    - `jobId`: ID of the job being applied for

## Jobs
- **GET /api/jobs**  
  - Description: Retrieves a list of job postings.

- **GET /api/jobs/{id}**  
  - Description: Retrieves details of a specific job posting.

- **POST /api/jobs**  
  - Description: Creates a new job posting.
  - Request Body:
    - `title`: Job title
    - `description`: Job description
    - `requirements`: Job requirements

## Error Handling
- **Response Codes:**
  - 200: Success
  - 201: Created
  - 400: Bad Request
  - 401: Unauthorized
  - 404: Not Found
  - 500: Internal Server Error

---

*This document was generated on 2026-04-01 13:30:39 UTC*