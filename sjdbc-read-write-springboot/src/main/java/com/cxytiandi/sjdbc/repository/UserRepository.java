package com.cxytiandi.sjdbc.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cxytiandi.sjdbc.po.User;
import org.apache.ibatis.annotations.Param;


/**
 * @author qiaoyn
 */
public interface UserRepository {

	Long addUser(User user);

	List<User> list();

}