node {
  stage('clone') {
  checkout scm 
  }
  stage('build and sonar ') {
  sh 'mvn clean install sonar:sonar'
  
  }
 
}
