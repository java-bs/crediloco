pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    environment {
        def repoName = env.GIT_URL.replaceFirst(/^.*\/([^\/]+?).git$/, '$1')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn --batch-mode -Dmaven.test.skip=true clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
			junit (testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true)
                }
            }
        }
        stage('Sonarqube') {
            environment {
                scannerHome = tool 'SonarQubeScanner'
            }
            steps {
                withSonarQubeEnv('LorfinsaSonarQubeServer') {
			sh "mvn ${SONAR_MAVEN_GOAL} -Dsonar.projectKey=${repoName}"
                }
            }
        }
	stage('Sonar Quality Gate') {
            steps {
                timeout(time: 15, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        stage('Build & push image') {
            steps {
                script {
                    def customImage = docker.build("${repoName}:${env.GIT_BRANCH}")
                    customImage.push()
                }
            }
        }
    }
}
