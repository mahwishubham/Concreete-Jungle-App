pipeline {
    agent any
    stages {
	stage('Selenium Test') {
	    steps {
		sh "/opt/maven/bin/mvn clean verify"
	    }
	}
   }

    post {
        always {
            echo 'The pipeline completed'
            cucumber ( buildStatus: 'UNSTABLE', 
                customCssFiles: '', 
                customJsFiles: '', 
                failedFeaturesNumber: -1, 
                failedScenariosNumber: -1, 
                failedStepsNumber: -1, 
                fileIncludePattern: '**/*.json', 
                pendingStepsNumber: -1, 
                skippedStepsNumber: -1,
                sortingMethod: 'ALPHABETICAL', 
                undefinedStepsNumber: -1
            )
        }
        success {				
            echo "Selenium Test Report Generated!!"

        }

        failure {
            echo 'Build stage failed'
            error('Stopping early…')
        }
	}
}
