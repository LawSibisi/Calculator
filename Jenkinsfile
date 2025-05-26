pipeline {
    agent any

    stages {
        stage("Clean Up") {
            steps {
                deleteDir()
            }
        }

        stage("Clone Repo") {
            steps {
                sh "git clone https://github.com/LawSibisi/Calculator.git"
            }
        }

        stage("Build") {
            steps {
                dir("Calculator") {
                    sh "mvn clean install"
                }
            }
        }

        stage("Test") {
            steps {
                dir("Calculator") {
                    sh "mvn test"
                }
            }
        stage("Complete") {
            steps {
                echo "Job has completed!!!"
            }
        } 
    }
}
