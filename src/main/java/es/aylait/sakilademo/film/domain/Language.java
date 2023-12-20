package es.aylait.sakilademo.film.domain;

import lombok.NoArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table; 

@Entity
@Data
@Table(name = "language")
@NoArgsConstructor
public class Language {
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "language_id")
	private Long id;
	
	private String name;
	@Column(name = "last_update")
	private LocalDateTime lastUpdate;
	private void setLastUpdate(LocalDateTime localDate) {
		this.lastUpdate = localDate;
	}
	
	@PrePersist
	void onCreate(){
		this.setLastUpdate(LocalDateTime.now());
	}
	
	@PreUpdate
	void onUpdate() {
		this.setLastUpdate(LocalDateTime.now());
	}
	
}