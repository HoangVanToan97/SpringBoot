package vn.hust.springbootcore.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hust.springbootcore.model.User;
import vn.hust.springbootcore.service.JSONService;

@RestController
public class JSONController {
	@Autowired
	private JSONService service;
	@RequestMapping("data/json")
	public ArrayList<User> getAll() {
		return service.getAll();
	}

}
