package com.cxytiandi.sjdbc.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author qiaoyn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = -1205226416664488559L;
	
	private Long id;

	private String city;
	
	private String name;
	
}
