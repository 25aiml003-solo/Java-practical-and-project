# MiniBank

Java 17+ console banking application based on the CEUE203 OOP practical sequence.

## Features
- Account creation
- Deposit, withdrawal and transfer
- Custom checked exceptions
- Generic Repository with @Id reflection
- Collections-based storage
- Serialization persistence
- Append-only transaction logging
- NIO end-of-day report
- Thread-safe Account operations
- ExecutorService transaction processor
- JUnit 5 test source

## Compile

From the MiniBank directory:

```text
javac -d out src/annotation/*.java src/exception/*.java src/model/*.java src/repository/*.java src/util/*.java src/concurrency/*.java src/service/*.java src/*.java
```

## Run

```text
java -cp out MiniBank
```

## Build JAR

```text
jar cfe minibank.jar MiniBank -C out .
```

Then:

```text
java -jar minibank.jar
```

Generated account data and reports are stored under `data/` and `report/`.
