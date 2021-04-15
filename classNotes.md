[DontPad](http://dontpad.com/seniorgodev)
[Social Links](http://dontpad.com/SeniorProway)
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

# Lecture 8 - New Teams for Sprint 2

My new team: 6 - Vacation Management
* Daniella Lira
* Willian K.
* Bruna
* Jonata
* Leo Pereira

