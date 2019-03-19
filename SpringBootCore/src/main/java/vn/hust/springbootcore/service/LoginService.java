package vn.hust.springbootcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.springbootcore.model.User;
import vn.hust.springbootcore.repository.UserRepository;
@Service
public class LoginService {
	@Autowired
	private UserRepository repository;
	
	public boolean checkLogin(User user) {
		return repository.checkLogin(user);
	}
}
