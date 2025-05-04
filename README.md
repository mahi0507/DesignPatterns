Here’s a brief summary of the three main categories of design patterns—**Creational**, **Structural**, and **Behavioral**—with examples for each:

### 1. **Creational Design Patterns**

These patterns deal with object creation mechanisms. They help create objects in a manner suitable to the situation.

* **Singleton**: Ensures that a class has only one instance and provides a global point of access to it.

  * **Example**: Database connection object that you want to ensure is only created once.

* **Factory Method**: Defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created.

  * **Example**: A `ShapeFactory` class that returns different shapes (`Circle`, `Rectangle`) depending on the input.

* **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

  * **Example**: A UI toolkit where a `GUIFactory` could return `WindowsButton` or `MacButton` based on the OS.

* **Builder**: Allows you to construct complex objects step by step. It provides a way to create an object without exposing the object creation logic to the client.

  * **Example**: Building a `Car` object with specific parts (engine, wheels, seats) rather than passing all arguments in one constructor.

* **Prototype**: Allows cloning of objects, even complex ones, without making the client know the internal details of the object.

  * **Example**: A cloning mechanism where a `Prototype` object can be cloned to create new objects.

---

### 2. **Structural Design Patterns**

These patterns deal with how objects are composed to form larger structures.

* **Adapter**: Allows incompatible interfaces to work together by converting one interface to another.

  * **Example**: Integrating a legacy payment system with a new system via an adapter.

* **Bridge**: Decouples an abstraction from its implementation, allowing both to vary independently.

  * **Example**: A remote control system that can work with different types of devices (TV, fan, etc.).

* **Composite**: Composes objects into tree-like structures to represent part-whole hierarchies. Allows you to treat individual objects and compositions uniformly.

  * **Example**: A company structure where employees and managers are both treated as part of the same hierarchy.

* **Decorator**: Adds new functionality to an object dynamically without altering its structure.

  * **Example**: Adding functionalities to a basic coffee object, such as adding milk or sugar.

* **Facade**: Provides a simplified interface to a complex system of classes.

  * **Example**: A payment system that hides the complexity of multiple APIs (payment gateway, fraud detection) behind a single interface.

* **Flyweight**: Reduces the number of objects created by sharing common data among similar objects.

  * **Example**: A game where multiple instances of the same object, like trees, are created with shared properties to save memory.

* **Proxy**: Provides a surrogate or placeholder for another object to control access to it.

  * **Example**: Using a proxy for a remote server call to delay the actual request until needed.

---

### 3. **Behavioral Design Patterns**

These patterns focus on communication between objects.

* **Chain of Responsibility**: Allows multiple handlers to process a request, without the sender needing to know which handler will process it.

  * **Example**: A support system where a ticket can be passed along various support levels (first-level support, technical support, etc.) for resolution.

* **Command**: Encapsulates a request as an object, allowing parameterization of clients with different requests, queuing of requests, and logging.

  * **Example**: A GUI button press that triggers a specific command like `SaveCommand` or `DeleteCommand`.

* **Interpreter**: Implements an expression interface to interpret sentences in a language.

  * **Example**: A simple calculator that interprets expressions like `1 + 2` and returns the result
