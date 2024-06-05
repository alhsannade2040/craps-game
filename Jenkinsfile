node {
    try {
        stage('Checkout') {
            git branch: 'master', url: 'https://github.com/hasannader2040/craps-game.git'
        }
        
        stage('Build') {
            echo 'Build stage'
            sh 'chmod +x ./mvnw'  // Add this line to give execute permission to the mvnw script
            sh './mvnw clean install'
        }
    } catch (Exception e) {
        echo "An error occurred: ${e}"
        currentBuild.result = 'FAILURE'
    }
}
