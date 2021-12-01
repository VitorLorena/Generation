package com.helloword.hellodois;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hdois")
public class HelloDois {
	
	@GetMapping
	public String Hdois() {
		return "Nessa semana eu quero entender ao maximo o conteudo de spring.";
	}
}