package br.com.caelum.fj22estudos.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.fj22estudos.dao.LivrosDao;
import br.com.caelum.fj22estudos.modelo.Livros;


@Controller
public class LivrosController {
	private LivrosDao livrosDao;
	
	@GetMapping("/livros/livros")
	public ModelAndView testeDireto() {
        return new ModelAndView("/livros/livros");
	}

	
	@PostMapping("/livros/livros")
    @Transactional
    public ModelAndView salva(@Valid Livros livros, BindingResult result){

       // if (result.hasErrors()) {
       //     return form(Optional.ofNullable(livros.getCdLivro()), livros);
       // }

        //livrosDao.save(livros);

        ModelAndView view = new ModelAndView("redirect:/livros/lista");

        return view;
    }


    @GetMapping(value="/livros/lista")
    public ModelAndView lista(){

        ModelAndView modelAndView = new ModelAndView("livros/lista");

        modelAndView.addObject("livros", livrosDao.BuscaTodos());

        return modelAndView;
    }


}
