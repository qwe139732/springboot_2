package com.accp.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c")
public class IndexAction {
	
	@RequestMapping("index")
	public String show(Model model) {
		List<String> data = new ArrayList<String>();
		data.add("阿杜");
		data.add("阿乱");
		data.add("阿庆");
		model.addAttribute("data",data);
		return "index";
	}
}
