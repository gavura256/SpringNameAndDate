package com.springNameAndDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to read form data and
	// add data to the model
	@RequestMapping("processForm")
	public String letsDoSomeMagic(HttpServletRequest request, Model model) {
		// read the request parameter from the HTTP form
		String theName = request.getParameter("studentName");
		// add message to the model
		model.addAttribute("message", theName);
		return "helloworld";
	}
}
