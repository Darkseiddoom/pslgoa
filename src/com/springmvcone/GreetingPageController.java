package com.springmvcone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingPageController {

	@RequestMapping(path = "/greet.do", method = RequestMethod.GET)
	public String greet(@RequestParam("name") String nm, Model model) {
		String msg = "Hello world!!!!!!";
		model.addAttribute("msg", msg);
		model.addAttribute("name", nm);
		return "greetpage";
	}

	@RequestMapping(path = "/psl.do", method = RequestMethod.GET)
	public String greetx() {
		return "sayhello";
	}

	@RequestMapping(path="/topics.do",method = RequestMethod.GET)
	public String Topics(Model model)
	{
		String topics[]= {"Java", "C++", "React", "COBOL"};
		model.addAttribute("topics", topics);
		return "topicspage";
	}

	@RequestMapping(path="/show.do/{name}",method = RequestMethod.GET)
	public String show(@PathVariable("name") String name, Model model)
	{
		model.addAttribute("name", name);
		return "show";
	}
}
