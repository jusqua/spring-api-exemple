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
- GET `/users/{cpf}`: return user from given cpf
#### Return
```json
{
  "cpf": integer,
  "name": string,
  "birth_date": iso-date
}
```
- POST `/users`: create user from given body structure and return the created structure
#### Request Body
```json
{
  "cpf": integer,
  "name": string,
  "birth_date": iso-date
}
```
#### Return
```json
{
  "cpf": integer,
  "name": string,
  "birth_date": iso-date
}
```
