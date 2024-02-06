def buildJar() {
    echo "building the application..."
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'Docker-hub', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
        sh 'docker build -t darkgonos/practica:jma-1.1.0 .'
        sh "docker login -u $USERNAME -p $PASSWORD"
        sh 'docker push darkgonos/practica:jma-1.1.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this