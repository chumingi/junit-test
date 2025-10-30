pipeline {
    agent any

    stages {
        stage("Compile") {
            steps { bat "./gradlew compilejava" }
        }
        stage("Build") {
            steps { bat "./gradlew build" }
        }
        stage("Unit test") {
            steps { bat "./gradlew test" }
        }
    }
}