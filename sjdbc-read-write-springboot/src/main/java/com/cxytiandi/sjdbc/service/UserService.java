package com.cxytiandi.sjdbc.service;

import java.util.List;

import com.cxytiandi.sjdbc.po.User;

/**
 * @author qiaoyn
 */
public interface UserService {

	List<User> getList();
	
	Long addUser(User user);
	
}
