def call(boolean useBranchName = false) {
    def version = readFile ('version.txt')

    if (!version) {
        error("version.txt was not found")
    }

    version = version.trim() +  "." + env.BUILD_NUMBER
	//include a .txt file with just project version (e.g '1.0.3') in project folder 

    return version
}