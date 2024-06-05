node {
    git branch: 'main', url: 'https://github.com/hasannader2040/craps-game.git'

    stage('build') {
        try {
            sh 'echo "build stage"'
            sh 'ls -l ./mvnw' // Check the permissions before chmod
            sh 'chmod +x ./mvnw' // Set execute permissions on mvnw
            sh 'ls -l ./mvnw' // Check the permissions after chmod
            sh './mvnw clean install' // Run the Maven build
        } catch (Exception e) {
            sh 'echo "exception found"'
            throw e
        }
    }

    stage('test') {
        if (env.BRANCH_NAME == 'feat') {
            sh 'echo "test stage"'
        } else {
            sh 'echo "skip test stage"'
        }
    }
}
