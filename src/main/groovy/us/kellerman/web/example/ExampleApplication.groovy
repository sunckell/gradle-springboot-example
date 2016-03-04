package us.kellerman.web.example


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ErrorPage
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class ExampleApplication {
	
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
	 
	   return (container -> {
			ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
	 
			container.addErrorPages(error401Page, error404Page, error500Page);
	   });
	

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExampleApplication.class, args);
		System.out.println(ctx.getDisplayName());
		
		System.out.println("Gradle Pipeline Spring Boot Example");

	}

}
