**Simple Calculator Application**

**Overview**
The Simple Calculator Application provides basic mathematical operations. Users can choose between four options to perform calculations:

**Add two numbers**
Add a series of numbers (1 to 5) starting from a given value
Multiply two numbers
Multiply a series of numbers (1 to 5) starting from a given value
The application includes a main class for interacting with the user and performing the operations, and it is designed with simple functionality that can be extended. Unit tests are provided using JUnit to verify each operation.

**Features**

Add two numbers:

Prompts the user to input two integers and adds them.

Add a series of numbers: 
Allows the user to specify a starting value, then adds 1, 2, 3, 4, and 5 to that value.

Multiply two numbers:
Prompts the user for two integers and multiplies them.

Multiply a series of numbers: 
Allows the user to specify a starting value, then multiplies it by 1, 2, 3, 4, and 5.

**Requirements**

Java Development Kit (JDK) 8 or higher

JUnit for testing (included in the test folder)

**Getting Started**

**1. Clone the repository:**

To start using this project, clone the repository to your local machine:

git clone https:https://github.com/LawSibisi/Calculator.git

**2. Compile and Run:**

After cloning the repository, navigate to the project directory and compile the Java files:

javac org/study/*.java

**To run the calculator:**

java org.study.SimpleCalculatorApp

**3. Unit Tests:**

To run the unit tests, make sure you have JUnit set up in your IDE or build tool (Maven).

**Alternatively, run the tests manually:**

javac -cp .:path/to/junit.jar org/study/SimpleCalculatorAppTest.java

java -cp .:path/to/junit.jar org.junit.runner.JUnitCore org.study.SimpleCalculatorAppTest

**How to Use**

When the program is executed, you will be presented with the following menu options:

**markdown**

1. Add two numbers
   
3. Add many numbers
   
5. Multiply two numbers
   
7. Multiply many numbers

Select an option by entering the corresponding number and then input the required values as prompted. The program will output the result based on your selection.

**Code Explanation**

Main Class: SimpleCalculatorApp

This class contains the main program logic for performing basic arithmetic operations. 

**It includes:**

add(int numA, int numB): Adds two numbers.

addNumberList(int z): Adds numbers from 1 to 5 to a starting value z.

multiplyOne(int x, int y): Multiplies two numbers.

multiply(int a): Multiplies a starting value a by numbers from 1 to 5.

Test Class: SimpleCalculatorAppTest

**This class includes JUnit test methods to verify the correctness of each arithmetic operation:**

addingOne(): Tests the add method for adding two numbers.

addingNumbersInList(): Tests the addNumberList method for adding a series of numbers.

multiplyingOne(): Tests the multiplyOne method for multiplying two numbers.

multiplying(): Tests the multiply method for multiplying a series of numbers.

**License**

This project is open-source and available under the MIT License. See the LICENSE file for more details.

**Acknowledgements**

JUnit for unit testing


**Demo video of how the project functions**

Demo link : https://screenrec.com/share/EIauLYn5To
