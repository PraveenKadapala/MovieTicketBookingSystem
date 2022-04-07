package com.Online.MovieTicketBooking.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Online.MovieTicketBooking.Model.User;
import com.Online.MovieTicketBooking.Repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository repository;

	@RequestMapping("/")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	@RequestMapping("/checkLogin")
	public ModelAndView checkUser(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		User user=repository.findByUsernameAndPassword(username,password);

		if(Objects.isNull(user))
		{
			ModelAndView mv = new ModelAndView();
			String message="Entered Username or password is wrong / If new user please signup";
			mv.addObject("message", message);
			mv.setViewName("login");
			return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("index");
			return mv;
		}

	}
	@RequestMapping("/addUser")
	public ModelAndView addCustomer(User user)
	{
		try {
			repository.save(user);
			ModelAndView mv = new ModelAndView();
			String message="Signup Succesful";
			mv.addObject("message", message);
			mv.setViewName("login");
			return mv;
		}
		catch(Exception e)
		{
			ModelAndView mv = new ModelAndView();
			String message="Username is already taken choose another username";
			mv.addObject("message", message);
			mv.setViewName("signup");
			return mv;
		}
	}
	
	
}
