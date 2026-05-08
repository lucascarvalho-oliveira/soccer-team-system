<p align="center">
  <a href="../README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Football Team Manager

System developed in Java for football team management, allowing registration, search, and removal of teams and players using `.txt` file persistence.

## Features

- Team registration
- Player registration
- Team search by identifier
- Team removal
- File data persistence
- Business rule validations
- Object-Oriented Programming (OOP)

---

## Project Structure

```text
src/
├── app
│   └── Main.java
├── bo
│   └── TimeBo.java
├── dao
│   └── TimeDao.java
├── model
│   ├── Time.java
│   ├── Jogador.java
│   ├── Atacante.java
│   └── Goleiro.java
```

---

## Technologies Used

- Java
- IntelliJ IDEA
- Object-Oriented Programming
- File manipulation
- Collections (`Map`, `List`)
- Exception handling

---

## Applied Concepts

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Layer separation (`DAO`, `BO`, `MODEL`)
- Text file persistence
- Repetition and decision structures
- Collection manipulation

---

## How to Run

### Requirements

- JDK 17+ installed
- IntelliJ IDEA or another Java IDE

### Clone Repository

```bash
git clone <URL_DO_REPOSITORIO>
```

### Run

1. Open the project in the IDE
2. Run the class:

```text
Main.java
```

---

## Usage Example

```text
1 - Adicionar time
2 - Consultar por identificador
3 - Remover time
4 - Sair
```

---

## Persistence Structure

Data is stored in the file:

```text
Time.txt
```

Format used:

```text
id;nomeTime;tipoJogador;nome;data;numero|
```

---

## Future Improvements

- Graphical interface
- Database integration
- Team update system
- Advanced data validation
- REST API with Spring Boot
- Persistence with MySQL/PostgreSQL

---

## Author

Lucas Carvalho

GitHub:
https://github.com/lucascarvalho-oliveira
