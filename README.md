# Spring API Example

## Getting Started

### Dependencies

- Java 21
- Docker Compose

### Running

```shell 
docker compose up # up postgres database
./mvnw spring-boot:run # run spring server
```

## Routes

### Users
- GET `/users`: return all users
```json
[
  {
    "id": integer,
    "name": string,
    "email": string
  }, ...
]
```
- GET `/users/{id}`: return user from given id
#### Return
```json
{
  "id": integer,
  "name": string,
  "email": string
}
```
- DELETE `/users/{id}`: delete user from given id
- PUT `/users/{id}`: update user from given id and given body structure, and return the updated structure
#### Request Body
```json
{
  "name": string,
  "email": string
}
```
#### Return
```json
{
  "id": integer,
  "name": string,
  "email": string
}
```
- POST `/users`: create user from given body structure and return the created structure
#### Request Body
```json
{
  "name": string,
  "email": string
}
```
#### Return
```json
{
  "id": integer,
  "name": string,
  "email": string
}
```
