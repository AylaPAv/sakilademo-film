package es.aylait.sakilademo.film.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Data
@NoArgsConstructor
@Table(name="staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="staff_id")
	private Long id;
	
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="address_id")
	private Long addressId;
	
	private String email;
	
	@Column(name="store_id")
	private Long storeId;
	
	private Boolean active;
	
	private String username;
	public String getUsername() {
		return this.username;
	}
	private String password;
	public String getPassword() {
		return this.password;
	}
	
	@Column(name="last_update")
	private LocalDateTime lastUpdate;
	
	private byte[] picture;
}
