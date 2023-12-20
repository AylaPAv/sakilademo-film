package es.aylait.sakilademo.film.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.aylait.sakilademo.film.domain.Language;

@Service("languageService")
public class LanguageService {
	@Autowired
	private LanguageRepository languageRepository = null;
	
	@Autowired
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public Iterable<Language> findAll(){
		return languageRepository.findAll();
	}
	
	public Language addLanguage(Language language) {
		return languageRepository.save(language);
	}
	
	public Optional<Language> findById(Long id) {
		return languageRepository.findById(id);
	}
}
