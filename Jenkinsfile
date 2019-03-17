pipeline {
    agent none
    stages {
        stage('Test & Build') {
            when {
                anyOf {
                    branch 'master';
                    branch 'develop';
                    expression { BRANCH_NAME ==~ /^release.*/ };
                    expression { BRANCH_NAME ==~ /^PR-.*/ };
                }
            }
            parallel {

                stage('Openjdk:8'){
                    agent {
                        docker { image 'bitofcode/open-jdk-1.8' }
                        //dockerfile {
                        //  filename "util/build-environments/Dockerfiles/aviation-edge-open-jdk-1.8"
                        //}
                    }
                    environment {
                        SONAR_CLOUD_TOKEN=credentials('SONARCLOUD_IO_BITOFCODE')
                    }
                    steps {
                        sh "chmod +x ./util/scripts/*.sh"
                        sh "./util/scripts/ci-build.sh"
                    }
                }

                stage('Openjdk:11'){
                    agent {
                        docker { image 'bitofcode/open-jdk-11' }
                        //dockerfile {
                        //  filename "util/build-environments/Dockerfiles/aviation-edge-open-jdk-11"
                        //}
                    }
                    environment {
                        SONAR_CLOUD_TOKEN=credentials('SONARCLOUD_IO_BITOFCODE')
                    }
                    steps {
                        sh "chmod +x ./util/scripts/*.sh"
                        sh "./util/scripts/ci-build.sh"
                    }
                }

            }
        }
    }
}
