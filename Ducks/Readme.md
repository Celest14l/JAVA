Duck Behavior Simulator
Overview
This project demonstrates the Strategy Design Pattern in Java by simulating different types of ducks with interchangeable behaviors. The behaviors (flying, quacking, and swimming) are defined as interfaces, allowing them to be dynamically assigned to duck objects. Two duck types are implemented: MallardDuck (a real duck) and RubberDuck (a toy duck), each with distinct behaviors.

The project is written in Java and consists of abstract classes, interfaces, and concrete implementations to showcase object-oriented programming principles like inheritance, polymorphism, and encapsulation.

Features
Duck Types:
MallardDuck: Can fly, quack, and swim.
RubberDuck: Cannot fly, squeaks instead of quacking, and floats.
Behaviors:
Flying: CanFly (flies) and CanNotFly (cannot fly).
Quacking: Quack (normal quack) and Squeak (squeaky sound).
Swimming: Swimming (normal swimming) and Floating (remains afloat).
Dynamic Behavior Assignment: Behaviors can be changed at runtime using setter methods.
Project Structure
text

Collapse

Wrap

Copy
DuckBehaviorSimulator/
├── src/
│   ├── Duck.java               # Abstract base class for all ducks
│   ├── MallardDuck.java        # Concrete class for Mallard Duck
│   ├── RubberDuck.java         # Concrete class for Rubber Duck
│   ├── FlyBehaviour.java       # Interface for flying behavior
│   ├── CanFly.java             # Implementation of flying behavior
│   ├── CanNotFly.java          # Implementation of non-flying behavior
│   ├── QuackBehaviour.java     # Interface for quacking behavior
│   ├── Quack.java              # Implementation of quack sound
│   ├── Squeak.java             # Implementation of squeak sound
│   ├── SwimBehaviour.java      # Interface for swimming behavior
│   ├── Swimming.java           # Implementation of swimming behavior
│   ├── Floating.java           # Implementation of floating behavior
│   └── Main.java               # Main class to run the simulation
└── README.md                   # This file
Prerequisites
Java Development Kit (JDK): Version 8 or higher.
IDE (Optional): IntelliJ IDEA, Eclipse, or any Java-compatible IDE.
How to Run
Clone the Repository (if hosted):
bash

Collapse

Wrap

Copy
git clone <repository-url>
cd DuckBehaviorSimulator
Compile the Code:
bash

Collapse

Wrap

Copy
javac src/*.java
Run the Program:
bash

Collapse

Wrap

Copy
java -cp src Main
Alternatively, use an IDE:
Import the project into your IDE.
Run the Main class.
Sample Output
text

Collapse

Wrap

Copy
--------
I am a Mallard Duck
Quack Quack!!
I am swimming...
I am flying😁
--------
--------
I am Rubber Duck!!
Squeak Squeak!!
I remain afloat.....
I can not fly🙁
--------
Design Pattern Explanation
This project uses the Strategy Pattern to:

Define a family of algorithms (fly, quack, swim behaviors).
Encapsulate each algorithm in its own class.
Make algorithms interchangeable within the Duck class via composition.
The abstract Duck class delegates behavior execution to the respective behavior objects, allowing for flexibility and extensibility.