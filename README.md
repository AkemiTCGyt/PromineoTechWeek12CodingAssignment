# PromineoTechWeek12CodingAssignment

# Coded by Thomas Le

## Synopsis
This project is a sample demonstrating Test Driven Development and Behavior Driven Development via unit testing. The breakdown of the two classes are shown below.

### TestDemo.java
- addPositive(int a, int b) a method that takes in two int parameters and returns the sum of the two. If either of the numbers are not positive, will throw
  a new illegalargumentexception.
- randomNumberSquared() a method that calls the random number method and returns that number, squared.
- randomInt() a method that returns a random integer from 1-10 using the random class.

### TestDemoTest.java
- setUp() Sets up a new instance of TestDemo called testDemo.
- assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) TDD that checks if a and b add up to expected. If not,
  throws an instance of the IllegalArgumentException class.
- argumentsForAddPositive() is a stream of arguments that are to be tested.
- assertThatNumberSquaredIsCorrect() BDD that creates a mock of class testDemo and forces the method to be run with the randomInt always equaling 5. Will succeed
  if fiveSquared is equal to 25.
