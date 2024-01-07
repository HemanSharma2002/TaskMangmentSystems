
# Task Managment Systemn

Rest Api build using spring boot and hibernate to perform basic Crud operations 


## Entity Detail

Coloums to be create by API in database

`sNO`
`title`
`description`
`deadline`
`Status`

## API Reference

### Postman/Insomia request


POST
```http
http://localhost:8083/create
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `title` | `String` | **Required**. Task title |
| `description` | `String` | **Required**. Task detail |
| `deadline` | `Date` | **Required**. Due date |

Text to be passed in JSON format


GET
```http
  http://localhost:8083/read
```
```http
  http://localhost:8083/read/no/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of task to fetch |

DELETE
```http
  http://localhost:8083/delete/all
```
```http
  http://localhost:8083/delete/no/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of task to delete |


PUT
```http
  http://localhost:8083/update/status/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of task to update its status |

```http
  http://localhost:8083/update/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `title` | `String` |  Task title |
| `description` | `String` | Task detail |
| `deadline` | `Date` |  Due date |


Text to be passed in JSON format

## Working Video

[Video](https://drive.google.com/file/d/1XBHIiglZ0ayi7X5c6QfOlScB8VcbiSTF/view?usp=sharing)

Name of the project has been changed from TaskManagmentSystem to TaskManagmentSystems


## Authors

Github - [HemanSharma2002](https://github.com/HemanSharma2002)

LinkedIn - [HemanSharma](https://www.linkedin.com/in/heman-sharma-6a60b0203/)

Resume - [Heman Sharma]()
## 🛠 Skills
Language - Java , Python

Framework- Spring Boot , Hibernate , Rest API

Database- My Sql

Other- Postman , Insomia , JUnit 5 

