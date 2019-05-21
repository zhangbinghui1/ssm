package com.hxzy.springmvc;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.pojo.Item;

@Controller
public class ItemControll {
		@RequestMapping("list")
		public ModelAndView getList() {
			ModelAndView mv=	new ModelAndView();
			List<Item> items=Arrays.asList(new Item(1,"冰箱",1999,new Date(),"冰箱很好"),new Item(1,"洗衣机",1999,new Date(),"冰箱很好"));
			mv.addObject("itemlist",items);
			mv.setViewName("item");
			
			
			return mv;
		}
}
