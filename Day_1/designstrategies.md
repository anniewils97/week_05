# Question One

## Cohesion
Cohesion refers to how closely related the elements (functions or modules) within a software component are to each other in terms of their functionality. Basically, it measures how well a module is focused on a single, specific task. High cohesion is desirable because it indicates that a module is designed with a single, well-defined purpose and performs only that task. This makes the module more maintainable, understandable, and easier to modify.

## Coupling
Coupling describes the level of interdependence between modules or components within a software system. It measures how much one module relies on or is connected to other modules. Low coupling is desirable because it indicates that modules are loosely connected and can be modified or replaced with minimal impact on other parts of the system. High coupling, on the other hand, leads to a lack of flexibility, maintainability, and reusability.

### Summary
- Cohesion is like how much a group of friends hang out because they have similar interests. 
  - High cohesion means they all share one common interest and do stuff related to that. 
  - Low cohesion means they all have different interests, and their togetherness isn't because of one particular thing.
- Coupling is like how dependent friends are on each other. 
  - Low coupling means friends don't need each other much to have fun. They do their own thing. 
  - High coupling means they need each other a lot to have fun. If one friend isn't there, it's not as much fun.
- When making software, we want our "friend groups" (modules or parts of the software) to have high cohesion and low coupling. 
  - This means each part does its own thing really well, and they don't rely too much on each other. 
  - It's like having well-organized and independent groups of friends, which makes everything work better and easier to change.

# Question Two

## Top-Down Design
In a top-down approach, you start with the overall or high-level view of the system. You break down the system into smaller, more manageable subsystems or modules. These smaller modules are then further decomposed into even smaller components until you reach a level where each part is easy to design and implement. This approach is like starting with the big picture and gradually zooming in to the details. It's often used in the early planning and design phases to establish a clear structure for the system.

## Bottom-Up Design
In a bottom-up approach, you start with the smallest, most basic components of the system. You build these components first, and then you gradually combine them into larger and more complex subsystems. The process continues upward, with components being combined into increasingly larger parts of the system. This approach is like building from the ground up, starting with the basic building blocks and constructing the system piece by piece. It's often used when you have specific components that need to be integrated into a larger system.

## Function-Oriented Design
Function-oriented design is an approach that emphasizes organizing a system's design and architecture around its functions or tasks. It doesn't strictly align with either top-down or bottom-up design because it focuses on the logical functions that the system needs to perform. In this design approach, you identify the functions the system should fulfill and then organize the system's structure around these functions. The emphasis is on what the system needs to do and how different functions interact rather than on the order of building components. This approach is often used in situations where the system's functionality is the primary concern, and you want to ensure that the functions are well-defined, organized, and easy to maintain.

### Summary
- Top-Down Design is like planning a big event. You start with the main idea and break it into smaller tasks, then further into detailed steps until you have a detailed plan.
- Bottom-Up Design is like building with LEGO. You start with tiny pieces and put them together to create bigger structures. You keep adding more pieces to make your final creation.
- Function-Oriented Design means focusing on what a system needs to do. It doesn't care if you start from the top or bottom. It's about organizing a system based on its functions or tasks.

# Question Three

A class diagram is like a blueprint for designing software in a way that focuses on objects and how they work together. It's most useful when you're using a method that centers around this object-oriented approach. This diagram helps you plan what types of objects you'll use, what they can do, and how they're connected. It's like a map for developers to understand and build the software.

# Question Four

The four pillars of object-oriented programming (OOP) are:

1. **Encapsulation:** Like putting code in a secure box, exposing only what's necessary, making code organized and secure.
2. **Abstraction:** Think of it as simplifying complex reality by modeling classes based on what objects do, not how they do it.
3. **Inheritance:** It's like creating a family tree for classes, inheriting properties and behaviors, promoting code reuse.
4. **Polymorphism:** This is like one word having many meanings; it allows objects of different classes to be treated as one, making code flexible.

# Question Five

The **strategy pattern** is a design pattern in software development that allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. It enables clients to choose the appropriate algorithm at runtime, providing flexibility in algorithm selection without altering the source code extensively.

In an **object-oriented system**, the implementation of the strategy pattern typically involves defining a family of algorithms as separate classes, each implementing a common interface or base class. Clients can then switch between these algorithm classes without changing their code, as they interact with them through the shared interface or base class.

In a **functional system**, the implementation of the strategy pattern is somewhat different. Instead of defining classes, you define functions or lambda expressions representing the various algorithms. These functions can be passed as arguments to other functions or higher-order functions, allowing you to switch between strategies at runtime. The key difference is in the way algorithms are represented. In an object-oriented system, you use classes and interfaces, while in a functional system, you use functions or lambda expressions. The overall concept of encapsulating algorithms and making them interchangeable remains the same, but the implementation aligns with the programming paradigm used.

# Question Six

I'd choose Service-Oriented Architecture (SOA).

SOA is a design methodology that structures software as a collection of loosely coupled, reusable services. This approach aligns well with the goal of creating a versatile payment system, as it allows different services to be developed independently and integrated seamlessly into a variety of applications and sectors. Each service can handle specific payment-related tasks, making it adaptable for different use cases, whether it's ordering food, shopping for clothing, or any other sector.