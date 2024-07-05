package center.helloworld.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@Repository
public class PersonDao {

	public void query(){
		System.out.println("dao query ..." );
	}
}
