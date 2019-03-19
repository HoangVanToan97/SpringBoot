package vn.hust.springbootcore.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.hust.springbootcore.model.User;
import vn.hust.springbootcore.repository.UserRepository;
@Service
public class JSONService {
	@Autowired
	private UserRepository repository;

	public ArrayList<User> getAll() {
		return repository.getAll();
	}
}
