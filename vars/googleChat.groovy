def call(Map parameters = [:]) {

    def message = parameters.message ?: "Pipeline build ${BUILD_TAG} complete. *${currentBuild.currentResult}*. Link to build: ${BUILD_URL}"
    def googleWebhook = parameters.googleWebhook ?: error("Parameter googleWebhook is required")  
    
    googlechatnotification message: message, sameThreadNotification: true, url: googleWebhook;	
}
