package com.helloword.objeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objeto")
public class HelloObjeto {

	@GetMapping
	public String Objeto() {
		return "As habilidades que eu usei foi a de persistência e atenção ao detalhe.";
	}
	
}