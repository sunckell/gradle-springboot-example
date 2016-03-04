node {
	// Mark the code checkout 'stage'....
    stage 'Checkout'
    
    // Get some code from a GitHub repository
    git url: 'https://github.com/sunckell/gradle-springboot-example.git'

	
	// Mark the code build 'stage'....
    stage 'Build'
    
    // Run the gradle build
    sh './gradlew build'
   	
}
