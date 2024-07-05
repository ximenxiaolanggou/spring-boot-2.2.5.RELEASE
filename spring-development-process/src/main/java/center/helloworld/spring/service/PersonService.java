package center.helloworld.spring.service;

import center.helloworld.spring.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;

	public void query() {
		personDao.query();
	}
}
