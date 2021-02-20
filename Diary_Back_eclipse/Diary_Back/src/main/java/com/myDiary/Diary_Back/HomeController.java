package com.myDiary.Diary_Back;

import java.text.DateFormat;  
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


import org.springframework.web.bind.annotation.RequestBody;
/**
 * Handles requests for the application home page.
 */

//@Controller
//@RequestMapping(value = "/board")
//public class HomeController {
//
//	@RequestMapping(value = "/list/{id}", method=RequestMethod.GET)
//	@ResponseBody() // JSON
//	public Map<String, String> home(@PathVariable String id) {
//	
//		Map<String, String> list = new HashMap<String, String>();
//		
//		list.put("id", id);
//		list.put("pw", "codevang123");
//		list.put("location", "SEOUL");
//		
//		return list;
//	}
//}

@Controller

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping(value = "/list/{id}", method=RequestMethod.GET)
	@ResponseBody() // JSON
	public Map<String, String> home1(@PathVariable String id) {
		
		Map<String, String> list = new HashMap<String, String>();
		
		list.put("id", id);
		list.put("pw", (Integer.valueOf(id) + 3) + "");
		list.put("location", "SEOUL");
		
		return list;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> home(@RequestBody Map<String, String> list) {

		// 내용이 잘 들어왔는지 테스트
		String id = list.get("id");
		String pw = list.get("pw");
		System.out.println(id + " : " + pw);
		
		// 내용 변경해서 리턴
		list.replace("id", id + "response");
		list.replace("pw", pw + "response");
		
		return list;
	}
	
	
	@RequestMapping(value = "/list/put/{id}/{pw}", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String, String> homePut(@RequestBody Map<String, String> list) {

		// 내용이 잘 들어왔는지 테스트
		String id = list.put("id", "2");
		String pw = list.put("pw", "www");
		System.out.println(id + " : " + pw);
		
		// 내용 변경해서 리턴
		list.replace("id", id + "response");
		list.replace("pw", pw + "response");
		
		return list;
	}
	
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
}
