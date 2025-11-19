pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build main  ') {
            steps {
                echo "Building branch ${env.BRANCH_NAME}"
            }
        }
        stage('Done Harish') {
            steps {
                echo "Pipeline complete for ${env.BRANCH_NAME}"
            }
        }
    }
}
