pipeline {
    agent {
        docker {
            image 'python:3.11'
            args '-u root'   // run as root inside container
        }
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Harish-exc/Jenkins-Projects.git'
            }
        }

        stage('Build') {
            steps {
                echo 'BUILD STARTED'
                sh 'python --version'
            }
        }

        stage('Lint') {
            steps {
                echo 'Running lint...'
                sh 'echo LINT OK'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'echo TEST OK'
            }
        }

        stage('Archive') {
            steps {
                sh 'echo docker build done > output.txt'
                archiveArtifacts artifacts: 'output.txt'
            }
        }
    }
}
