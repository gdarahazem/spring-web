package tn.itbs.tp0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MonControlleur {
	@GetMapping(value="/index")
	public String affiche() {

		return "index";
	}
	
 
}
