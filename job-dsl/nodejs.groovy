job('Jenkins_DSL_Example01') {
    label('slave1') 
    scm {
        git('https://github.com/Pra9jha/jenkins_with_node.git') {  node -> // is hudson.plugins.git.GitSCM   
            node / gitConfigName('DSL User')
           
           branches {
            branchSpec {
               name("master")
            }
        }  
                 
        }   
    }
    triggers {
        githubPush()
    }
    steps {
        
        shell("sudo apt install npm -y &&  sudo apt-get install nodejs -y &&  sudo  npm install express -y && sudo npm install")
        shell("sudo  npm start")
 
    }
}
