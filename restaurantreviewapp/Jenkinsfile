 pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from your version control system
                git branch: 'main', url: 'https://github.com/layakp/RestaurantReviewApp.git'
            }
        }
        stage('Build') {
            steps {
                // Build your application (e.g., compile code, package artifacts)
                sh 'echo $PATH; which mvn; mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run tests for your application
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy your application (e.g., to a server, container, or cloud platform)
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
