package es.aylait.sakilademo.film.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.aylait.sakilademo.film.domain.Language;

@Repository("languageRepository")
public interface LanguageRepository extends JpaRepository<Language, Long>{
	public Optional<Language> findById(Long id);
}
