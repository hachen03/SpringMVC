package com.study.springmvc.case02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/case02/redirect")
public class RedirectController {
        // 重定向 redirect
	    // 由 server 端發出 redirect 命令(會放在header中)給client端,並由client端去執行
	    // 所以 client端的瀏覽器網址會改變
	    // 重定向可以指向內網與外網
	
	@RequestMapping("/demo1")
	public String demo1() {
		return "redirect:/index.jsp";
	}
    
	  //Lab(demo2)我要透過redirect:重定向到show_time.jsp要如何寫?
	  // http://localhost:8080/springmvc/mvc/case02/redirect/demo2
      // http://localhost:8080/springmvc/mvc/case02/time/now
	@RequestMapping("/demo2")
	public String demo2() {
		// return "redirect:/mvc/case02/time/now"; //絕對路徑
		return "redirect:../time/now"; //相對路徑
	}
	@RequestMapping("/demo3")
	public String demo3() {
		return "redirect:http://tw.yahoo.com"; //外網
	}
	//重定向帶參數 I
	@RequestMapping("/demo4")
	public String case4() {
		  return "redirect:/show_param.jsp?username=Vincent&age=18";
	}
	//重定向帶參數 II
	@RequestMapping("/demo5")
	public String case5(RedirectAttributes attr) {
		  attr.addAttribute("username","Anita");
		  attr.addAttribute("age",19);
		  return "redirect:/show_param.jsp";
	}
	//重定向帶參數 III(addFlashAttributes)
	// http://localhost:8080/springmvc/mvc/case02/redirect/saveOrder?name=iPhone&price=25000&qty=5
	@RequestMapping("/saveOrder")
	public String saveOrder(@RequestParam("name") String name,
			                @RequestParam("price") Integer price,
			                @RequestParam("qty") Integer qty,
			                RedirectAttributes attr) {
		attr.addFlashAttribute("name", name);
		attr.addFlashAttribute("price", price);
		attr.addFlashAttribute("qty", qty);
		  return "redirect:./success";
	}
	@RequestMapping("/success")
	public String saveOrder() {
		  return "case02/order_ok";
	}
}
