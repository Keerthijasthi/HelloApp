Here’s a complete README.md file for Spring Boot + Dockerized Kafka project:

⸻
# Spring Boot + Kafka (Docker) Integration

This project demonstrates how to integrate a
*Spring Boot REST API* with *Apache Kafka running in Docker*.
The API allows you to send messages to a Kafka topic using a simple HTTP POST request using Postman.

---

##  Technologies Used in this project

- Spring Boot
- Maven build tool
- Apache Kafka
- Docker & Docker Compose
- Postman for testing
- Java 21


## Project Structure

├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── HelloApp/
│       │               ├── HelloAppApplication.java
│       │               ├── controller/
│       │               │   └── HelloController.java
│       │               └── kafka/
│       │                   ├── KafkaConsumerService.java
│       │                   └── KafkaProducerService.java
│       │
│       └── resources/
│           ├── application.properties
├── docker-compose.yml                            # Kafka + Zookeeper Docker setup




---

## Kafka Setup Using Docker

### 1. Start Kafka with Docker Compose

```bash
docker-compose up

This launches:
	•	Zookeeper on port 2181
	•	Kafka Broker on port 9092

Kafka is accessible at: localhost:9092

⸻

- > Spring Boot application will be run on server port : 8090



Send Message to Kafka

API Endpoint
	•	URL: POST http://localhost:8090/poc/publish
