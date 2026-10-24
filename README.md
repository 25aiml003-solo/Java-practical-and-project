# Java Practicals

A collection of Java practical exercises covering object-oriented programming, exceptions, collections, file handling, concurrency, and related Java concepts. The repository also includes a **MiniBank** console application.

## Repository Structure

- `Practical-1/` — Rock-Paper-Scissors-Lizard-Spock, toll booth, and vending machine examples.
- `Practical-2/` — Cinema show, parking lot, and thermostat examples.
- `Practical-3/` — Point, card, and fraction exercises, organized into subfolders.
- `Practical-4/` — Password checking, chat filtering, and template filling.
- `Practical-5/` — Library fee, payroll, and shape-area applications.
- `Practical-6/` — Discount engine, notification, and remote-control examples.
- `Practical-7/` — Column mapping, form validation, and a mini test runner.
- `Practical-8/` — `AutoCloseable`, guarded calculator, and stock issue examples.
- `Practical-9/` — Race-condition and thread-safety exercises.
- `Practical-10/` — Deadlock, producer-consumer, and thread-pool examples.
- `MiniBank/` — A console banking application with account operations, custom exceptions, persistence, transaction logging, reporting, concurrency, and JUnit 5 test source.
- `Word-File/` — Supporting practical documents, if included.

## Requirements

- Java Development Kit (JDK) installed. **JDK 17 or later** is recommended, particularly for MiniBank.
- A terminal or command prompt, or an IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java support.

Check your Java installation:

```bash
java -version
javac -version
```

## Compile and Run a Practical

Each practical is a separate exercise. Open a terminal in the directory containing the relevant `.java` file.

For a single Java file:

```bash
javac Example.java
java Example
```

Replace `Example.java` with the source filename and `Example` with the class containing `public static void main(String[] args)`. If a practical contains multiple source files or subfolders, compile the related files together and run the class that contains the `main` method. Some exercises may require compiling from their own directory to preserve their expected file paths.

## MiniBank

From the `MiniBank/` directory, compile the application sources:

```bash
javac -d out src/annotation/*.java src/exception/*.java src/model/*.java src/repository/*.java src/util/*.java src/concurrency/*.java src/service/*.java src/*.java
```

Run the application:

```bash
java -cp out MiniBank
```

To package the compiled application into an executable JAR:

```bash
jar cfe minibank.jar MiniBank -C out .
java -jar minibank.jar
```

MiniBank stores account data and transaction logs in its `data/` directory and generates reports in `report/`. Run it in a writable directory so these files can be created or updated.

## Notes

- The repository contains `.class` files for some practicals. You can generally recompile from the `.java` source files using your installed JDK.
- Do not commit generated output, personal data, or real banking information to version control.
- The MiniBank JUnit 5 test source and standalone JUnit console JAR are included in the project; test execution may require a separate compile/run command depending on the JDK and environment.

## Purpose

These practicals are intended for learning and practice. Review the code, compile each exercise, try different inputs, and modify the examples to strengthen your understanding of Java.
