# Automation Testing for Amazon and KSRTC Web Applications, and Python for Data analysis.
This repository contains the automation testing framework for Amazon and KSRTC web applications, built using Selenium and TestNG. Additionally, a Python-based data analysis task is included. The framework follows best practices, utilizing the Page Object Model (POM) design pattern to enhance code maintainability and reusability by separating test logic from UI interactions.


## Key Features:
- Selenium WebDriver: Automates browser actions to perform end-to-end testing on Amazon and KSRTC applications.

- TestNG: Provides robust test configuration, execution, and reporting for automated tests.

- Page Object Model (POM): Implements a structured way to organize web element locators and actions, improving test scalability and maintainability.

- Data-Driven Testing: Supports running scenarios with different datasets, making test cases flexible and reusable.

- Python Data Analysis: Includes a task for data manipulation using Pandas in Python, involving data cleaning, transformation, and statistical calculations.


## Test Coverage:

### Task 1: Amazon Automation
- Scenario 1: Search for "car accessories", select the first item, add it to the cart, and verify that the item is successfully added.

- Scenario 2: Browse Today's Deals, apply filters for "Headphones" and "Grocery", select an item from the 4th page, and add it to the cart.

### Task 2: KSRTC Bus Ticket Booking Automation
- Book a ticket from CHIKKAMAGALURU to BENGALURU, choose a seat, fill out customer and passenger details, and simulate the payment process (without submitting).

### Task 3: Python Data Analysis
- Load the data from a CSV file, remove duplicates, clean and convert data (e.g., removing decimal places in age, converting salary from USD to EGP), and generate statistical reports such as average age, median salary, and gender ratio. The cleaned data is then saved into a new CSV file.


## Prerequisites:

- Java Development Kit (JDK 8+).

- Maven: For managing dependencies and running tests.

- Selenium WebDriver: For browser automation.

- TestNG: For test configuration and execution.

- Python 3.x: For running data analysis tasks.

- Pandas: Python library for data manipulation (used in Task 3).


## Conclusion:
This repository demonstrates end-to-end testing automation for web applications using Selenium/Java, along with a data analysis task in Python. The tasks follow best coding standards and design patterns to ensure high maintainability and scalability. Feel free to explore the repository and provide feedback or suggestions for improvement!
