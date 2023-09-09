# number_converter


# coding challenge

You will be writing a web application called “NumberConverter”.

Please hand over your solution with a full commit history.

Please do not hesitate to ask any questions if something is unclear. We're always happy to provide guidance in case you get stuck or want to discuss an idea with us.


## The App

We'd like you to build an app that can convert decimal ("23") as well as binary numbers ("10111") into Roman numerals ("XXIII").

We consider the "standard form" section of the Wikipedia page on Roman numerals https://en.wikipedia.org/wiki/Roman_numerals#Standard_form as the relevant definition; should you choose to use another definition, please let us know which one.

### Backend

The actual conversion should happen server-side, so there should be a Spring-based server app listening to requests from the client and implementing the conversion.

We are looking for an architecture that makes it easy to extend the app to support new input and output formats.

In our ideal solution, if you wanted to add another converter, you'd just need to add a class and not touch much else. You don't need to hit this "ideal solution", but you should think about what you would have to do to add another input or output format. Maybe add some comments or a README giving hints as to where changes would be needed to extend the solution.

### Frontend (optional)

Should ideally be implemented as a Single Page Application, ideally using React. That app should allow users to enter a number into an input field and convert it into another format. Your UI should allow for converting numbers (1) from decimal to roman as well as from binary to roman. Please note though that this app is supposed to be extensible to any input and output format, so don't lock your output type to a roman number string.

### Audit Log (optional)

All conversions executed via the frontend should have an audit trail in the backend store. You can choose and implement any store you like, whether it is a flat file or a RDBMS (in-memory or persistent). Each audit record should include a timestamp, a type of conversion, incoming and outgoing params/results.

## Coding Guidelines

We are mainly interested in seeing your coding and conceptual skills. Therefore, we care more about code quality (cleanliness), separation of concerns, extensibility, and maintainability than about a polished UI design, for example. Try applying OOP principles such as Dependency Injection thoughtfully.

## Extra credit

Extra credit for tests provided (we do not expect 100% coverage).

## 3rd Party Libraries

We want you to implement this application using Java/Spring Boot as a self-contained app (with all the dependencies baked into one jar file) with a Typescript/Javascript frontend. Please do not use any external libraries to perform the conversion to roman numbers itself. )
