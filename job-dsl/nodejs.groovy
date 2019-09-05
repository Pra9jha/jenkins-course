job('Jenkins_Master') {
    scm {
        git('https://github.com/Pra9jha/jenkins_with_node.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        
        shell("sudo apt install npm -y &&  sudo apt-get install nodejs -y &&  sudo  npm install express -y && sudo npm install")
        shell("sudo  npm start")
 
    }
}

