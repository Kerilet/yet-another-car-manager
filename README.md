# Yet Another Car Manager

This project was made as a submission to the following challenge proposed by Professor Gustavo Ferreira Palma:

### Based on the classroom example developed in class, create a REST API using Spring Boot to manage the registration of vehicles, allowing record creation, queries, updates and deletion of records stored in a relational database.

### The activity only requires Back-End implementation, without any Front-End development.

**The application shall operate with at least the following information:**

| Field    | Data Type | Description |
| -------- | ------- | -------- |
| ID  | LONG    | Automatically generated unique identifier    |
| Brand | STRING     | Vehicle Manufacturer    |
| Model    | STRING    | Vehicle Model    |
| Fabrication Year | INTEGER     | Year in which the vehicle was manufactured    |
| Model Year    | INTEGER    | Vehicle Model's corresponding Year    |
| Motorization    | STRING    | Vehicle's motor specification  |

**Furthermore, the following endpoints and their functionalities shall be implemented as follows:**
| HTTP Method    | Endpoint | Functionality |
| -------- | ------- | -------- |
| POST  | /vehicles    | Register a new vehicle    |
| GET | /vehicles     | List all vehicle    |
| GET    | /vehicles/{id}    | List a vehicle by its ID   |
| PUT | /vehicles/{id}     | Update a vehicle's information    |
| DELETE     | /vehicles/{id}    | Delete a Vehicle    |

*ALL OPERATIONS SHALL USE THE **JSON** format to show data, when applicable*

### Technical Requirements

The project must be developed using:
• Java with Spring Boot;
• Spring Web for creating the REST endpoints;
• Spring Data JPA for data persistence;
• Relational database (MySQL, MariaDB, PostgreSQL, etc.);
• Maven for dependency management.

The project must present an appropriate organization of packages and classes, including, at a minimum, the `Vehicle` entity, the repository `VehicleRepository`, and the `VehicleController` REST controller.

### Request Example
To register a vehicle, send a POST request to the /vehicles endpoint, with the header `"Content-Type": "application/json"` and the following body:

> {
> 
> "brand": "Volkswagen",
> 
> "model": "Golf",
>
> "manufactureYear": 2020,
>
> "modelYear": 2021,
>
> "engine": "1.4 TSI"
>
> }

After registration, the API must return the vehicle data, including the automatically generated identifier.

### Application Testing
After implementing the API, perform tests using Postman, Insomnia, or another tool capable of sending HTTP requests. Verify the operation of registering, listing, individual querying, updating, and deleting vehicles.

### Evaluation Criteria

| Criteria    | Score | 
| -------- | ------- |
| Creation and configuration of the Spring Boot project  | 1.0    | 
| Entity implementation and JPA mapping | 2.0     |
| Repository implementation    | 1.0    | 
| REST endpoints implementation | 4.0    |
| Persistence and operation of CRUD operations     | 1.0    | 
| Code organization and quality     | 1.0    | 
| Total     | 10.0    |

### Delivery
The application must be functional and allow the execution of all operations through HTTP requests.

**Important:** It will not be necessary to implement HTML, CSS, JavaScript pages, or any other Front-End technology. The objective is to understand the development of REST APIs with Spring Boot, HTTP communication, and data persistence with JPA.
