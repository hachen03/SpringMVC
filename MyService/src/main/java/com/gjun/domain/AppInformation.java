package com.gjun.domain;

import org.springframework.web.bind.annotation.RestController;

//JavaBean
@RestController
public class AppInformation {
    //封裝欄位/空參數架構子/實作序列化界面/setter getter
	   private String appName;
	   private String copyLight;
	   private String address;
	   // 自訂建構子
	   public AppInformation() {
		   System.out.println("AppInformation物件產生");
	   }
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getCopyLight() {
		return copyLight;
	}
	public void setCopyLight(String copyLight) {
		this.copyLight = copyLight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	   
}
