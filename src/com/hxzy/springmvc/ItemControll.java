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
			List<Item> items=Arrays.asList(new Item(1,"鍐扮",1999,new Date(),"鍐扮寰堝ソ"),new Item(1,"娲楄。鏈�",1999,new Date(),"鍐扮寰堝ソ"));
			mv.addObject("itemlist",items);
			mv.setViewName("item");
			System.out.println("mikeee");
			System.out.println("mim88888");
			
			
			return mv;
		}
}
