package br.com.caelum.fj22estudos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TesteDiretoController {
	@GetMapping("/livros/testeDireto")
	public ModelAndView testeDireto() {
        return new ModelAndView("/livros/testeDireto");
	}
	
}
