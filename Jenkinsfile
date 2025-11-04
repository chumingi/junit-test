pipeline {
    agent any

    stages {
        stage('Grant Permission') {
            steps {
                sh 'chmod +x gradlew'
            }
        }
        stage("Compile") {
            steps { sh "./gradlew compilejava" }
        }
        stage("Build") {
            steps { sh "./gradlew build" }
        }
        stage("Unit test") {
            steps { sh "./gradlew test" }
        }
    }
}