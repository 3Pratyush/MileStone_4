pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/3Pratyush/Milestone4.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/test-output/**', allowEmptyArchive: true
        }
    }
}
