package in.ashokit.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String getWelcome(Model model) {
		model.addAttribute("msg", "Welcome to Deepak!!...");
		return "index";
	}

}
