# Java ArithmeticException: Uncommon Scenario

This repository demonstrates a simple yet easily missed scenario leading to an `ArithmeticException` in Java.  The code divides an integer by zero, resulting in a runtime exception.

## Bug Description
The `UncommonBug.java` file contains code that attempts to divide by zero, leading to an `ArithmeticException`. This is a common error, but its subtle appearance can make it challenging to identify in more complex code.

## Solution
The `UncommonBugSolution.java` file presents a solution demonstrating proper exception handling using a `try-catch` block. This prevents the program from crashing and allows for graceful handling of the error.

## How to Run
1. Clone this repository.
2. Compile and run `UncommonBug.java` to observe the `ArithmeticException`. 
3. Compile and run `UncommonBugSolution.java` to see how exception handling prevents the crash.
