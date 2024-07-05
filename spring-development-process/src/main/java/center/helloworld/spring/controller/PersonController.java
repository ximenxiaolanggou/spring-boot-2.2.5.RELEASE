package center.helloworld.spring.controller;

import center.helloworld.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhishun.cai
 * @create 2024/7/4
 * @note
 */

@Controller
public class PersonController {

	@Autowired
	private PersonService service;

	public void query(){
		service.query();
	}
}
