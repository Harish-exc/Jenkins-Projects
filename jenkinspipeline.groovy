pipeline {
<<<<<<< HEAD

    agent {
        docker {
            image  'python 3:31'
            args '-u root' // ran as root inside the container
=======
    agent {
        docker {
            image 'python:3.11'
            args '-u root'   // run as root inside container
>>>>>>> 3b046421f4f319f4e1800f6efe7722092425a0a4
        }
    }

    stages {

<<<<<<< HEAD
        stage ('check out the Gitcode') {
            steps {
                echo 'cloning the git code '
                gitbranch: 'main', url:  'https://github.com/Harish-exc/Jenkins-Projects.git'
            }
        }

        stage ('build') {
            steps {
                echo 'Build started'
=======
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Harish-exc/Jenkins-Projects.git'
            }
        }

        stage('Build') {
            steps {
                echo 'BUILD STARTED'
>>>>>>> 3b046421f4f319f4e1800f6efe7722092425a0a4
                sh 'python --version'
            }
        }

<<<<<<< HEAD
        stage ('lint') {
            steps {
                echo 'running the lint'
                sh 'echo lint OK'
            }
        }

        stage ('test') {
            staps {
                echo 'running the test'
                sh 'echo test ok'
            }
        }
          stage('Archive') {
=======
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
>>>>>>> 3b046421f4f319f4e1800f6efe7722092425a0a4
            steps {
                sh 'echo docker build done > output.txt'
                archiveArtifacts artifacts: 'output.txt'
            }
        }
    }
}