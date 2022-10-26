package com.webapp.springboot.myfirstwebapp.login;




//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {

//	private AuthenticationService authenticationService = new AuthenticationService();
						//    or

	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLogin() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcome(@RequestParam String name, @RequestParam String password, ModelMap model){
		if(authenticationService.authenticate(name, password)) {
			model.put("name",name);
			model.put("password", password);

			return "welcomes";
		}

		model.put("errorMessage","Invalid Credentials! Please try again.");
		return "login";

	}


/*
   private Logger logger = LoggerFactory.getLogger(getClass());


	public String goTOLogin(@RequestParam String name, ModelMap model) {
		model.put("name", name);

		What is the hierarchy of log4j logging?

								DEBUG
								INFO
								WARN
								ERROR
								FATAL

		logger.debug("Request param is {}",name);
		logger.info("I want this printed at info level {}",name);
		logger.warn("I want this printed at info warn {}",name);
		System.out.println("Resquest param is "+name);
		return "login";
	}
	*/

}
