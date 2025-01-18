# Clean Architecture in Java Tutorial

https://www.linkedin.com/advice/1/what-differences-between-clean-hexagonal-software-1sg5e#:~:text=While%20both%20prioritize%20maintainability%20and,adapters%20to%20be%20plugged%20in.&text=Clean%20Architecture%2C%20introduced%20by%20Robert,into%20layers%20with%20clear%20dependencies.

All  Engineering  Computer Science
What are the differences between clean and hexagonal software architecture?
Powered by AI and the LinkedIn community
1
Clean architecture
2
Hexagonal architecture
3
Differences and similarities
4
Examples and tips
5
Benefits and challenges
6
Here’s what else to consider
Top experts in this article
Selected by the community from 4 contributions. Learn more
Member profile image
Teguh Sutanto
Software Developer | IT Project Management, IT Projects
View contribution

2
Member profile image
Mozammil Rizwan
Hyper Automation | Azure AI Services | Business Intelligence | OCR | Document Processing | GenAI | ERP, CRM, HCM, EDI…
View contribution

1


See what others are saying
1
Clean architecture
Clean architecture is a style that aims to achieve high levels of modularity, testability, and independence from frameworks and databases. It is based on the idea of separating the software into concentric layers, each with a specific responsibility and dependency rule. The innermost layer is the domain, which contains the business logic and entities. The outer layers are the application, which defines the use cases and interacts with the domain, the interface, which provides the input and output channels for the application, and the infrastructure, which implements the external dependencies such as databases and frameworks. By following this structure, you can isolate the core logic from the details and make your code more readable, maintainable, and adaptable.

Contributor profile photo
Mozammil Rizwan
Follow
Hyper Automation | Azure AI Services | Business Intelligence | OCR | Document Processing | GenAI | ERP, CRM, HCM, EDI, SCM, E-Commerce, Healthcare Automation Specialist


Clean Architecture, proposed by Robert C. Martin, emphasizes the separation of concerns with concentric layers (Entities, Use Cases, Interface Adapters, and Frameworks) for flexibility and testability. Hexagonal Architecture, also known as Ports and Adapters, focuses on isolating core business logic from external dependencies, promoting a hexagonal shape with ports for interaction. While both prioritize maintainability and testability, Clean Architecture has distinct layers, and Hexagonal Architecture centers on ports for communication, allowing adapters to be plugged in.

…see more

1
Contributor profile photo
Mozammil Rizwan
Follow
Hyper Automation | Azure AI Services | Business Intelligence | OCR | Document Processing | GenAI | ERP, CRM, HCM, EDI, SCM, E-Commerce, Healthcare Automation Specialist


Clean Architecture, introduced by Robert C. Martin, emphasizes separating concerns into layers with clear dependencies. It prioritizes dependency inversion and testability. On the other hand, Hexagonal Architecture, also known as Ports and Adapters, focuses on application ports for interactions and adapters for external systems. While Clean Architecture provides a broader guideline, Hexagonal Architecture specifically highlights the importance of isolating application logic from external dependencies through adapters, fostering flexibility and maintainability.

…see more

1
2
Hexagonal architecture
Hexagonal architecture is another style that focuses on decoupling the core logic from the external dependencies. It is based on the metaphor of a hexagon, where each side represents a port that can connect to an adapter. The ports are the interfaces that define the input and output operations for the core logic, which is located inside the hexagon. The adapters are the implementations that connect the ports to the external systems, such as databases, web services, or user interfaces. By using this approach, you can swap the adapters without affecting the core logic and test it independently from the infrastructure. You can also design your system as a network of hexagons, each with its own responsibility and communication protocol.

Contributor profile photo
Teguh Sutanto
Follow
Software Developer | IT Project Management, IT Projects


For example in messaging application, the core (hexagon) orchestrates message handling. Ports, interfaces defining crucial functionalities like message storage and notifications, include MessageRepository and NotificationService. Adapters implement these ports: DatabaseAdapter for storing messages and EmailNotificationAdapter for notifications. Such flexibility, a hallmark of hexagonal architecture, enhances maintainability and allows for efficient testing by substituting adapters with mocks during testing phases.

…see more

1
3
Differences and similarities
Both clean and hexagonal architectures share some common goals and principles, such as separating the concerns, enforcing the dependency inversion, and enabling the testability of the software. However, they also have some differences in terms of terminology, granularity, and flexibility. For example, clean architecture uses more specific names for the layers, such as domain and application, while hexagonal architecture uses more generic names, such as ports and adapters. Clean architecture also defines a strict hierarchy of dependencies, where the inner layers cannot depend on the outer layers, while hexagonal architecture allows more freedom in choosing the direction of the dependencies, as long as they are inverted. Moreover, clean architecture prescribes a fixed number of layers, while hexagonal architecture allows you to create as many hexagons as you need.





[![Build](https://github.com/SvenWoltmann/hexagonal-architecture-java/actions/workflows/build.yml/badge.svg)](https://github.com/SvenWoltmann/hexagonal-architecture-java/actions/workflows/build.yml)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=SvenWoltmann_hexagonal-architecture-java&metric=coverage)](https://sonarcloud.io/dashboard?id=SvenWoltmann_hexagonal-architecture-java)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=SvenWoltmann_hexagonal-architecture-java&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=SvenWoltmann_hexagonal-architecture-java)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=SvenWoltmann_hexagonal-architecture-java&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=SvenWoltmann_hexagonal-architecture-java)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=SvenWoltmann_hexagonal-architecture-java&metric=security_rating)](https://sonarcloud.io/dashboard?id=SvenWoltmann_hexagonal-architecture-java)

This repository contains a sample Java REST application implemented according to hexagonal architecture.

It is part of the HappyCoders tutorial series on Clean Architecture:
* [Part 1: Clean Architecture - What Is It? Why Should You Use It?](https://www.happycoders.eu/software-craftsmanship/hexagonal-architecture/).
* [Part 2: Clean Architecture with Java - Tutorial](https://www.happycoders.eu/software-craftsmanship/hexagonal-architecture-java/).
* [Part 3: Ports and Adapters Java Tutorial: Adding a Database Adapter](https://www.happycoders.eu/software-craftsmanship/ports-and-adapters-java-tutorial-db/).
* [Part 4: Clean Architecture with Quarkus - Tutorial](https://www.happycoders.eu/software-craftsmanship/hexagonal-architecture-quarkus/).
* [Part 5: Clean Architecture with Spring Boot - Tutorial](https://www.happycoders.eu/software-craftsmanship/hexagonal-architecture-spring-boot/).

# Branches

## `main`

In the `main` branch, you'll find the application implemented without an application framework. It's only using:
* [RESTEasy](https://resteasy.dev/) (implementing [Jakarta RESTful Web Services](https://jakarta.ee/specifications/restful-ws/)),
* [Hibernate](https://hibernate.org/) (implementing [Jakarta Persistence API](https://jakarta.ee/specifications/persistence/)), and
* [Undertow](https://undertow.io/) as a lightweight web server.

## `without-jpa-adapters`

In the `without-jpa-adapters` branch, you'll find the application implemented without an application framework and without JPA adapters. It's only using RESTEasy and Undertow.

## `with-quarkus`

In the `with-quarkus` branch, you'll find an implementation using [Quarkus](https://quarkus.io/) as application framework.

## `with-spring`

In the `with-quarkus` branch, you'll find an implementation using [Spring](https://spring.io/) as application framework.

# Architecture Overview

The source code is separated into four modules:
* `model` - contains the domain model
* `application` - contains the domain services and the ports of the hexagon
* `adapters` - contains the REST, in-memory and JPA adapters
* `boostrap` - contains the configuration and bootstrapping logic

The following diagram shows the hexagonal architecture of the application along with the source code modules:

![Clean Architecture Modules](doc/hexagonal-architecture-modules.png)

The `model` module is not represented as a hexagon because it is not defined by the Clean Architecture. Clean Architecture leaves open what happens inside the application hexagon. 

# How to Run the Application

The easiest way to run the application is to start the `main` method of the `Launcher` class (you'll find it in the `boostrap` module) from your IDE.

You can use one of the following VM options to select a persistence mechanism:

* `-Dpersistence=inmemory` to select the in-memory persistence option (default)
* `-Dpersistence=mysql` to select the MySQL option

If you selected the MySQL option, you will need a running MySQL database. The easiest way to start one is to use the following Docker command:

```shell
docker run --name hexagon-mysql -d -p3306:3306 \
    -e MYSQL_DATABASE=shop -e MYSQL_ROOT_PASSWORD=test mysql:8.1
```

The connection parameters for the database are hardcoded in `RestEasyUndertowShopApplication.initMySqlAdapter()`. If you are using the Docker container as described above, you can leave the connection parameters as they are. Otherwise, you may need to adjust them.


# Example Curl Commands

The following `curl` commands assume that you have installed `jq`, a tool for pretty-printing JSON strings.

## Find Products

The following queries return one and two results, respectively:

```shell
curl localhost:8080/products/?query=plastic | jq
curl localhost:8080/products/?query=monitor | jq
```

The response of the second query looks like this:
```json
[
  {
    "id": "K3SR7PBX",
    "name": "27-Inch Curved Computer Monitor",
    "price": {
      "currency": "EUR",
      "amount": 159.99
    },
    "itemsInStock": 24081
  },
  {
    "id": "Q3W43CNC",
    "name": "Dual Monitor Desk Mount",
    "price": {
      "currency": "EUR",
      "amount": 119.9
    },
    "itemsInStock": 1079
  }
]
```

## Get a Cart

To show the cart of user 61157 (this cart is empty when you begin):

```shell
curl localhost:8080/carts/61157 | jq
```

The response should look like this:

```json
{
  "lineItems": [],
  "numberOfItems": 0,
  "subTotal": null
}
```

## Adding Products to a Cart

Each of the following commands adds a product to the cart and returns the contents of the cart after the product is added (note that on Windows, you have to replace the single quotes with double quotes):

```shell
curl -X POST 'localhost:8080/carts/61157/line-items?productId=TTKQ8NJZ&quantity=20' | jq
curl -X POST 'localhost:8080/carts/61157/line-items?productId=K3SR7PBX&quantity=2' | jq
curl -X POST 'localhost:8080/carts/61157/line-items?productId=Q3W43CNC&quantity=1' | jq
curl -X POST 'localhost:8080/carts/61157/line-items?productId=WM3BPG3E&quantity=3' | jq
```

After executing two of the four commands, you can see that the cart contains the two products. You also see the total number of items and the sub-total:

```json
{
  "lineItems": [
    {
      "productId": "TTKQ8NJZ",
      "productName": "Plastic Sheeting",
      "price": {
        "currency": "EUR",
        "amount": 42.99
      },
      "quantity": 20
    },
    {
      "productId": "K3SR7PBX",
      "productName": "27-Inch Curved Computer Monitor",
      "price": {
        "currency": "EUR",
        "amount": 159.99
      },
      "quantity": 2
    }
  ],
  "numberOfItems": 22,
  "subTotal": {
    "currency": "EUR",
    "amount": 1179.78
  }
}
```

This will increase the number of plastic sheetings to 40:
```shell
curl -X POST 'localhost:8080/carts/61157/line-items?productId=TTKQ8NJZ&quantity=20' | jq
```

### Producing an Error Message

Trying to add another 20 plastic sheetings will result in error message saying that there are only 55 items in stock:

```shell
curl -X POST 'localhost:8080/carts/61157/line-items?productId=TTKQ8NJZ&quantity=20' | jq
```

This is how the error response looks like:
```json
{
  "httpStatus": 400,
  "errorMessage": "Only 55 items in stock"
}
```

## Emptying the Cart

To empty the cart, send a DELETE command to its URL:

```shell
curl -X DELETE localhost:8080/carts/61157
```

To verify it's empty:
```shell
curl localhost:8080/carts/61157 | jq
```

You'll see an empty cart again.

## <br>Additional Resources

### <br>Java Versions PDF Cheat Sheet

**Stay up-to-date** with the latest Java features with [this PDF Cheat Sheet](https://www.happycoders.eu/java-versions/)!

[<img src="/img/Java_Versions_PDF_Cheat_Sheet_Mockup_936.png" alt="Java Versions PDF Cheat Sheet Mockup" style="width: 468px; max-width: 100%;">](https://www.happycoders.eu/java-versions/)

* Avoid lengthy research with this **concise overview of all Java versions up to Java 23**.
* **Discover the innovative features** of each new Java version, summarized on a single page.
* **Impress your team** with your up-to-date knowledge of the latest Java version.

👉 [Download the Java Versions PDF](https://www.happycoders.eu/java-versions/)<br>

_(Hier geht's zur deutschen Version &rarr; [Java-Versionen PDF](https://www.happycoders.eu/de/java-versionen/))_


### <br>The Big O Cheat Sheet

With this [1-page PDF cheat sheet](https://www.happycoders.eu/big-o-cheat-sheet/), you'll always have the **7 most important complexity classes** at a glance.

[<img src="/img/big-o-cheat-sheet-pdf-en-transp_936.png" alt="Big O PDF Cheat Sheet Mockup" style="width: 468px; max-width: 100%;">](https://www.happycoders.eu/big-o-cheat-sheet/)

* **Always choose the most efficient data structures** and thus increase the performance of your applications.
* **Be prepared for technical interviews** and confidently present your algorithm knowledge.
* **Become a sought-after problem solver** and be known for systematically tackling complex problems.

👉 [Download the Big O Cheat Sheet](https://www.happycoders.eu/big-o-cheat-sheet/)<br>

_(Hier geht's zur deutschen Version &rarr; [O-Notation Cheat Sheet](https://www.happycoders.eu/de/o-notation-cheat-sheet/))_


### <br>HappyCoders Newsletter
👉 Want to level up your Java skills?
Sign up for the [HappyCoders newsletter](http://www.happycoders.eu/newsletter/) and get regular tips on programming, algorithms, and data structures!

_(Hier geht's zur deutschen Version &rarr; [HappyCoders-Newsletter deutsch](https://www.happycoders.eu/de/newsletter/))_


### <br>🇩🇪 An alle Java-Programmierer, die durch fundierte Kenntnisse über Datenstrukturen besseren Code schreiben wollen

Trage dich jetzt auf die [Warteliste](https://www.happycoders.eu/de/mastering-data-structures-warteliste/) von „Mastering Data Structures in Java“ ein, und erhalte das beste Angebot!

[<img src="/img/mastering-data-structures-product-mockup-cropped-1600.png" alt="Mastering Data Structures Mockup" style="width: 640px; max-width: 100%;">](https://www.happycoders.eu/de/mastering-data-structures-warteliste/)

👉 [Zur Warteliste](https://www.happycoders.eu/de/mastering-data-structures-warteliste/)
