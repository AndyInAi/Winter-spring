package winter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {

	public static void main(String[] args) {

		SpringApplication.run(App.class, args);

	}

	@GetMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "Spring") String name) {

		return String.format("<h1>Hello Winter! Hello %s!", name);

	}

}
