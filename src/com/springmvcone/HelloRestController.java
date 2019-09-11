package com.springmvcone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping(path="/hello.do", method=RequestMethod.GET)
	public String[] sayhello() {
		String[] topics= {"java","JSP","Spring"};
		//return "<h1>hello..........Rest</h1>";
		return topics;
	}
}
