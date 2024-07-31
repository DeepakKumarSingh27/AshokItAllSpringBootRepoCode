package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome(@RequestParam("name") String name) {
		String respPaylod = name+ ", Welcom Bihar!!...";
		return new ResponseEntity<String>(respPaylod, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String respPayload = "Good Night..!!";
		return respPayload;
	}
    
	
}
