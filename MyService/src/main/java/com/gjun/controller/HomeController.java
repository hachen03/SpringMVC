package com.gjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//MVC控制器(經由端點 調用樣板下的頁面.html)
@Controller
public class HomeController {
        
	//Action 進行控制流程
	//採用Http Get
	@GetMapping(path="/")
	public String home() {
		//調用頁面
		return "index";
	}
}
