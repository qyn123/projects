package com.cxytiandi.sjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot版 Sharding JDBC 读写分离示列
 * @author qiaoyn
 */
@SpringBootApplication
@MapperScan("com.cxytiandi.sjdbc.repository")
public class ReadWriteJdbcApplicaiton {
	public static void main(String[] args) {
		SpringApplication.run(ReadWriteJdbcApplicaiton.class, args);
	}
}
