/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: App.java 
 *
 * @Date:  2019年7月14日  下午7:04:16
 *
 * @Package com.itmayikdu.member.controller
 */


package com.itmayikdu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 付慧芳
 * 将启动的代码抽取出来单独运行
 * 日期：2019年7月14日 下午7:04:16
 *
 * 描述：
 * @version V1.0
 *
 */
//@EnableAutoConfiguration  
//@ComponentScan("com.itmayikdu.member.controller")
//@ComponentScan(basePackages={"com.itmayikdu.member.controller","com.itmayikdu.order.controller"})
@SpringBootApplication   //等于EnableAutoConfiguration+@CompoentScanto同级包和当前包，同级包包含质保
public class App {
	public static void main(String[] args) {
		//整个程序入口，启动SpringBoot项目
		SpringApplication.run(App.class,args);
	}
}
