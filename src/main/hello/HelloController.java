package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.UserInfo;

@RestController
public class HelloController {

	@RequestMapping("hello")
	public String hello(){
		return "hello Spring boot!";
	}
	
	@RequestMapping("getUser")
	public UserInfo getUser(){
		UserInfo userInfo = new UserInfo();
		userInfo.setUserGenter("男");
		userInfo.setUserName("小明");
		return userInfo;
	}
}
