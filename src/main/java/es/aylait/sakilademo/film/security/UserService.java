package es.aylait.sakilademo.film.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import es.aylait.sakilademo.film.domain.Staff;
import es.aylait.sakilademo.film.persistence.StaffService;

public class UserService implements UserDetailsService {

	private StaffService staffService;
	
	@Autowired
	private UserDetails userDetails;
	
	@Autowired
	public UserService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Staff response = staffService.getStaffByUsername(username);
		
		if(response != null) {
			this.userDetails = new org.springframework.security.core.userdetails.User(response.getUsername(), response.getPassword(), null);
		}
		
		return this.userDetails;
	}
}