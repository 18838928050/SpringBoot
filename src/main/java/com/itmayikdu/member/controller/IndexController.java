/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: IndexController.java 
 *
 * @Date:  2019年7月14日  下午7:03:26
 *
 * @Package com.itmayikdu.member.controller
 */


package com.itmayikdu.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月14日 下午7:03:26
 *
 * 描述：
 * @version V1.0
 *
 */
@RestController
public class IndexController {

	@RequestMapping("/index")
	public String index(){
		return "index springboot index";
	}
}
