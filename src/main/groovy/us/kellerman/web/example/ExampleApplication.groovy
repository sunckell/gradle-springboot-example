package us.kellerman.web.example


<<<<<<< HEAD
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer
import org.springframework.boot.context.embedded.ErrorPage
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ErrorPage
import org.springframework.context.ApplicationContext;
>>>>>>> ac872342c452b54730a76e94b98b3472f1f35c56

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
		
		System.out.println("Gradle Pipeline to AWS - Spring Boot Example");

	}

}
