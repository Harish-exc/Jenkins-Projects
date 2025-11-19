pipeline {

    agent {
        docker {
            image  'python 3:31'
            args '-u root' // ran as root inside the container
        }
    }

    stages {

        stage ('check out the Gitcode') {
            steps {
                echo 'cloning the git code '
                gitbranch: 'main', url:  'https://github.com/Harish-exc/Jenkins-Projects.git'
            }
        }

        stage ('build') {
            steps {
                echo 'Build started'
                sh 'python --version'
            }
        }

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
            steps {
                sh 'echo docker build done > output.txt'
                archiveArtifacts artifacts: 'output.txt'
            }
        }
    }
}