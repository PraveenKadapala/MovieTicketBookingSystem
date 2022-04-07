package com.Online.MovieTicketBooking.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Online.MovieTicketBooking.Model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByUsernameAndPassword(String username,String Password);

}
