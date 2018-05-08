package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/hello")
public class FirstController2 {
    @RequestMapping(value="/firstController2")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception {
		// TODO 自动生成的方法存根
    	model.addAttribute("msg","this is my two first mvc program!");
    	return "first";
	}
    
}
