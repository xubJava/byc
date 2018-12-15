package com.byc.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.byc.pojo.User;
import com.byc.service.UserService;


//@RestController	//返回json格式
@Controller	
public class userDemo {
	
	@Autowired
	private  UserService userService;

	@RequestMapping("/list")
	@ResponseBody
	public List<User> query(String phone){
		List<User> list = userService.query();
		return list;
	}
	
	
	@RequestMapping("/query")
	public String q(Model mo){
		mo.addAttribute("hh","12");
		return "he";
	}
	
}
