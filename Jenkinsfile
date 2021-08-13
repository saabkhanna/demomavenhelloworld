pipeline {
    agent any
    
    stages {
        stage('Checking Java Version') {
            steps {
                sh 'javac -version'
            }
        }
        
        stage('Checking Maven Version') {
            steps {
                sh 'mvn -version'
            }
        }
        
        stage('build') {
            steps {
                sh 'mvn -X clean -X package'
            }
        }
        
        stage('deploying') {
            steps {
                deploy adapters: [tomcat9(credentialsId: '429eee95-cf97-472f-ad47-dde2108a9792', path: '', url: 'http://65.0.168.196:8080/')], contextPath: 'demowebapp', war: '**/HelloWorld-0.0.1-SNAPSHOT.war'
            }
        }
    }
}
