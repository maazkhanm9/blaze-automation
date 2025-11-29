# blaze-automation
What this project includes

Selenium WebDriver with Java

TestNG test structure

Page Object Model

End-to-end workflow for booking a flight

Random user data using Faker

Proper waits (implicit + explicit)

Negative checks (same cities, no flights, wrong indexes)

Project Structure
src/
  main/java
  base
 pages
workflow
test/java
  test

How to run

Clone the repo

Open in Eclipse/IntelliJ

Make sure Maven downloads all dependencies

Run the tests using TestNG

Right-click → Run As → TestNG Test

or run through testng.xml

Test Cases I added
Positive Flows

Book a flight with valid cities

Book using random flight selection

Negative Flows

Selecting same departure + destination

Flight index out of range

No flights available

City not found in dropdown

Tech Used

Java 17

Selenium WebDriver

TestNG

Maven

Java Faker

Why I built this

I created this project to practice:

Writing clean automation code

Handling waits properly

Understanding POM deeply

Working with workflows and multiple pages

Preparing real interview-style test cases

Author

Maaz Khan
Automation Test Engineer
Email: maazkhanm9@gmail.com

If you want, I can also be contacted for the same
