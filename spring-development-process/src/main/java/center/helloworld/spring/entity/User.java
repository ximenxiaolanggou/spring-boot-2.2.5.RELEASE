package center.helloworld.spring.entity;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */
public class User {

	private Integer id;

	private String username;


	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				'}';
	}

	public User() {

	}

	public User(Integer id, String username) {
		this.id = id;
		this.username = username;
	}

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
