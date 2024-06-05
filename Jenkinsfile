pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    try {
                        // Checkout the code from the GitHub repository
                        git branch: 'main', url: 'https://github.com/hasannader2040/craps-game.git'
                    } catch (Exception e) {
                        echo "Checkout stage failed: ${e.getMessage()}"
                        currentBuild.result = 'FAILURE'
                        error("Stopping pipeline due to checkout failure")
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    try {
                        // Placeholder for build commands
                        sh 'echo "Build stage"'
                    } catch (Exception e) {
                        echo "Build stage failed: ${e.getMessage()}"
                        currentBuild.result = 'FAILURE'
                        error("Stopping pipeline due to build failure")
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    try {
                        // Placeholder for test commands
                        sh 'echo "Test stage"'
                    } catch (Exception e) {
                        echo "Test stage failed: ${e.getMessage()}"
                        currentBuild.result = 'FAILURE'
                        error("Stopping pipeline due to test failure")
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    try {
                        // Placeholder for deploy commands
                        sh 'echo "Deploy stage"'
                    } catch (Exception e) {
                        echo "Deploy stage failed: ${e.getMessage()}"
                        currentBuild.result = 'FAILURE'
                        error("Stopping pipeline due to deploy failure")
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
