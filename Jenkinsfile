pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk12'
    }
    stages {

        stage ('Build') {
            steps {
                sh '''#!/bin/bash
                	mvn -Dmaven.test.failure.ignore=true site
                   ''' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
