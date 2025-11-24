# MCF - API REST

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Online Demo](https://img.shields.io/badge/Live-Demo-blue)](https://lemxvos-mcf.onrender.com)


A simple Java REST API that provides various math and physics formulas and solves them for the client. It has a basic frontend with HTML+CSS+JS and a backend with Java+SpringBoot.

---

## 🌐 Live Demo

The API is online for tests on:

🔗 **https://lemxvos-mcf.onrender.com**

> Frontend is include so you can test endpoints, recipes, direct on your browser.
> Just change the base url to `https://lemxvos-mcf.onrender.com` if your base url are `http://localhost:8080`
---

## 🚀 Features

- REST API built with Spring Boot  
- Frontend client for testing (HTML, CSS, JS)

---

## 🧩 Project Structure
```
.
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/lemavos/mcf
│   │   │       ├── McfApplication.java
│   │   │       ├── controller
│   │   │       │   └── MathController.java
│   │   │       ├── web
│   │   │       │   └── WebController.java
│   │   │       └── services/mathUtils
│   │   │           ├── Bhaskara.java
│   │   │           ├── Factorial.java
│   │   │           ├── geometricSolids
│   │   │           │   ├── Cube.java
│   │   │           │   ├── Parallelepiped.java
│   │   │           │   ├── Sphere.java
│   │   │           │   └── TrapezoidalPrism.java
│   │   │           ├── pythagorasTheorem
│   │   │           │   ├── Hypotenuse.java
│   │   │           │   └── Leg.java
│   │   │           └── shapes
│   │   │               ├── Circle.java
│   │   │               ├── Diamond.java
│   │   │               ├── Rectangle.java
│   │   │               └── Square.java
│   │   └── resources
│   │   |   ├── application.properties
│   │   |   ├── static
│   │   |   |   ├── css
│   │   |   |   |   └── styles.css
│   │   |   |   ├── js
│   │   |   |   |   └── script.js
│   │   |   └── templates
│   │   |       └── index.html
│   └── test
│       └── java/com/lemavos/mcf/McfApplicationTests.java
├── target
│   ├── classes
│   ├── generated-sources
│   ├── maven-status
│   ├── mcf-0.0.1-SNAPSHOT.jar
│   └── test-classes
└── Dockerfile
```

---

## 🧑‍💻 Technologies Used

- `Java 17+`  
- `Spring Boot`  
- `Maven`  
- `HTML / CSS / JavaScript`

---

## ⚙️ Setup & Run

### On Linux, Windows and MacOS

1. Make sure Java 17+ is installed:
```
java --version
```

Clone the repository:
```
git clone https://github.com/lemavos/MCF-SpringBoot-Rest.git
cd ~/MCF-SpringBoot-Rest/target
```
Run the app:

```
java -jar mcf-x.x.x-SNAPSHOT.jar
```
Open the localhost on:
```
http://localhost:8080
```

📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

