node {
    git branch: 'main', url: 'https://github.com/hasannader2040/craps-game.git'

    stage('Preparation') {
        try {
            sh 'echo "Preparation stage"'
            sh 'ls -l ./mvnw' // Check the permissions before chmod
            sh 'chmod +x ./mvnw' // Set execute permissions on mvnw
            sh 'ls -l ./mvnw' // Check the permissions after chmod
        } catch (Exception e) {
            sh 'echo "exception found during preparation"'
            throw e
        }
    }

    stage('Build') {
        try {
            sh 'echo "Build stage"'
            sh './mvnw clean install' // Run the Maven build
        } catch (Exception e) {
            sh 'echo "exception found during build"'
            throw e
        }
    }

    stage('Test') {
        if (env.BRANCH_NAME == 'feat') {
            sh 'echo "Test stage"'
        } else {
            sh 'echo "Skip test stage"'
        }
    }
}
