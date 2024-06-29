# Password Generator API

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/gabrieudev/)
![GPL License](https://img.shields.io/badge/License-GPL-blue)

Welcome to my **Password Generator API** project.

Please select your preferred language:

- [English](README.md)
- [Português (Brasil)](README.pt-br.md)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Contributions](#contributions)
- [Contact](#contact)

## Introduction

The project was created to provide an API that can be consumed by any system that needs to generate secure and random passwords.

## Features

- POST method with password criteria.
- Viewing the generated password.
- Documentation with Swagger.

## Technologies

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Programming language.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework used for building applications.

## Getting Started

Follow these steps to run the project on your machine:

1. Clone the repository: `git clone https://github.com/gabrieudev/password-generator.git`
2. Navigate to the project directory: `cd <path>`
3. Build the application: `./mvnw clean install` (for Windows: `mvnw.cmd clean install`)
4. Run the application: `./mvnw spring-boot:run` (for Windows: `mvnw.cmd spring-boot:run`)

## Endpoints

- `POST /generate`: Generates a random password according to the criteria in the request body.

Access the documentation at the endpoint `/swagger-ui.html`

## Contributions

Contributions are very welcome! If you want to contribute, fork the repository and create a pull request.

## Contact

If you have any suggestions or questions, contact me on [LinkedIn](https://www.linkedin.com/in/gabrieudev/)

---

**License:** This project is licensed under the terms of the [GNU General Public License (GPL)](LICENSE).