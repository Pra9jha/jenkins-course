job('NodeJS example') {
    scm {
        git('https://github.com/Pra9jha/jenkins_with_node') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        githubPush()
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("sudo npm install")
        shell("sudo  npm start")
 
    }
}
