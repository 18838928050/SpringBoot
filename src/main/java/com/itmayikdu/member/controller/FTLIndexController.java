/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: FTLIndexController.java 
 *
 * @Date:  2019年7月14日  下午7:56:34
 *
 * @Package com.itmayikdu.member.controller
 */


package com.itmayikdu.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月14日 下午7:56:34
 *
 * 描述：
 * @version V1.0
 *
 */
@Controller
public class FTLIndexController {

	@RequestMapping("/fltIndex")
	public String ftlIndex(){
		return "ftlIndex";
	}
	
}
