package es.aylait.sakilademo.film.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.aylait.sakilademo.film.domain.Staff;

@Service("staffService")
public class StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
	
	public Staff getStaffByUsername(String username) {
		return staffRepository.findByUsername(username);
	}
}
