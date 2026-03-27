package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
	@GetMapping("/")
	public String home() {
		//System.out.println("home");
		return "home";
	}
}

@RestController
class BppController{
	@GetMapping("/bpp01")
	public String hello() {
		System.out.println("hello");
		//return "redirect:/";
		return "bpp01 : " + "tiger";
	}
}



@RestController
class BppController2{
	@GetMapping("/bpp02/{num}")
	public String hello(@PathVariable Integer num) {
		System.out.println("hello");
		
		try {
			Thread.sleep(num);
		} catch (Exception e) {e.printStackTrace();}
		
		//return "redirect:/";
		return "bpp02 : " + "tiger";
	}
}