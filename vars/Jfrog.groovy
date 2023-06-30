def call(credentialsId){

    withJfrogEnv(credentialsId: credentialsId) {
         sh 'mvn clean package deploy'
    }
}
