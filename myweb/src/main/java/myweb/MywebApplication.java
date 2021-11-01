package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MywebApplication {
	
	@RestController
	public class HelloController {
		
		// 빈설정 webApplication Context 안에 집어 넣는다
		@GetMapping("/hello")
		public String hello() {
			return "<h1>Hello World<h1>";
		}
	}
	
	@Controller
	public class HelloController2 {
		
		// 빈설정 webApplication Context 안에 집어 넣는다
		@GetMapping("/hello2")
		public String hello2() {
			return "hello2";
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MywebApplication.class, args);	
		
	}
	
}
