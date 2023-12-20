package es.aylait.sakilademo.film.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.aylait.sakilademo.film.domain.Language;
import es.aylait.sakilademo.film.handlexception.ResourceNotFoundException;
import es.aylait.sakilademo.film.persistence.LanguageService;

@RestController
@RequestMapping("/film/api")
public class FilmController {
	
	private LanguageService languageService;
	
	@Autowired
	public FilmController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/languages")
	public Iterable<Language> findAll(){
		return languageService.findAll();
	}
	
	@GetMapping("/languages/{id}")
	public Optional<Language> findById(@PathVariable Long id) {
		Optional<Language> response =  languageService.findById(id);
		if (!response.isPresent()) throw new ResourceNotFoundException(String.format("No S'ha trovat el registre amb id %s", id));
		
		return response;
	}
}
