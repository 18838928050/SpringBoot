/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: OrderController.java 
 *
 * @Date:  2019年7月14日  下午7:13:20
 *
 * @Package com.itmayikdu.order.controller
 */


package com.itmayikdu.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月14日 下午7:13:20
 *
 * 描述：
 * @version V1.0
 *
 */
@RestController
public class OrderController {
 
	@RequestMapping("/orderIndex")
	public String orderIndex() {
		return "orderIndex";
		
	}
	
}
