package com.webapp.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello Anket Pratap Singh";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHTML() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First HTML Page With Body.");
		sb.append("<br>");
		sb.append("<br>");
		sb.append("  Hello Anket Pratap Singh");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}

	@RequestMapping("say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}

}
