package es.aylait.sakilademo.film.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import es.aylait.sakilademo.film.domain.Staff;

public interface StaffRepository extends JpaRepository<Staff,Long> {
	public Staff findByUsername(String username);
}
