package com.gjun.myservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.gjun.domain.Greeting;

//定義Spring Configuration(隨著應用系統啟動 進行初始化配置)
@Configuration
@ComponentScan
public class ApplicationConfig {
	
	public ApplicationConfig() {
		System.out.println("Spring 組態佈署...");
	}
	//宣告一些可以重複使用元件(Spring Bean) Greeting(@Bean SpringBean佈署)
	@Bean("greetings")
	public Greeting createGreeting() {
		//建構個體物件
		Greeting greeting=new Greeting();
		//注定固定資訊
		greeting.setWho("張三丰");
		greeting.setMessage("您好");
		return greeting;
	}
	
	

}
