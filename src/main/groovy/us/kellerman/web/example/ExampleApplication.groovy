package us.kellerman.web.example


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class ExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExampleApplication.class, args);
		System.out.println(ctx.getDisplayName());
		
		System.out.println("Gradle Pipeline Spring Boot Example");

	}

}
