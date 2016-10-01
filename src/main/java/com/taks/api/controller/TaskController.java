package com.taks.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskController {
	@RequestMapping("/task")
	@ResponseBody
	public String task(){
		return "funciona";
	}
}