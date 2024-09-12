This project provides the backend API for an e-commerce platform. It supports user registration, login, and product management functionalities. The API is deployed on Render and accessible via the following endpoints.

API
Base URL: https://ecommerce-23dd.onrender.com

Getting Started
Prerequisites
SpringBoot
Any HTTP client (e.g., Postman) for testing API requests

API Endpoints
1. User Registration
Endpoint: /register
Method: POST
Description: Registers a new user.
Request Body:
json
{
  "username": "your_username",
  "password": "your_password"
}
Example Request:
Response:
json
{
  "message": "User registered successfully",
  "userId": "generated_user_id"
}
2. User Login
Endpoint: /login

Method: POST

Description: Logs in a user and returns a token.

Request Body:

json
Copy code
{
  "username": "neha@123",
  "password": "1234"
}
Example Request:

Response:

json
Copy code
{
  "token": "generated_jwt_token",
  "message": "Login successful"
}
Credentials for Testing:

Username: neha@123
Password: 1234.
Get All Products
Endpoint: /products
Method: GET
Description: Retrieves a list of all available products.
Example Request:
GET https://ecommerce-23dd.onrender.com/products
Response:
json:
[
  {
    "productId": "1",
    "name": "Product Name 1",
    "price": 29.99,
    "description": "Description of product 1",
    "category": "Electronics",
    "similarProducts": []
  },
  {
    "productId": "2",
    "name": "Product Name 2",
    "price": 49.99,
    "description": "Description of product 2",
    "category": "Fashion",
    "similarProducts": []
  }
]
4. Get Product by ID
Endpoint: /products/{product_id}
Method: GET
Description: Retrieves detailed information about a specific product.
Example Request:
 GET https://ecommerce-23dd.onrender.com/products/1
Response:
json:
{
  "productId": "1",
  "name": "Product Name 1",
  "price": 29.99,
  "description": "Description of product 1",
  "category": "Electronics",
  "stock": 10
}
Testing the API
You can test the API using tools like Postman. Ensure you have the correct endpoints and payloads as mentioned above.

Example: Testing User Login via Postman
Open Postman.
Create a new POST request.
Enter the URL: https://ecommerce-23dd.onrender.com/login
Set the headers to Content-Type: application/json.
In the body, provide:
json
{
  "username": "neha@123",
  "password": "1234"
}
Click Send and you should receive the JWT token as a response.
This README.md provides a structured overview of how to use your e-commerce API with the relevant endpoints and instructions. You can adjust it as necessary depending on your needs or future features.
