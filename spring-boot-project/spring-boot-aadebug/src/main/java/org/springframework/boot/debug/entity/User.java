package org.springframework.boot.debug.entity;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
public class User {
	private Integer id;

	private String username;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
