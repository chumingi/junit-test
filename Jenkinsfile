pipeline {
    agent any

    stages {
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