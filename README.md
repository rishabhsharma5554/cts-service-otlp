
# CTS Service
CTS Service is designed to generate traces, metrics, and logs and push them to an OTLP Collector. The OTLP Collector then forwards the collected data to Kafka topics for further processing and analysis.

## Features

- Generates traces, metrics, and logs.
- Pushes data to the OTLP Collector.
- The OTLP Collector sends the data to Kafka topics.


## Tech Stack

- Java 17
- Spring Boot
- OpenTelemetry (OTLP Protocol)
- Kafka
- Docker & Docker Compose


## Installation

Docker Setup

```bash
  docker-compose up -d
```

This setup includes:
- OTLP Collector to receive traces, metrics, and logs.
- Kafka for message streaming.
- Zookeeper for managing Kafka brokers.
- Kafka UI to monitor Kafka topics.
    
## Configuration

ConfigurationUpdate the application.yml or application.properties file to configure:
- OTLP Collector endpoint
- Kafka topics and brokers
- Logging and monitoring settings

## How It Works
- The service collects traces, metrics, and logs.
- It sends this data to the configured OTLP Collector.
- The OTLP Collector forwards the data to Kafka topics.

### Contributing

Contributions are welcome! Feel free to submit pull requests or raise issues.