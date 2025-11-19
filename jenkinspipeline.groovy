pipeline {
    agent any

    stages {
        stage("Git Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/Harish-exc/Jenkinsfile.git'
            }
        }

        stage("Build Start") {
            steps {
                echo 'BUILD STARTED'
            }
        }

        stage("Lint") {
            steps {
                echo 'LINT OK'
            }
        }

        stage("Test") {
            steps {
                echo 'TEST OK'
            }
        }

        stage("Artifacts") {
            steps {
                sh 'echo "pipeline completed" > output.txt'
                archiveArtifacts artifacts: 'output.txt'
            }
        }
    }
}
