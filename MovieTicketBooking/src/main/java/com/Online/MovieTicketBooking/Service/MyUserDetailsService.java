package com.Online.MovieTicketBooking.Service;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Online.MovieTicketBooking.Model.User;
import com.Online.MovieTicketBooking.Model.Userdet;
import com.Online.MovieTicketBooking.Repository.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userrepo;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user1 =  userrepo.findByUsername(username);
		if (user1 == null) {
			System.out.println("");
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user1.getUsername(), user1.getPassword(),
				new ArrayList<>());
	}

	
	public User save(Userdet user) {
		User newUser = new User();
		newUser.setName(user.getName());
		newUser.setPhoneno(user.getPhoneno());
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));

		 return userrepo.save(newUser);
	}
}