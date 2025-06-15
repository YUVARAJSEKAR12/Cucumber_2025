pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven 3.8.6'  // Use your configured Maven name
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-username/your-cucumber-project.git'
            }
        }

        stage('Build') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn clean compile"
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn test"
            }
        }

        stage('Publish Cucumber Report') {
            steps {
                publishHTML([ 
                    reportDir: 'target/cucumber-reports',
                    reportFiles: 'cucumber-html-reports.html',
                    reportName: 'Cucumber HTML Report'
                ])
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        failure {
            echo 'Build failed. Check the logs and test reports.'
        }
    }
}
