//testing harshalata//
# Selenium Test Suite for Entrata.com using TestNG

## Prerequisites:
- Java JDK installed (Version 8+)
- Maven installed for dependency management
- Chrome browser installed
- Chromedriver downloaded and added to the system path

## Setup:
1. Clone this repository: `git clone [repository-link]`.
2. Navigate to the project directory: `cd [repository-directory]`.
3. Open the `pom.xml` file and ensure the dependencies for Selenium and TestNG are up to date.
4. Update the `path/to/chromedriver` in the test files with the correct path to your ChromeDriver executable.

## Running the Tests:
1. In the terminal, run `mvn clean test` to execute all TestNG tests.
2. The results will be displayed in the terminal.

## Notes:
- Make sure you have a stable internet connection as these tests interact with the live site.
- Forms are interacted with but not submitted to avoid affecting the live website.
- Dynamic content and navigation links are verified to ensure proper functioning of the website.
