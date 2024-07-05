package center.helloworld.spring.service;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@Service
public class UserService {

	private String username;

	public String getUsername() {
		return username;
	}

	@Required
	public void setUsername(String username) {
		this.username = username;
	}
}
