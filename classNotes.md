[DontPad](http://dontpad.com/seniorgodev)
[Lecture Slides](http://dontpad.com/SeniorProway)
[SciHub](https://sci-hub.se/)

# Lecture 1 - Introductions to the course and to Scrum methodology. 

[Syllabus](https://docs.google.com/document/d/19-dlVDrPIym_2rkNCsoIf6mkorMVvGM4qlCDA6kr8H8/edit?usp=sharing).

	Grupo 4:
	- Marcelo
	- Willian K
	- Lorran
	- Gabriel 
	- Elton

# Lecture 2 - Version control

Groups:

```
Grupo 1 - JDK
- Samuel Levi
- Guilherme Ezequiel
- Tharlys
- Vitor Peres
- Enzo Moura
Slides: https://docs.google.com/presentation/d/19lHAb41k7ElHivkTvhJ7joR3LIipgxpT8hSBqnjrlL8/edit?usp=sharing

Grupo 2 - JVM
- Vitor André
- David W
- Lucas Grijo
- Jonata
- Thiago Luiz
Slides: https://docs.google.com/presentation/d/1ArbJ8XVmkUZeRodr3l7vfpCsT9eEr7_TjACf4Du3yxA/edit?usp=sharing

Grupo 3 - JRE
- Guilherme Eduardo
- Lucas Nunes
- Bruna
- Leonardo F.
- David H.
Slides: https://docs.google.com/presentation/d/11KvvryaK0NlOe4BytIzDUGNA_U9JkYfypRXKbjrYEZ4/edit?usp=sharing

Grupo 4 - JIT
- Marcelo
- Willian K
- Lorran
- Gabriel 
- Elton
Slides: https://docs.google.com/presentation/d/1F2gPMmFa3KbFyW4-7ZT_f6JearyrBoTbzCOL936p1xA/edit?usp=sharing

Grupo 5 - Java Bytecode
- Daniella Lira
- Vitor Gonçalves
- Lucas Ivan
- Bruno Marques
- Janaina Mai
Slides: https://docs.google.com/presentation/d/1oJwvzghCBF0r-kX4h2N5oUAKIsjfgVVCi2_cEfL--u8/edit?usp=sharing

Grupo 6 - Java SE / Java EE
- Sarah
- Sabrina
- Vanderlei
- Lucas W
- Leo Pereira
https://drive.google.com/file/d/1SA0reofxriofRSMvSJmFVXy9sJSrsiM9/view?usp=sharing
```
# Lecture 3 - Java and Requirements specification (IEEE 830)

[Pretty good Vim Cheatsheet](https://files.passeidireto.com/d9165dcc-aaaf-436b-a49c-5144904e9155/d9165dcc-aaaf-436b-a49c-5144904e9155.png)

[Another Vim cheatsheet](https://hamwaves.com/vim.tutorial/images/vim.tutorial.svg)

[Hackerspace Blumenau event - Flisol](https://www.hackerspaceblumenau.org/flisol/)

[Refactoring guru](https://refactoring.guru/)

[IEEE 830](https://sci-hub.se/10.1109/ieeestd.1998.88286)

What: Functional requirements, prioritary definition. User Stories.

How : Non-functional requirements.

* Functionality
* External Interfacing
* Performance
* Attributes
* Design constraints imposed on implementation

For planning User Stories, use the client language and aim for it be I.N.V.E.S.T. 
* Independent
* Negotiable
* Valuable
* Estimatable
* Small
* Testable

# Lecture 4 - Requirement specification and Java variables

[Team04 Trello - Work Time Management](https://trello.com/b/eOqMwjQf/seniorgodev-controle-de-ponto)

PRIMITIVE TYPES

 * byte 2^7
 * short 2^16
 * int 2^31
 * long 2^63

 * float 32bits
 * double 64bits

 * boolean = true/false
 * char = 'a'

NON-PRIMITIVES
 
 * Arrays [] = {term1, term2, term3}
 * String = "text"

## Primitive type conversion:

* From a higher type to lower is implicit

order : byte > short > int > long > float > double

ex:

	byte lowerVar = 1
	int higherVar = lowerVar

* From a lower type to higher it must be explicit (casting)

order: double > float > long > int > short > byte

ex:

	long higherVar = 1
	int lowerVar = (int) higherVar

# Lecture 5 - Java and Coding the Project 

* Selection loops (if, switch)
* Ternary operators
* Repetition loops (for, forEach, while, doWhile)
* Break and continue keywords
* Type conversion
* Methods
* Recursivity


- Coding the project.

# Lecture 6 - Test Driven Development

* Waterfall method: Project management focused on the whole. End-to-end. Steps must follow the same order, every time. Testing is only done right before implementation. At this time, it usually becomes too costly to fix the errors that originated in the previous steps.

* TDD: Test Driven Development. Every feature can be tested multiple times at multiple steps. Usually in an automated way.

## Types of tests:
* Unit testing - Test the minimum functional component.
* Interface testing - Tests the interaction between two components. Closer to unit testing, checks data-formats and basic interactions between systems.
* Integration testing - Or instrumentalized, tests large parts of the system together on an end-to-end way. Usually uses a bot to do the inputs for testing.
* Usability and acception tests - Tested by potential clients to assure non-functional components.
* Performance, stability and security tests

Costs from highest to lowest:

* Manual
* Integration
* API
* Interface
* Unit

Test quantity is inversely proportional to cost (So aim for few manual tests and a LOT of unit testing).

## Test Driven Development - steps

Testing first ideology!

![](https://www.whizlabs.com/wp-content/uploads/2016/04/TDD.png)

<img src="https://camo.githubusercontent.com/1ecf6454ca714393baa268987a98d3e4aefb0ef7ac21c513f0aff139d2bab8d1/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f636f6d6d6f6e732f302f30622f5444445f476c6f62616c5f4c6966656379636c652e706e67" width="800"/>

### Unit testing
* Smallest testable unit (method)
* Fast
* Automatable
* Independent
* Repeatable
* Easy to implement
* Kept for future use
* Click rule - No inputs from tester.

### Java docs
```
/**
* myFunc -  Description
*
* details, details, details
*
* @param name_a type description
* @param name_b type description
* @return type description
*/
public int myFunc(int name_a, int name_b){
    ...
}
```
# Lecture 7 - Sprint Review, Sprint Retrospective

[ScreentoGif - Windows tool](https://www.screentogif.com/)

<img src="https://www.visual-paradigm.com/servlet/editor-content/scrum/scrum-in-3-minutes/sites/7/2018/11/the-agile-scrum-framework-1.png"/>

## Sprint Planning

* What should be done this sprint;
* Estimate cost;

## Daily Stand up Meeting

Duration: ~15min

* What was done yesterday;
* What to do today;
* Difficulties;


## Sprint Review - Presenting results

Duration: ~1hr

* What was done;
* What wasn't done;
* What was added;
* What was removed;

## Sprint Retrospective - Looking back

Duration: ~1hr

* What went right;
* What went wrong;
* What have we learned;
* What to do differently and how;

Questions of note:

* What should we keep doing;
* What to do more;
* What should we start doing;
* What should not be done;
* What should be done less;

<img src="https://bryanmmathers.com/wp-content/uploads/2018/06/the-starfish-model.png" width="600"/>

# Lecture 8 - New Teams for Sprint 2, Object Oriented Programming - OOP

My new team: 6 - Vacation Management
* Daniella Lira
* Willian K.
* Bruna
* Jonata
* Leo Pereira

## Object Oriented Programming with Java

An Object is a representation of a concept, defined by its caracteristics, methods and properties. Objects are independent of other object instances.

The pillars of OOP:

* Abstraction
* Encapsulation
* Inheritance
* Polymorphism

### Abstraction

Isolating a determined aspect of a state with the goal of simplifying it's analysis, classification or communication. Solving a set of related problems regardless of values (eg: a+b instead of 2+2 in code)

* An abstract data does not consider aspects of the implementation, being responsible for defining a specific data type;
https://drive.google.com/file/d/1HEoEsMW45BxGrSetZDwDfzSafa98eGNW/view?usp=sharing 

## Classes

Abstraction focuses on: Identity, Attributes and Behaviors. In programming, thats represented by Classes. Classes can be understood as 'blueprints' from where objects are created (instanciated), an abstraction.

### Inheritance

# Lecture 9 - Sprint development

[Lecture](https://docs.google.com/presentation/d/1aiAtylecvORpbwhDvmJ_OeFxTekZHIamVBIwWpLdv1A/edit#slide=id.g6b98d5a515_0_29)

# Lecture 10 - OOP part 2

### Inheritance

Using the keyword "extends" we can inherit all vars and methods from a class.

In the child constructor, "super()" represents the parent's implementation.

To avoid inheritance, the keyword 'final' can be used. Final methods/classes cannot be inherited. The 'final' keyword can increase efficiency (compilation) and safety (critical classes are protected).

### Encapsulation

Provides access modifiers to methods and variables in a class. They are:

* default
* public
* private
* protected
* static
* final
* abstract

### Polimorphism

* Ad Hoc > Overloading and Coersion
* Universal > Parametric Subtyped

Overridden (Overloaded) methods are checked on compilation time and allow different behaviors for the same method.

* Generic type<T> : Represent a class that will use different/unspecified Classes/Types. The type variable T can be used anywhere in the class. 

When using the generic class the desired type can be specified. 

eg:
* Declare class TransportationMethod <T>
* Instantiate with TransportationMethod <Car> or TransportationMethod<Bike>


* Abstract classes: Cannot be instantiated, can be inherited. Not all methods are defined.

* Interfaces : Classes can have the keyword 'implements' to use Interfaces that are responsible for representing a completely abstract class; In other words, the class that implements the interface is responsible for defining the implementation of the Interface Methods

# Lecture 13 - Sprint execution ; Programming.

Preparing presentation for Sprint2; Merging branches;

![](https://trello-attachments.s3.amazonaws.com/607dec3f7d28ef0a5bc11283/1137x284/9b5a9aa071625e17f7d089b67f5bd307/image.png)

# Lecture 12 - Sprint Review and Retrospective 2

Learning from our mistakes: 

* Document first - Trello, JavaDocs, GoogleDocs
* Define class and constructor
* Prepare tests
* Code class methods

New Group Vacations Control:

- Guilherme Eduardo Bom Guse
- Janaina Mai
- Lucas Walin
- Thiago Luiz Barbieri
- Willian Kenji Nishizawa

# Lecture 13 - SOLID Programming Principles and Software Architecture
![](https://amitshahi.dev/static/500403c0fabdd69504307a79a5417fd9/be90f/solid.jpg)

* **S**ingle Responsability : Classes and Methods should focus on doing one thing well instead of several poorly;
* **O**pen/Closed Principle : Class is OPEN to be used, but CLOSED to be modified by others; Use Interfaces!
* **L**iskov Substitution Principle : Using a child class instead of the parent class in a function should be fine; Dont change the return type in child classes to keep this principle.
* **I**nterface Segregation : Data Interfaces between classes should be divided in small parts; A Class shouldn't need to define functions taht it doesn't need!
* **D**ependency Inversion Principle :  High-Level-Modules should not depend on Low-Level-Modules implementation detais, both should use Abstractions (Interfaces) and these abstractions should not depend on Details (concrete implementations);

Program focusing on Interfaces and Single Responsability, not in Inheritance so we can avoid using Generics <T>

## Model View Controller - MVC Architecture

![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh0NQKdspWr2txLb3FdjBTfFPC9n4R-Eeq3g&usqp=CAU)

* Model - Business Logic, Data, State
* View - UI Representation
* Controller - Coordinate the interactions between Model and View;

# Lecture 14 - Design Patterns

Dependencies can be of two types, a Class Dependency or a functional dependency, when we need to instantiate another class.

Injecting a dependency happens when the external class is called as an argument (either in the costructor or in a method), having been created outside the caller class.

A parametric injection is a method responsible for creating the external class, Java Anotations can do this. 

**To avoid having to call a specific class we can call ANY CLASS THAT HAS X INTERFACE. This makes our base class not depend on a low level abstraction (class) but a high level one (interface).**

In projects, Design patterns are solutions to:

* Purpose
* Motivation
* Class Structure
* Code examples

But it brings problems of:

* Wrong tool
* Dogma
* Wrong (programming) language

The Design Pattern Gang of Four: Authors of the Design Patters Elements of Reusable Object-Oriented Software.

Pattern classifications:

* Creational patterns: Object creation
* Structural patterns: Objects and Classes in larger structures - Acts where we are calling the class, not in the class itself.
* Behavioral patterns: Efficient communication and responsability assignment among objects.

[The Gang Of Four Project Patterns](https://refactoring.guru):

| Creational Patterns | Structural Patterns | Behavioral Patterns | 
| ------------------- | ------------------- | ------------------- |
| Singleton           | Decorator           | Chain of Responsability|
| Factory Builder     | Adapter             | Command             |
| Builder & Director  | Bridge              | Interpreter         |
| Prototype           | Composite           | Iterator            |
| Abstract Factory    | Facade              | Mediator            |
| ----                | Abstract Factory    | Memento             |
| ----                | ----                | Observer            |
| ----                |	----		    | State               |
| ----                | ----                | Stratedy            |
| ----                | ----                | Template Method     |
| ----                | ----                | Visitor             |


Looking at some patterns:

* Singleton: Garantees only one object is instantiated from the class. eg: The class has a instance of itself with a private constructor, but this instance can be accessed from outside. A database instance should usually be a Singleton.

* Factory: Create objects without specifying the concrete Classes. A factory class is an abstract class with methods to instantiate or remove other objects. It can aggregate creation methods of classes that have more in common than not, in other words, the factory has some methods that are defined, and some abstract to implement specific behavior.

* Builder: Instantiate complex objects in a set-by-step manner. Usually the Builder will be a Interface that sets the steps but expect the specific implementation from each class. Responsible for trating the data that will be thrown in the object constructor.

* Director: Responsible for calling Builders for different instantiations. Works as a "supervisor" to the Builder for different 'set models of objects' that are specified (via parameters) by the Director.

* Prototype: Copies objects without worrying about the types. Can be implemented with the use of a "Object" type and Reflections. Create object then it's abstractions. eg: A single "clone" method can clone any Class that implements the prototype interface.

* Decorator: Uses wrappers to add new functionalities to the objects. Used as a Class that implements Wrapees interfaces. Acts as a MiddleMan between the super class and the outside of the class. In its functions there is usually a call to the "super()" version of itself. Think of those russian dolls.

* DAO - Data Access Object: Not a Design Pattern but a Structural Pattern, it's a Middleman between controllers and DB, APIs, etc...  The Controller should never instantiate a Model, the DAO is the one responsible for granting it access to the data.

# Lecture 15 - Sprint Reviews and Retrospectives

New Group1 - Employee Register

- Vanderlei
- Guilherme Ezequiel
- David W
- Lucas Nunes
- Willian K

# Lecture 16 - Relational Database PostgreSQL

[Official PostgreSQL 13.2 Documentation](https://www.postgresql.org/files/documentation/pdf/13/postgresql-13-A4.pdf)

The first implementation of SQL was in 1973 with IBM's System R. The relational model came right after, in 1974 with Ingres - INteractive Graphics REtrieval System.

PostgreSQL came into existence as POSTQUEL in 1985 as a licenced software. The project was ended in 1994 in its 4.2 Version.

In 1995 Postgres95 returned as a Open Source Project, in 1997 it was renamed to PostgreSQL and it is still in development today, the PostgreSQL Version 13 being released in 2020.

## Relational Model - Architecture

* Table (Relations or entities)
* Register (Row or tuple)
* Column (Attribute)
* Key (Primary / Foreign - Identifier)

## Data Modelling

* Functional Dependency - Identify the unique Attribute/Column that defines the Register/Row and is unique in the Table.  eg. CPF number is a good key for a person, since its a unique identification.

* Normalization : Second Normal Form 2FN - Atomic attributes, a cell can only hold a single value.  1. Identify data that doesnt depend on the primary key -  2. create a new table for them.  eg. Instead of listing several phone numbers in a column inside the Person Table, create a new Phone Numbers table and reference it on the Person Table via a FK.

* Normalization: Third Normal Form 3FN - All the attributes in a table must be functionally independent from one another while being exclusively dependent on the primary key. 1. Identify dependent attributes, 2. Exclude dependent attributes.

* 
