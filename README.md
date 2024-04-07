# dice

# Spring Boot Twitter API Integration

Welcome to the Spring Boot Twitter API Integration project! In this project, we'll learn how to create a server using Spring Boot and integrate it with the Twitter API. Let's get started!

## What is This Project About?

This project aims to create a simple application that can search for Twitter users and fetch their tweets. We'll be able to search for users and view their recent tweets using our application.

## What Do I Need?

Before we begin, make sure you have the following:

- **Java Development Kit (JDK):** This is a tool that allows us to write and run Java code. You can download it for free from the internet.
- **Maven:** Maven helps us manage our project's dependencies and build process. You'll need to install it on your computer.
- **Twitter Developer Account:** To use the Twitter API, you'll need to sign up for a developer account on the Twitter website. They'll provide you with some keys that you'll use to access the API.

## How Do I Set It Up?

Follow these steps to set up the project:

1. **Clone the Repository:** Click on the "Clone" button on the GitHub repository page to make a copy of the project files onto your computer.

2. **Navigate to the Project Directory:** Open a terminal or command prompt on your computer and go to the directory where you cloned the project.

3. **Configure Twitter API Credentials:** Open the `application.properties` file in the project and fill in your Twitter API credentials. These are the keys you received when you signed up for a Twitter developer account.

4. **Build the Project:** Run the command `mvn clean install` in the terminal. This will compile the code and package it into a runnable JAR file.

5. **Run the Application:** Finally, run the command `java -jar target/twitter-api-integration.jar` to start the server. You should see some output indicating that the server is running.

## How Do I Use the API?

Now that the server is running, you can use it to search for Twitter users and get their tweets. Here's how:

1. **Search Tweet User:** Open a web browser or use a tool like Postman to send a GET request to `http://localhost:8080/api/search?q={query}`, replacing `{query}` with the name of the user you want to search for.

2. **Get Tweets of Selected User:** Similarly, send a GET request to `http://localhost:8080/api/tweets/{username}`, replacing `{username}` with the Twitter username of the user whose tweets you want to fetch.
