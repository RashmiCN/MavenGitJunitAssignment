package com.git.assign;
import org.springframework.web.bind.annotation.RequestMapping;

public class WelcomeController {
	@RequestMapping("/welcome")
	public String getWelcomeApi() {
		System.out.println("welcome");
		return "welcome";
	}
}
