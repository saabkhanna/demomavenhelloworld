pipeline {
    agent any
    
    stages {
        stage('Checking Version') {
            steps {
                sh 'javac -version'
            }
        }
        stage('build') {
            steps {
                sh 'mvn -version'
            }
        }
        
        stage('deploying') {
            steps {
                echo 'getting deployed'
            }
        }
    }
}
