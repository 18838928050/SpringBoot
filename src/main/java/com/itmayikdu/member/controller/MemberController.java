package com.itmayikdu.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月14日 上午8:57:45
 *
 * 描述：
 * @version V1.0
 *
 */
@RestController
@EnableAutoConfiguration
public class MemberController{

//	@RestController表示该类中的所有方法都会返回json格式 等于类的上面是@Controller
	//+方法的上面是@ResponseBody
	//@EnableAutoConfiguration  自动配置  扫包范围：默认在当前类里面
	@RequestMapping("/memberIndex")
	public String  memberIndex(){
		return "springboot2.0全新教程";
	}
	public static void main(String[] args) {
		//整个程序入口，启动SpringBoot项目
		SpringApplication.run(MemberController.class,args);
	}
}
