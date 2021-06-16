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

# Lecture 16 - Relational Database PostgreSQL - Structured Query Language

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

# Lecture 17 - PostgreSQL, PgAdmin4 and Database Modelling

Senior Sistemas visitor: 

HCM Development Coordinator - Silvana Aparecida Da Silva <silvana.silva@senior.com.br>

[Classifying SQL Statements](https://www.geeksforgeeks.org/sql-ddl-dql-dml-dcl-tcl-commands/)

[PostgreSQL Introduction](https://www.edureka.co/blog/postgresql-tutorial)

<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190826175059/Types-of-SQL-Commands.jpg" width="666"/>

## Verbs

* SELECT
* INSERT
* UPDATE - Updates records. Data **Manipulation** Language
* DELETE
* CREATE
* ALTER - Add, Delete or Modify the attributes of a Table. Data **Definition** Language
* DROP - Not reversible data destruction
* GRANT - User permissions
* REVOKE - User Permissions
* COMMIT
* ROLLBACK

## Clauses

* FROM
* WHERE - Query criteria
* GROUP BY - Groups rows that have the same values into summary rows
* HAVING - Was added to SQL because the WHERE keyword cannot be used with aggregate functions. Checks for a *condition*.
* ORDER BY - Sort the result-set in ascending or descending order.
* DISTINCT - Return only distinct (different) values.

## Logic Operators

* AND
* OR
* NOT

## Comparison Operators

* >, >=, <, <=
* <>, =
* BETWEEN - Selects values within a given range.
* LIKE - Used in a WHERE clause to search for a specified pattern in a column.
* IN -  Specify multiple values in a WHERE clause.

## Agregation on a property

* AVG
* COUNT
* SUM
* MAX
* MIN

# Lecture 18 - Maven and Dependencies

Apache [Maven](https://maven.apache.org/) is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

[Common Maven Commands](http://tutorials.jenkov.com/maven/maven-commands.html)

Every dependency in Maven can be set to specific "scopes", like test / development / etc , in order to make the build process cleaner.

Dependency scope is used to limit the transitivity of a dependency and to determine when a dependency is included in a classpath.

There are 6 [scopes](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html):

* compile : This is the default scope, used if none is specified. Compile dependencies are available in all classpaths of a project. Furthermore, those dependencies are propagated to dependent projects.

* provided: This is much like compile, but indicates you expect the JDK or a container to provide the dependency at runtime. For example, when building a web application for the Java Enterprise Edition, you would set the dependency on the Servlet API and related Java EE APIs to scope provided because the web container provides those classes. A dependency with this scope is added to the classpath used for compilation and test, but not the runtime classpath. It is not transitive.

* runtime : This scope indicates that the dependency is not required for compilation, but is for execution. Maven includes a dependency with this scope in the runtime and test classpaths, but not the compile classpath.

* test : This scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases. This scope is not transitive. Typically this scope is used for test libraries such as JUnit and Mockito. It is also used for non-test libraries such as Apache Commons IO if those libraries are used in unit tests (src/test/java) but not in the model code (src/main/java).

* system : This scope is similar to provided except that you have to provide the JAR which contains it explicitly. The artifact is always available and is not looked up in a repository.

* import : This scope is only supported on a dependency of type pom in the <dependencyManagement> section. It indicates the dependency is to be replaced with the effective list of dependencies in the specified POM's <dependencyManagement> section. Since they are replaced, dependencies with a scope of import do not actually participate in limiting the transitivity of a dependency.

## JDBC - Java Database Connectivity 

Java Database Connectivity (JDBC) is an application programming interface (API) for the programming language Java, which defines how a client may access a database. It is a Java-based data access technology used for Java database connectivity. It is part of the Java Standard Edition platform, from Oracle Corporation. It provides methods to query and update data in a database, and is oriented toward relational databases. A JDBC-to-ODBC bridge enables connections to any ODBC-accessible data source in the Java virtual machine (JVM) host environment.

# Lecture 19 - Finishing up Databases with JDBC and DAOs

* Remember to apply TDD, it will help when distributing tasks amongst team members.

# Lecture 20 - Presentations and Senior Guests

From HCM, DeBarba (architect) and Rafael de Souza (manager).

# Lecture 21 - End of presentations and new sprint.

New Group02 - Job Positions and Salaries

* Sarah
* Enzo Moura
* Lucas Ivan
* Willian K
* Janaina Mai

# Lecture 22 - Reviewing Design Patterns and TDD - Live coding

[Versioning](semver.org)

[Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)

[Writing regex expressions](https://www.geeksforgeeks.org/write-regular-expressions/)

[Creating and Testing regexes Online](www.regex101.com)

* Better documentation with @link and @see to reference other classes.

* Set encoding to UTF-8 so git doesnt break special characters.

* Private methods dont usually need documentation.

# Lecture 23 - Live coding

# Lecture 24 - Again

# Lecture 25 - Hibernate

Hibernate is a Java ORM library that implements the JPA specification.

Hibernate takes care of the mapping from Java classes to database tables, and from Java data types to SQL data types. In addition, it provides data query and retrieval facilities. It can significantly reduce development time otherwise spent with manual data handling in SQL and JDBC. 

Packages:

* hibernate-core :
The main (core) Hibernate module. Defines its ORM features and APIs as well as the various integration SPIs.

* hibernate-envers : 
Hibernate’s historical entity versioning feature

* hibernate-spatial :
Hibernate’s Spatial/GIS data-type support

* hibernate-osgi :
Hibernate support for running in OSGi containers.

* hibernate-agroal :
Integrates the Agroal connection pooling library into Hibernate

* hibernate-c3p0 :
Integrates the C3P0 connection pooling library into Hibernate

* hibernate-hikaricp :
Integrates the HikariCP connection pooling library into Hibernate

* hibernate-vibur :
Integrates the Vibur DBCP connection pooling library into Hibernate

* hibernate-proxool :
Integrates the Proxool connection pooling library into Hibernate

* hibernate-jcache :
Integrates the JCache caching specification into Hibernate, enabling any compliant implementation to become a second-level cache provider.

* hibernate-ehcache :
Integrates the Ehcache caching library into Hibernate as a second-level cache provider.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/Untitled-66.png" width="666"/>

## ORM - Object Relational Management

The ORM is a layer responsible for managing the communication between the Database and the Data Access Layer.

The term Object/Relational Mapping refers to the technique of mapping data between an object model representation to a relational data model representation.

![](https://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/images/architecture/data_access_layers.svg)

<img src="https://media.geeksforgeeks.org/wp-content/uploads/HBArchi.png" width="666"/>

## JPA - Java Persistence API

Java specification for accessing, persisting and managing data between objects/classes and relational databases.

![](https://i1.wp.com/www.thistechnologylife.com/wp-content/uploads/2020/07/JPA.png)

## Entity Manager

Responsible for managing objects that are or will be registered on the Database.

<img src="https://javabydeveloper.com/wp-content/uploads/2019/12/Jpa-architecture.png" width="800"/>

![](https://www.objectdb.com/files/images/manual/jpa-states.png)

In flush() the changes to the data are reflected in database, but it is still in transaction.flush() MUST be enclosed in a transaction context and you don't have to do it explicitly unless needed (in rare cases), when EntityTransaction.commit() already does that.

## Types

### Entity Type

* Independent, does not depend on another type to make sense in its life cycle.
* Have a unique identifier
* Use the @Entity notation from javax.persistence.Entity
* Must have a public constructor without args so Hibernate can map the object with the SQL type.
* Must be a high level class - Where Low level classes are the simple workers that perform actions, while high level classes are the management class that orchestrate the low level classes.
* Can be abstract, inherited or inherited from.
* Cannot be an Enum or Interface since they dont have constructors.
* Must not be final or have final methods and or attributes considering that Hibernate needs to inherit from the Entity to create the DAta Object.

### Value Type

They exist inside an Entity, have no life cycle of their own and can be:

* Basic Types - Maps from an individual type of value to a specific column.
* Embeddable Types - Maps a combination of types to a Table value, not to the database, but to JPA. Use the @Embeaddable notation. Defines a class whose instances are stored as an intrinsic part of an owning entity and share the identity of the entity. Each of the persistent properties or fields of the embedded object is mapped to the database table for the entity. It don’t have own identifier.

## Value Mappings

* @Column - Defines the column name on database
* @OneToMany, @ManyToOne, @OneToOne - Relationship mapping among Tables
* Embedded - Receives an Embeaddable class to sabe on database

## Cascade

Cascades define how the effects on Child Data will be propagated when the Parent Data is modified/deleted.

* ALL
* PERSIST
* MERGE
* REMOVE
* REFRESH
* DETACH

# Lecture 26 - Hibernate : Criteria Builder

# Lecture 27 - Hibernate and Foreign Keys

# Lecture 28 - Not Spring

# Lecture 29 - Presentations and new Sprint

Group 4 - Work Journey Control

Willian K
Thiago Luiz
Vitor André
Leo Pereira
Sabrina

Notes for next Sprint(s):

* Set up a good Trello (quality/testCoverage requirements included), do Code Reviews and PullRequests rather than doing your own merges.
* Refactor Tables Diagram;
* Implement a generic DAO (maybe not necessary with spring ?);
* Compartmentalize validations inside controllers;
* Get implementation suggestions from Slides to Trello's Sprint Backlog;
* Use JUnit 5!!! (Better stuff)
* Rotate team 'leadership' (The person that starts meetings and keeps the trello going);
* Don't forget the 'Next Sprint' slide on the Sprint Review;
* Custom exceptions;

# Lecture 30 - Micro Services, RESTFUL APIs

## Centralized applications

	...
	
## Distributed applications

The client is responsible for UI, only.

Data storage and Processing is done on the server.
	
Advantages:
* Low cost for updates
* Device agnostic
* High Resilience to Erros
* Scalable

Disadvantages:
* High traffic consumption
* Constant maintenance

## [RESTFUL APIs](https://restfulapi.net/)

* Stateless client/server protocol
* Operations : POST, GET, PUT, DELETE
* Resources and URIs (Uniform Resource Identifiers)
* Layer separation
* Hypermedia
	
The 6 REST Principles
* Uniform interface : By applying the software engineering principle of generality to the component interface, the overall system architecture is simplified and the visibility of interactions is improved. In order to obtain a uniform interface, multiple architectural constraints are needed to guide the behavior of components. REST is defined by four interface constraints: **identification of resources; manipulation of resources through representations; self-descriptive messages; and, hypermedia as the engine of application state**.
* Stateless : Each request from client to server must contain **all of the information necessary to understand the request**, and cannot take advantage of any stored context on the server. Session **state is therefore kept entirely on the client**.
* Cacheable : Cache constraints require that the data within a response to a request be implicitly or explicitly labeled as cacheable or non-cacheable. **If a response is cacheable, then a client cache is given the right to reuse that response data for later, equivalent requests**.
* Client-server : By **separating the user interface concerns from the data storage concerns**, we improve the portability of the user interface across multiple platforms and improve scalability by simplifying the server components.
* Layered system : The layered system style allows an architecture to be composed of **hierarchical layers by constraining component behavior** such that each component cannot “see” beyond the immediate layer with which they are interacting.
* Code on demand : REST allows **client functionality to be extended by downloading and executing code in the form of applets or scripts**. This simplifies clients by reducing the number of features required to be pre-implemented.

HTTP Operations
* POST - Create
* GET - Read
* PUT - Update entire object
* PATCH - Update attributes on object
* DELETE - Remove

## DTO - Data Transfer Object

A Data Transfer Object is an object that is used to encapsulate data, and send it from one subsystem of an application to another.

DTOs are most commonly used by the Services layer in an N-Tier application to transfer data between itself and the UI layer. The main benefit here is that it reduces the amount of data that needs to be sent across the wire in distributed applications. They also make great models in the MVC pattern.

Another use for DTOs can be to encapsulate parameters for method calls. This can be useful if a method takes more than four or five parameters.

When using the DTO pattern, you would also make use of DTO assemblers. The assemblers are used to create DTOs from Domain Objects, and vice versa.

The conversion from Domain Object to DTO and back again can be a costly process. If you're not creating a distributed application, you probably won't see any great benefits from the pattern, as [Martin Fowler explains here](https://martinfowler.com/bliki/LocalDTO.html).
	
# Lecture 31 - 

# Lecture 32 - Implementing SpringBoot on the Project


<img src="https://terasolunaorg.github.io/guideline/5.0.1.RELEASE/en/_images/RequestLifecycle.png" width="800px"/>

# Lecture 33 - Sprint Retrospective

# Lecture 34 - Last touches on the Backend

# Lecture 35 - HTTP and Wireframing

## Origins of the Internet

Started as a project from the Advanced Research Projects Agency (ARPA) from the USA Defence Departament with the goal of connecting the computers of several Universities across the USA. This network went to grow to what we now call the Internet.

HTTP came to existance soon after and is still used today in its HTML5 version.

# Lecture 36 -  Structure of the Internet

## HTTP Codes

### 1×× Informational

* 100 Continue
* 101 Switching Protocols
* 102 Processing

### 2×× Success

* 200 OK
* 201 Created
* 202 Accepted
* 203 Non-authoritative Information
* 204 No Content
* 205 Reset Content
* 206 Partial Content
* 207 Multi-Status
* 208 Already Reported
* 226 IM Used

### 3×× Redirection

* 300 Multiple Choices
* 301 Moved Permanently
* 302 Found
* 303 See Other
* 304 Not Modified
* 305 Use Proxy
* 307 Temporary Redirect
* 308 Permanent Redirect

### 4×× Client Error

* 400 Bad Request
* 401 Unauthorized
* 402 Payment Required
* 403 Forbidden
* 404 Not Found
* 405 Method Not Allowed
* 406 Not Acceptable
* 407 Proxy Authentication Required
* 408 Request Timeout
* 409 Conflict
* 410 Gone
* 411 Length Required
* 412 Precondition Failed
* 413 Payload Too Large
* 414 Request-URI Too Long
* 415 Unsupported Media Type
* 416 Requested Range Not Satisfiable
* 417 Expectation Failed
* 418 I'm a teapot
* 421 Misdirected Request
* 422 Unprocessable Entity
* 423 Locked
* 424 Failed Dependency
* 426 Upgrade Required
* 428 Precondition Required
* 429 Too Many Requests
* 431 Request Header Fields Too Large
* 444 Connection Closed Without Response
* 451 Unavailable For Legal Reasons
* 499 Client Closed Request

### 5×× Server Error

* 500 Internal Server Error
* 501 Not Implemented
* 502 Bad Gateway
* 503 Service Unavailable
* 504 Gateway Timeout
* 505 HTTP Version Not Supported
* 506 Variant Also Negotiates
* 507 Insufficient Storage
* 508 Loop Detected
* 510 Not Extended
* 511 Network Authentication Required
* 599 Network Connect Timeout Error

## Internet Layers

<img src="https://www.overcoded.net/wp-content/uploads/170/network-protocol-layers-diagram.jpg" width="800px" />

<img src="https://cdn2.hubspot.net/hub/70217/file-630050248-png/images/models_side_by_side.png" width="800x" />

<img src="https://www.imperva.com/learn/wp-content/uploads/sites/13/2020/02/OSI-7-layers.jpg.webp" width="800px" />

### DNS

The Domain Name System (DNS) is a central part of the internet, providing a way to match names (a website you're seeking) to numbers (the address for the website). Anything connected to the internet - laptops, tablets, mobile phones, websites - has an Internet Protocol (IP) address made up of numbers.

### TCP IP

TCP/IP, in full Transmission Control Protocol/Internet Protocol, standard Internet communications protocols that allow digital computers to communicate over long distances. The Internet is a packet-switched network, in which information is broken down into small packets, sent individually over many different routes at the same time, and then reassembled at the receiving end. TCP is the component that collects and reassembles the packets of data, while IP is responsible for making sure the packets are sent to the right destination. 

## HTML5

Released in 2014, HTML5 is the current implementation of HyperText Markup Language. Similar to XML, its tag and attribute driven.

### HTML Structure and some tags

<img src="https://s3.amazonaws.com/viking_education/web_development/web_app_eng/html5_sectioning_high_level.jpg" width="800px"/>

<img src="https://www.researchgate.net/profile/Muhammad-Pasha-6/publication/323869270/figure/fig3/AS:606182121164801@1521536488788/Structure-of-an-HTML5-Web-Page.png" width="800px"/>

* Head - Metadata related to the document
* Body - Document content

#### Semantic tags

* main
* header - 1 per section
* footer - 1 per section
* section
* article
* nav
* aside

#### Generic tags

* div - breaks flow
* span - keeps flow

# Lecture 37 - CSS : Cascading Style Sheets

<img src="https://i0.wp.com/www.silocreativo.com/en/wp-content/uploads/2018/08/CSS3-modules.png?resize=602%2C600&quality=100&strip=all&ssl=1" />

Can be declared by:

* External Link
* <style> tag
* Attribute style

Instructions are made by using:

* Instructions
* Selectors
* Blocks

# Lecture 38 - Sprint Retrospective and Senior Talks

# Lecture 39 - Javascript

The predecessor of Javascript was HTML Nextstep in 1989, Mosaic in 1993 and Netscape in 1994. Javascript itself was released in 1995 and currently its in the ECAMAScript version with annual releases.

Javascript as a language:

* Intepreted;
* Dynamic typed;
* Client or Server side
* Object Oriented - Constructed or Prototyped

Multi-Paradigm:

* Event-Driven
* Imperative - Follows the order of the statements
* Functional - Functions are primary types

Javascript variables:

* var : Local scope
* let : Block scope
* const : Unchangeable, global scope

Variable types:

* Number (Double precision 64bit)
* String
* Boolean
* null
* undefined
* Object (Function, Array, Date, RegExp)

# Lecture 40 - First steps with Angular

* https://angular.io/start

* https://angular.io/tutorial

# Lecture 41 - Working with Angular

# Lecture 42 - Angular and AngularBootstrap

# Lecture 43 - Connecting Angular Pages

# Lecture 44 - The End.