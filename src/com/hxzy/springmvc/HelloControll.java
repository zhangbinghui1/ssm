package com.hxzy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControll {
	
	@RequestMapping("Hello")
	public ModelAndView hello() {
		ModelAndView mv=new ModelAndView();
		
		//设置模型数据
		mv.addObject("msg","hello springmvc");
		//设置视图
		mv.setViewName("hello");
		System.out.println("hellp");
		return mv;
	}

}
