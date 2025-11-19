pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build okay  ') {
            steps {
                echo "Building branch ${env.BRANCH_NAME}"
            }
        }
        stage('Done') {
            steps {
                echo "Pipeline complete for ${env.BRANCH_NAME}"
            }
        }
    }
}
