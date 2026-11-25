# Yet Another Car Manager

This project was made as a submission to the following challenge proposed by Professor Gustavo Ferreira Palma:

Based on the classroom example developed in class, create a REST API using Spring Boot to manage the registration of vehicles, allowing record creation, queries, updates and deletion of records stored in a relational database.

The activity only requires Back-End implementation, without any Front-End development.

A atividade deverá contemplar exclusivamente o Back-End. Não será necessário desenvolver Front-End.

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
