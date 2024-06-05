node {
    try {
        stage('Checkout') {
            git branch: 'master', url: 'https://github.com/hasannader2040/craps-game.git'
        }
        stage('Build') {
            echo "Build stage"
            sh './mvnw clean install'  // Assuming you're using Maven Wrapper
        }
        stage('Test') {
            echo "Test stage"
            sh './mvnw test'
        }
    } catch (e) {
        echo "An error occurred: ${e.getMessage()}"
        throw e
    }
}
