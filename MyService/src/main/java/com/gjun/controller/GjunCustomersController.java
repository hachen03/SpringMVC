package com.gjun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 客戶資料服務
@RestController
public class GjunCustomersController {

	   //傳遞客戶編號 進行單一客戶資料查詢服務作業 參數傳遞採用QueryString
	   //採用Request method-GET
	   @GetMapping(path= {"/customers/qry","/customers/qryid"})
	   public String customersQryById(String customerId) {
		   //確認是否傳遞合法客戶編號
		   //2.透過注入的Data Source(or DAO物件模組)進行查詢
		   //3.將查詢結果序列化為Json(Status code-200)
		   //3.2 找不到是否回應不同的Json文件格式(不同Http Status code-400)
		   return customerId;
	   }
	   //特定前端參數名稱應對
	   @GetMapping(path= {"/customers/qry2","/customers/qryid2"})
	   public String customersQryById2(@RequestParam("cid")String customerId) {
		   //確認是否傳遞合法客戶編號
		   //2.透過注入的Data Source(or DAO物件模組)進行查詢
		   //3.將查詢結果序列化為Json(Status code-200)
		   //3.2 找不到是否回應不同的Json文件格式(不同Http Status code-400)
		   return customerId;
	   }
	   //傳遞參數 可以依照客戶編號 或者再配合國家別進行細部查詢
	   @GetMapping(path= {"/customers/customerid/orcountry"})
	   public String customersQryById3(@RequestParam("cid")String customerId,
			   @RequestParam(name="country",required=false)String country) {
		   //確認是否傳遞合法客戶編號
		   //2.透過注入的Data Source(or DAO物件模組)進行查詢
		   //3.將查詢結果序列化為Json(Status code-200)
		   //3.2 找不到是否回應不同的Json文件格式(不同Http Status code-400)
		   return customerId+" "+country;
	   }
	 //傳遞參數 可以依照國家別 沒有傳遞預設為USA
	   @GetMapping(path= {"/customers/country"})
	   public String customersQryByCountry(@RequestParam(name="country",defaultValue ="USA")String country) {
		   //確認是否傳遞合法客戶編號
		   //2.透過注入的Data Source(or DAO物件模組)進行查詢
		   //3.將查詢結果序列化為Json(Status code-200)
		   //3.2 找不到是否回應不同的Json文件格式(不同Http Status code-400)
		   return country;
	   }
}
