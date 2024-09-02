# Craps Game

This project implements a simple Craps game. The game simulates the traditional dice game played in casinos, where players bet on the outcome of the roll of two six-sided dice.

## Purpose

The purpose of this project is to provide a fun and educational example of a simple game written in a programming language of your choice. This project also serves as a learning experience for implementing CI/CD pipelines, ensuring the code is continuously integrated and deployed with automated testing.

## Branches

This repository contains multiple branches, each dedicated to different CI/CD pipeline configurations. These branches demonstrate how to set up continuous integration and deployment workflows for the project.

## How to Run the Code

### Prerequisites

- Ensure that you have the required programming language installed (e.g., Python, Java).
- Install any dependencies listed in the project’s requirements file (e.g., `requirements.txt`, `pom.xml`).

### Steps to Run the Craps Game

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/hasannader2040/craps-game.git
   cd craps-game
2. Switch to the Appropriate Branch:
Depending on which CI/CD pipeline you want to explore, switch to the respective branch:

```bash
git checkout <branch-name>
```
For example:
```bash
git checkout ci-pipeline-github-actions
```
3. Run the Game:

Execute the game code depending on the programming language:

Java:
```bash
java CrapsGame
```
4. Run Tests (If Applicable):

If the project includes automated tests, you can run them with:

Java:
mvn test

## Tools Used
**GitHub Actions / GitLab CI / Jenkins**: CI/CD tools used for automating the integration and deployment of the project.
**Unit Testing Frameworks**: (e.g., PyTest for Python, JUnit for Java) for automated testing.
**Programming Language Tools**: (e.g., Python interpreter, Java SDK).
## Usage Examples
Running the Game
To run the game, use the following command:
```bash
java CrapsGame
```
**Running Tests**
To run tests, use:
```bash
mvn test
```
## CI/CD Pipelines
Each branch in this repository demonstrates a different CI/CD setup:

1- **GitHub Actions**: Automates testing and deployment using workflows defined in **.github/workflows/**.
2- **GitLab CI**: CI/CD pipeline configuration using **.gitlab-ci.yml**.
3- **Jenkins**: Jenkins pipeline scripts located in the **Jenkinsfile**.

## How to Set Up CI/CD
1 - GitHub Actions:

Push changes to the **main** branch, and GitHub Actions will automatically run the workflows defined in **.github/workflows/**.

## 2- GitLab CI:

Push changes to the respective branch, and GitLab CI will execute the jobs defined in **.gitlab-ci.yml**.

## 3- Jenkins:

Configure a Jenkins job to pull from the repository and run the Jenkinsfile.

## Additional Information
Ensure you are on the correct branch to use the respective CI/CD configuration.
Modify the pipeline configurations as needed for your specific environment.
