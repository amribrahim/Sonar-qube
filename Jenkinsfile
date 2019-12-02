node {
  stage('clone1') {
  checkout scm 
  }
  stage('build and sonar ') {
  sh 'mvn clean install sonar:sonar'
  
  }
 
}
