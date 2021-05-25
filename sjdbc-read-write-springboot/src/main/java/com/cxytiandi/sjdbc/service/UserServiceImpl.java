package com.cxytiandi.sjdbc.service;

import java.util.List;

import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxytiandi.sjdbc.po.User;
import com.cxytiandi.sjdbc.repository.UserRepository;

/**
 * @author qiaoyn
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getList() {
		// 强制路由主库
		//HintManager.getInstance().setMasterRouteOnly();
		return userRepository.list();
	}

	@Override
	public Long addUser(User user) {
		return userRepository.addUser(user);
	}
}
