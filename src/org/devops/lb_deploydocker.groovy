package org.devops

def despliegueContenedor(projectGitName){
    sh "docker pull cristianbetancourthperiferia/react-test"
    sh "docker run -d --network=${env.NET_NAME} -p 5174:8080 --name ${projectGitName} cristianbetancourthperiferia/${projectGitName}"
}
