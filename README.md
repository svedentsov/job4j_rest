# Приложение Auth
## Описание проекта
Репозиторий создан для обучения реализации REST API на Spring Boot.

## Технологии
> Java 16, Spring (Boot, Data), PostgreSQL, Liquibase, Maven

## Запуск проекта через Docker Compose
1. Скопируйте файлы репозитория в подготовленную директорию
2. Перейдите в директорию и соберите проект в jar-файл
````
mvn clean install
````
3. Собирите docker-образ проекта
````
docker build -t rest .
````
4. Запустите проект через docker-compose
````
docker-compose up
````
5. Приложение будет доступно по адресу: http://localhost:8080

## Методы
### Сотрудники
+ `POST /person` - создать сотрудника
+ `PUT /person` - обновить сотрудника
+ `GET /person` - получить всех сотрудников
+ `GET /person/{id}`- получить сотрудника по ID
+ `DELETE /person/{id}` - удалить сотрудника по ID

### Аккаунты сотрудников
+ `POST /employee` - создать аккаунт сотрудника
+ `PUT /employee` - обновить аккаунт сотрудника
+ `GET /employee` - получить аккаунты всех сотрудников
+ `DELETE /employee/{id}` - удалить аккаунт сотрудника по ID
