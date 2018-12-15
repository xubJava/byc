package com.byc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@MapperScan("com.byc.dao")//必须加这个，不加报错，如果不加，也可以在每个Dao上添加@Mapper注释，并且这里还要多填一个注释，那个我忘了，我一直用这个注解
//@EnableTransactionManagement 	//开启事务
@SpringBootApplication
public class ceshi {
	@RequestMapping("/home")
	@ResponseBody
	public String home(){
		return "Hello SpringBoot";
	}
	
	
	public static void main(String[] args) {
		String a = "aaaaa啊啊啊啊啊";
		System.out.println(a);
		SpringApplication.run(ceshi.class, args);
	}
	
}
