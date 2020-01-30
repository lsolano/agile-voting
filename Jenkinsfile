pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk12'
    }
    stages {
        stage ('Initialize') {
            steps {
                bash '''#!/bin/bash
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                bash 'mvn -Dmaven.test.failure.ignore=true site' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
