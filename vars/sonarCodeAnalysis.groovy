def call(Map parameters = [:]) {

    def projectVersion = parameters.projectVersion ?: getVersion()
	
        withSonarQubeEnv('Soar Environment') {
            sh "sonar-scanner -X -Dsonar.projectVersion=${projectVersion}"
        }
}