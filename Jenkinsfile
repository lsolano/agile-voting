pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk12'
    }
    stages {

        stage ('Build') {
            withMaven(
		        // Maven installation declared in the Jenkins "Global Tool Configuration"
		        maven: 'Maven 3.3.9') {
		 
		      // Run the maven build
		      sh "mvn clean verify"
		 
		    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs & SpotBugs reports...
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
