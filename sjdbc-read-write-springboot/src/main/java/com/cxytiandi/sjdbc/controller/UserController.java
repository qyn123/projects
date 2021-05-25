package com.cxytiandi.sjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cxytiandi.sjdbc.po.User;
import com.cxytiandi.sjdbc.service.UserService;

/**
 * spring-boot集成sharding-jdbc实现读写分离
 * @author qiaoyn
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public Object list() {
		return userService.getList();
	}
	
	@PostMapping("/add")
	public Object add(@RequestBody User user) {
		return userService.addUser(user);
	}
	
}
