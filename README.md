# <p align="center">JAVA Beginner Exercise Repository</p>

## Table of Contents
1. [Exercise 1: Person](#exercise-1-person)
2. [Exercise 2: Word Frequency Calculation](#exercise-2-word-frequency-calculation)
3. [Exercise 3: Circle Circumference and Area Calculation](#exercise-3-circle-circumference-and-area-calculation)
4. [Exercise 4: Library](#exercise-4-library)
5. [Exercise 5: Calculator](#exercise-5-calculator)
6. [Exercise 6: Rectangle](#exercise-6-rectangle)
7. [Exercise 7: Person](#exercise-7-person)
8. [Exercise 8: Vending Machine](#exercise-8-vending-machine)
9. [Exercise 9: Geometric Shapes](#exercise-9-geometric-shapes)
10. [Exercise 10: ArrayList](#exercise-10-arraylist)

## Exercise 1: Person
Create a class called "Person" with the following attributes: name, age, gender. Include methods to set and get the attribute values and a method to display all the person's information. Then, create a class called "Student" that extends the "Person" class and adds an attribute "studentId" and a method to display the student ID.

## Exercise 2: Word Frequency Calculation
Write a program that takes a string input and calculates the frequency of vowels and white spaces. To accomplish this, create two classes:

1. **SentenceManager** class with:
   - Attributes: text (String type), vowels (int), spaces (int)
   - Methods: constructors, `analyze` (calculates the number of vowels and spaces from an input string), `getVowelFrequency` (returns the frequency of vowels), `getSpaceFrequency` (returns the frequency of spaces)

2. **SentenceManagerDriver** class that contains the main method, which will prompt the user for a sentence and print the requested frequencies.

## Exercise 3: Circle Circumference and Area Calculation
Write a program that calculates the circumference and area of two circles, rounding to three decimal places for the area of the first circle. Create two classes:

A. **RoundedCircle** class with attribute radius and methods:
   - `area` (calculates 𝐴 = 𝜋𝑟^2),
   - `roundedArea` (rounds the area to three decimal places),
   - `circumference` (calculates 𝐶 = 2𝜋𝑟),
   - constructors and necessary setters and getters

B. **RoundedCircleDriver** class that contains the main method and instances of circles to test the methods of the previous class.

## Exercise 4: Library
Create a class called "Book" with the following attributes: title, author, number of pages, genre. Include methods to set and get the attribute values and a method to display all the book's information. Create a class "Library" that contains an array of books and methods to add, remove, and display all books in the library.

## Exercise 5: Calculator
Create a simple calculator with a graphical interface using Swing.

## Exercise 6: Rectangle
Create a class called "Rectangle" with the following attributes: length, width. Include methods to set and get the attribute values and a method to calculate the area of the rectangle. Create a class "House" that contains an array of rectangles (representing rooms) and methods to add, remove, and display information about all rooms.

## Exercise 7: Person
Define a class "Person" with the attributes "name" and "age". Define a class "Employee" that extends "Person" and has an attribute "salary". Define a class "Manager" that extends "Employee" and has an attribute "bonus". Override the `toString` method to return a string representing the object in a readable format.

## Exercise 8: Vending Machine
Imagine creating a Java program for a beverage vending machine. The machine should manage two types of beverages and be able to give change if possible. If not, it should notify the customer that the inserted money is insufficient via an exception.

Start by defining a class called `Beverage`, representing a beverage. This class should have two attributes: the name of the beverage and its price.

Next, create a class called `VendingMachine`, representing the vending machine. This class should have two attributes: a data structure to manage the beverages available in the machine and the current balance of the machine. Within the `VendingMachine` class, define various methods:
- `insertCoin` method to allow the user to insert a coin into the machine and update the machine's balance.
- `getBalance` method to return the current balance of the machine.
- `getBeverages` method to return the list of beverages available in the machine.
- `dispenseBeverage` method to dispense a beverage from the machine, updating the balance, and ensuring that the user has sufficient balance and the beverage is available. If not, it raises an exception.
- `giveChange` method to return the change if possible and update the machine's balance.

Define two exceptions: `InsufficientFundsException` and `BeverageUnavailableException`. The former is raised when the inserted money is insufficient to buy the requested beverage, while the latter is raised when the requested beverage is unavailable in the machine.

To test the `VendingMachine` class, create a class called `Main` and instantiate an object of `VendingMachine`. Call the various methods of the `VendingMachine` class to verify they work correctly.

## Exercise 9: Geometric Shapes
Suppose you want to create a program to manage a list of geometric objects such as squares, rectangles, and circles. Each geometric object will have an area and a perimeter calculated through appropriate methods.

Implement this program by creating a base class "Geometry" that defines some basic properties and methods such as the length and width of the object. Each child class, such as "Square," "Rectangle," and "Circle," inherits from this base class and defines properties and methods specific to its type of geometry.

For example, the "Square" class might define a "side" property and a `calculateArea` method that returns the area of the square (`side * side`), while the "Circle" class might define a "radius" property and a `calculateArea` method that returns the area of the circle (`pi * radius^2`).

To use these classes and calculate the areas and perimeters of the objects, create a list of geometric objects of type "Geometry" and use polymorphism to call the `calculateArea` method on each object. This way, the program will execute the specific class's method to calculate the object's area.

## Exercise 10: ArrayList
These are simple exercises to learn about ArrayLists.
- **Exercise 1:** Create an ArrayList of integers and add numbers from 1 to 10. Print the entire ArrayList using a for loop.
- **Exercise 2:** Create an ArrayList of strings and add some words. Remove a word from the ArrayList using its index. Print the resulting ArrayList.
- **Exercise 3:** Create an ArrayList of `Person` objects, where `Person` is a class with the attributes name and age. Add some people to the ArrayList and print only the people with an age greater than 30.
- **Exercise 4:** Write a method that accepts an ArrayList of integers and returns a new ArrayList containing only the even numbers from the original.
- **Exercise 5:** Write a method that accepts an ArrayList of strings and returns a new ArrayList containing only the strings that start with an uppercase letter.
