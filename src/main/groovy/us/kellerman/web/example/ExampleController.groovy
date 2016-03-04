package us.kellerman.web.example

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ExampleController {

	@RequestMapping("/example")
	public String exampleIt(){
		return "You made it to the Jenkins Pipeline Spring Boot example. ";
	}

}
